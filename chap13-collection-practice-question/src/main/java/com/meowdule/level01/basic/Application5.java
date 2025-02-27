package com.meowdule.level01.basic;

import java.util.Set;
import java.util.Scanner;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) {
        /* 사용자가 입력한 단어들을 사전 순으로 정렬한 후 출력하는 프로그램*/
        Scanner sc = new Scanner(System.in);
        Set<String> dictWord = new TreeSet<>();
        while (true) {
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("정렬 된 단어 : " + dictWord);
                break;
            } else {
                dictWord.add(input);
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
        sc.close();
    }
}
