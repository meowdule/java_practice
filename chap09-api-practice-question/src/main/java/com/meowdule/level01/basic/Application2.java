package com.meowdule.level01.basic;

import java.util.Scanner;
import java.util.Arrays;

public class Application2 {

    public static void main(String[] args) {

        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
         *
         * ----- 출력 예시 -----
         *
         * ===== 단어 빈도 =====
         * hello: 2
         * world: 1
         * everyone: 1
         * 가장 빈도 높은 단어 : hello (2 번)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String input = scanner.nextLine();

        // String[] words = input.split(" ");
        // 앞뒤 공백 제거 및 연속된 공백을 하나의 구분자로 처리
        String[] words = input.trim().split("\\s+");
        String[] uniqueWords = new String[words.length];
        int[] wordCounts = new int[words.length];
        int uniqueIndex = 0;

        for (String word : words) {
            word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");

            if (!word.isEmpty()) {
                boolean found = false;
                for (int i = 0; i < uniqueIndex; i++) {
                    if (uniqueWords[i].equals(word)) {
                        wordCounts[i]++;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    uniqueWords[uniqueIndex] = word;
                    wordCounts[uniqueIndex] = 1;
                    uniqueIndex++;
                }
            }
        }

        String mostFrequentWord = null;
        int maxCount = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < uniqueIndex; i++) {
            result.append(uniqueWords[i]).append(": ").append(wordCounts[i]).append("\n");

            if (wordCounts[i] > maxCount) {
                maxCount = wordCounts[i];
                mostFrequentWord = uniqueWords[i];
            }
        }

        // 확인을 위한 출력문
        System.out.println("Arrays.toString(words) : " + Arrays.toString(words));
        System.out.println("Arrays.toString(uniqueWords) : " + Arrays.toString(uniqueWords));
        System.out.println("Arrays.toString(wordCounts) : " + Arrays.toString(wordCounts));

        System.out.println("===== 단어 빈도 =====");
        System.out.println(result);
        System.out.println("가장 빈도 높은 단어 : " + mostFrequentWord + " (" + maxCount + " 번)");
    }
}