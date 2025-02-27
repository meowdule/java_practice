package com.meowdule.level01.basic;

import java.util.*;

public class Application4 {
    public static void main(String[] args) {
        /* 학생들의 ID를 관리하는 프로그램
        *   :  이미 존재하는 ID는 추가하지 않으며, 전체 학생 ID를 출력합니다. */
        Scanner sc = new Scanner(System.in);
        /* 최근 방문 URL 저장 (FIFO 방식) */
        Set<String> studentList = new HashSet<>();

        while (true) {
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("모든 학생의 ID : " + studentList);
                break;
            } else if (studentList.contains(input)) {
                System.out.println("이미 등록된 ID 입니다.");
            } else {
                System.out.println("ID가 추가 되었습니다.");
                studentList.add(input);
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
        sc.close();
    }
}
