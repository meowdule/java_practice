package com.meowdule.level01.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /* ----- 입력 예시 -----
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2014-05-05
         *
         * ----- 출력 예시 -----
         * 만 20세 미만은 입장 불가입니다.
         *
         * ----- 입력 예시 -----
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 1994-05-05
         *
         * ----- 출력 예시 -----
         * 입장하셔도 됩니다.
         *
         * ----- 입력 예시 -----
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2000-14-15
         *
         * ----- 출력 예시 -----
         * 날짜 양식을 잘못 입력하셨습니다.
         */
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false); // 엄격한 날짜 검증

        try {
            System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
            String inputBirth = sc.nextLine();

            Date birthDate = dateFormat.parse(inputBirth);

            int age = 2025 - Integer.parseInt(inputBirth.substring(0, 4)) + 1;

            if (age < 20) {
                throw new IllegalArgumentException("만 20세 미만은 입장 불가입니다.");
            }
            System.out.println("입장하셔도 됩니다.");
        } catch (ParseException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }

    }

}