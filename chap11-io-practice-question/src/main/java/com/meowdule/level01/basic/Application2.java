package com.meowdule.level01.basic;

import java.io.*;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         * (원본 파일이 존재 하는 경우)
         * 원본 파일의 이름을 입력하세요 : origin.txt
         * 복사 파일의 이름을 입력하세요 : copy.txt
         *
         * ----- 출력 예시 -----
         * 파일 복사가 성공적으로 완료 되었습니다.
         *
         * ----- 입력 예시 -----
         * (원본 파일이 존재하지 않는 경우)
         * 원본 파일의 이름을 입력하세요 : origin2.txt
         * 복사 파일의 이름을 입력하세요 : copy2.txt
         *
         * ----- 출력 예시 -----
         * 오류 : origin2.txt (지정된 파일을 찾을 수 없습니다)
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("원본 파일의 이름을 입력하세요 : ");
        String originalFile = sc.nextLine();
        System.out.print("복사 파일의 이름을 입력하세요 : ");
        String copyFile = sc.nextLine();

        try (FileInputStream fis = new FileInputStream(originalFile);
             FileOutputStream fos = new FileOutputStream(copyFile)) {
            byte[] buffer = new byte[1024]; // 1KB씩 읽어서 복사
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) { // EOF까지 읽기
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("파일 복사가 성공적으로 완료 되었습니다.");
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println("오류 : " + originalFile + " (지정된 파일을 찾을 수 없습니다)");
        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
    }
}