package com.meowdule.level01.basic;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Application2 {
    public static void main(String[] args) {
        /* 사용자가 방문한 웹사이트 URL을 입력받아 저장하고,
        가장 최근에 방문한 5개의 URL을 출력하는 프로그램 */
        Scanner sc = new Scanner(System.in);
        /* 최근 방문 URL 저장 (FIFO 방식) */
        Deque<String> recentUrls = new LinkedList<>();

        while (true) {
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            /* 새로운 URL을 추가하며, 5개 이상이면 가장 오래된 URL 제거 */
            if (recentUrls.size() == 5) {
                /* 가장 오래된 URL 삭제 (FIFO 방식 유지)*/
                recentUrls.pollLast();
            }
            // 최신 URL 추가 (맨 앞)
            recentUrls.offerFirst(input);

            System.out.println("최근 방문 url : " + recentUrls);
        }

        System.out.println("프로그램을 종료합니다.");
        sc.close();


//        Scanner sc = new Scanner(System.in);
//        Stack<String> stackUrl = new Stack<>();
//        while (true) {
//            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
//            String input = sc.nextLine();
//            if (input.equalsIgnoreCase("exit")) {
//                break;
//            }
//            stackUrl.push(input);
//            System.out.print("최근 방문 url : [");
//            int count = 0;
//            for(int i = stackUrl.size() - 1; i >= 0 && count < 5; i--) {
//                System.out.print(stackUrl.get(i));
//                if(count < 4 && i > 0) {
//                    System.out.print(", ");
//                }
//                count++;
//            }
//            System.out.println("]");
//        }
//
//        System.out.println("프로그램을 종료합니다.");
//        sc.close();
    }
}
