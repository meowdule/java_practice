package com.meowdule.level01.basic;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        StringBuilder strResult = new StringBuilder();

        for(int i = 0; i < strSplit.length; i++) {
            char firstChar = strSplit[i].charAt(0);

            // 아스키코드를 이용해 첫 글자를 대문자로 변환
            if (firstChar >= 'a' && firstChar <= 'z') {
                firstChar = (char) (firstChar - 32);
            }

            // 변환된 첫 글자 + 나머지 문자열 추가
            strResult.append(firstChar).append(strSplit[i].substring(1)).append(" ");
        }
        System.out.println("변환된 문자열 : " + strResult);
        System.out.println("총 단어 갯수 : " + strSplit.length);
    }
}