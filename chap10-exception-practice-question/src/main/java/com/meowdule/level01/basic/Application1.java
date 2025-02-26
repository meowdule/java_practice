package com.meowdule.level01.basic;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         * 분자 입력 : 10
         * 분모 입력 : 2
         *
         * ----- 출력 예시 -----
         * 결과 : 5
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         * 분자 입력 : 십
         *
         * ----- 출력 예시 -----
         * 오류 : 유효한 정수를 입력하세요.
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         * 분자 입력 : 10
         * 분모 입력 : 0
         *
         * ----- 출력 예시 -----
         * 오류 : 0으로 나누는 것은 허용되지 않습니다.
         * 실행이 완료되었습니다.
         */
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("분자 입력 : ");
            int molecular = Integer.parseInt(sc.nextLine());

            System.out.print("분모 입력 : ");
            int denominator = Integer.parseInt(sc.nextLine());

            if (denominator == 0) {
                throw new ArithmeticException("오류 : 0으로 나누는 것은 허용되지 않습니다.");
//                System.out.println("");
            }
            System.out.println("결과 : " + (molecular / denominator));
        } catch (NumberFormatException e) {
            System.out.println("오류 : 유효한 정수를 입력하세요.");
        } catch (ArithmeticException e) {
            System.out.println( e.getMessage());
        }finally {
            System.out.println("실행이 완료되었습니다.");
            sc.close();
        }

    }
}

