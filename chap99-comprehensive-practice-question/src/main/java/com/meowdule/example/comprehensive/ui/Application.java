package com.meowdule.example.comprehensive.ui;

import com.meowdule.example.comprehensive.domain.BloodType;
import com.meowdule.example.comprehensive.domain.User;
import com.meowdule.example.comprehensive.persistence.FileUserStorage;
import com.meowdule.example.comprehensive.persistence.UserRepository;
import com.meowdule.example.comprehensive.service.UserService;

import java.util.Scanner;

/* 실행 및 UI */
public class Application {
    private final UserService userService;
    private final Scanner scanner;

    public Application() {
        UserRepository userRepository = new UserRepository(new FileUserStorage());
        this.userService = new UserService(userRepository);
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("\n===== 회원 관리 프로그램 =====");
            System.out.println("1. 모든 회원 조회");
            System.out.println("2. 회원 찾기");
            System.out.println("3. 회원 가입");
            System.out.println("4. 회원 정보 수정");
            System.out.println("5. 회원 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1 -> showAllUsers();
                    case 2 -> findUserByNo();
                    case 3 -> registerUser();
                    case 4 -> modifyUser();
                    case 5 -> removeUser();
                    case 9 -> {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    }
                    default -> System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                }
            } catch (Exception e) {
                System.out.println("오류: " + e.getMessage());
            }
        }
    }

    private void showAllUsers() {
        userService.findAllUsers().forEach(System.out::println);
    }

    private void findUserByNo() {
        System.out.print("조회할 회원 번호 입력: ");
        int no = scanner.nextInt();
        scanner.nextLine();

        User user = userService.findUserByNo(no);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("해당 번호의 회원을 찾을 수 없습니다.");
        }
    }

    private void registerUser() {
        try {
            System.out.print("아이디 입력: ");
            String id = scanner.nextLine();

            System.out.print("비밀번호 입력: ");
            String pwd = scanner.nextLine();

            System.out.print("나이 입력: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            String[] hobbies = inputHobbies();

            System.out.print("혈액형 입력 (A, AB, B, O): ");
            BloodType bloodType = BloodType.fromString(scanner.nextLine());

            int nextUserNo = userService.findAllUsers().size() + 1;
            User newUser = new User(nextUserNo, id, pwd, age, hobbies, bloodType);

            userService.registerUser(newUser);
            System.out.println("회원 가입 성공: " + id);

        } catch (IllegalArgumentException e) {
            System.out.println("회원 가입 실패: " + e.getMessage());
        }
    }

    private void modifyUser() {
        try {
            System.out.print("수정할 회원 번호 입력: ");
            int no = scanner.nextInt();
            scanner.nextLine();

            User existingUser = userService.findUserByNo(no);
            if (existingUser == null) {
                System.out.println("해당 번호의 회원을 찾을 수 없습니다.");
                return;
            }

            System.out.print("비밀번호 확인: ");
            String currentPassword = scanner.nextLine();

            System.out.println("수정할 정보를 입력하세요 (변경하지 않으려면 Enter 입력)");
            System.out.print("새로운 아이디 (" + existingUser.getId() + "): ");
            String id = scanner.nextLine();
            if (id.isEmpty()) id = existingUser.getId();

            System.out.print("새로운 비밀번호 입력 (비밀번호 변경 시 입력, 아니면 Enter): ");
            String newPassword = scanner.nextLine();
            if (newPassword.isEmpty()) newPassword = existingUser.getPwd();

            System.out.print("새로운 나이 (" + existingUser.getAge() + "): ");
            String ageInput = scanner.nextLine();
            int age = ageInput.isEmpty() ? existingUser.getAge() : Integer.parseInt(ageInput);

            String[] hobbies = inputHobbies();

            System.out.print("새로운 혈액형 (" + existingUser.getBloodType() + "): ");
            String bloodTypeInput = scanner.nextLine();
            BloodType bloodType = bloodTypeInput.isEmpty() ? existingUser.getBloodType() : BloodType.fromString(bloodTypeInput);

            User updatedUser = new User(no, id, newPassword, age, hobbies, bloodType);
            userService.modifyUser(updatedUser, currentPassword);
            System.out.println("회원 정보 수정 완료: " + id);

        } catch (IllegalArgumentException e) {
            System.out.println("회원 정보 수정 실패: " + e.getMessage());
        }
    }

    private void removeUser() {
        try {
            System.out.print("삭제할 회원 번호 입력: ");
            int no = scanner.nextInt();
            scanner.nextLine();

            userService.removeUser(no);
            System.out.println("회원 삭제 완료 (ID: " + no + ")");

        } catch (IllegalArgumentException e) {
            System.out.println("회원 삭제 실패: " + e.getMessage());
        }
    }

    private String[] inputHobbies() {
        System.out.print("취미 개수 입력: ");
        int hobbyCount = scanner.nextInt();
        scanner.nextLine();

        String[] hobbies = new String[hobbyCount];
        for (int i = 0; i < hobbyCount; i++) {
            System.out.print("취미 입력 (" + (i + 1) + "/" + hobbyCount + "): ");
            hobbies[i] = scanner.nextLine();
        }
        return hobbies;
    }

    public static void main(String[] args) {
        new Application().run();
    }
}