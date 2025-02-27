package com.meowdule.level01.basic;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* 학생들의 점수를 입력받아 저장한 후, 평균 점수를 계산하여 출력하는 프로그램 */
        Scanner sc = new Scanner(System.in);
        List<Integer> scoreList = new ArrayList();
        double totalScore = 0;
        boolean IsAddTrue = true;
        while (IsAddTrue) {
            System.out.print("학생 성적 : ");
            scoreList.add(sc.nextInt());
            System.out.print("추가 입력하려면 y : ");
            char chAdd = sc.next().charAt(0);
            if (chAdd == 'y' || chAdd == 'Y') {
                IsAddTrue = true;
            } else IsAddTrue = false;
        }
        System.out.println("학생 인원 : " + scoreList.size() + " 명");
        for (int score : scoreList) {
            totalScore += (double) score;
        }
        System.out.println("평균 점수 : " + (totalScore/scoreList.size()) );

    }
}
