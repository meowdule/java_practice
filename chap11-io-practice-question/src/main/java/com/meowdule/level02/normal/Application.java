package com.meowdule.level02.normal;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fileNum;
        try {
            System.out.print("병합할 파일의 개수 입력 : ");
            fileNum = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 처리\
        } catch (InputMismatchException e) { // 🔹 숫자가 아닌 값 입력 시 강제 종료
            System.out.println("오류: 숫자가 아닌 값이 입력되었습니다. 프로그램을 종료합니다.");
            scanner.close();
            return;
        }

        String[] files = new String[fileNum];

        // 🔹 파일 존재 여부 확인
        for (int i = 0; i < fileNum; i++) {
            System.out.print((i + 1) + " 번째 파일 이름 입력 : ");
            files[i] = scanner.nextLine();

            File file = new File(files[i]);
            if (!file.exists() || !file.isFile()) { // 🔹 파일이 존재하지 않으면 즉시 종료
                System.out.println("오류: " + files[i] + " (지정된 파일을 찾을 수 없습니다)");
                scanner.close();
                return;
            }
        }

        System.out.print("병합 될 파일명 입력 : ");
        String resultFileName = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(resultFileName, false))) { // 🔹 기존 파일 덮어쓰기
            for (String file : files) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) { // 🔹 한 줄씩 읽기
                        writer.write(line);
                        writer.newLine(); // 🔹 줄 바꿈 추가
                    }
                }
            }
            System.out.println("파일 병합이 성공적으로 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("오류: 병합 파일을 작성하는 중 문제가 발생했습니다.");
        } finally {
            scanner.close();
        }
    }
}
