package com.meowdule.practice.comprehensive.ui;

import com.meowdule.practice.comprehensive.repository.*;
import com.meowdule.practice.comprehensive.service.TestService;
import com.meowdule.practice.comprehensive.domain.TestScoreInterpretation;
import com.meowdule.practice.comprehensive.domain.TestResult;
import com.meowdule.practice.comprehensive.user.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 애플리케이션 실행 클래스
 */
public class Application {
    private final Scanner scanner = new Scanner(System.in);
    private final UserService userService;
    private final TestService testService;
    private final List<TestScoreInterpretation> tests = new ArrayList<>();

    public Application() {
        UserStorage userStorage = new UserRepository(); // 파일 기반 저장소 사용
        UserManagementService userManagementService = new UserManagementService(userStorage);
        UserTestHistoryService userTestHistoryService = new UserTestHistoryService(userStorage, userManagementService);
        this.userService = new UserService(userManagementService, userTestHistoryService);
        this.testService = new TestService(userService);

        // 모든 테스트 자동 등록
        tests.add(new PHQTest());
        tests.add(new AUDITTest());
        tests.add(new BAITest());
    }

    public void start() {
        while (true) {
            System.out.println("\n=== 자가진단 테스트 시스템 ===");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 로그아웃");
            System.out.println("4. 테스트 실행");
            System.out.println("5. 검사 기록 조회");
            System.out.println("0. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> registerUser();
                case 2 -> loginUser();
                case 3 -> logoutUser();
                case 4 -> runTest();
                case 5 -> viewTestHistory();
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }

    private void registerUser() {
        System.out.print("사용자 ID: ");
        String userId = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("나이: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        userService.registerUser(userId, password, name, age);
    }

    private void loginUser() {
        System.out.print("사용자 ID: ");
        String userId = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();
        userService.loginUser(userId, password);
    }

    private void logoutUser() {
        userService.logoutUser();
    }

    private void runTest() {
        if (!userService.isUserLoggedIn()) {
            System.out.println("로그인이 필요합니다.");
            return;
        }

        System.out.println("\n=== 테스트 목록 ===");
        for (int i = 0; i < tests.size(); i++) {
            System.out.println((i + 1) + ". " + tests.get(i).getTestType().getDisplayName());
        }
        System.out.print("실행할 테스트를 선택하세요: ");

        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice < 1 || choice > tests.size()) {
            System.out.println("잘못된 선택입니다.");
            return;
        }

        TestScoreInterpretation selectedTest = tests.get(choice - 1);
        TestResult result = testService.startTest(selectedTest);
        if (result != null) {
            System.out.println("\n=== 테스트 결과 ===");
            System.out.println("총 점수: " + result.getTotalScore() + " / " + result.getMaxScore());
            System.out.println("결과: " + result.getResult());
        }
    }

    private void viewTestHistory() {
        if (!userService.isUserLoggedIn()) {
            System.out.println("로그인이 필요합니다.");
            return;
        }
        userService.viewTestHistory();
    }

    public static void main(String[] args) {
        new Application().start();
    }
}
