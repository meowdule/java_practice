package com.meowdule.level01.basic;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /* 대기 줄을 시뮬레이션하는 프로그램
        *  : 고객이 줄을 서면 대기열에 추가되고, 서비스가 완료되면 대기열에서 제거합니다. */
        Scanner sc = new Scanner(System.in);
        /* 최근 방문 URL 저장 (FIFO 방식) */
        Deque<String> waitGuestList = new LinkedList<>();

        while (true) {
            System.out.print("대기 고객 이름 입력 " +
                    "(다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equalsIgnoreCase("next")) {
                if (waitGuestList.isEmpty()) {
                    System.out.println("대기 고객이 없습니다.");
                } else {
                    System.out.println(waitGuestList.pollFirst() + " 고객님 차례입니다.");
                    printQueueStatus(waitGuestList);
                }
            } else {
                waitGuestList.offerLast(input);
                System.out.println(input + " 고객님 대기 등록 되었습니다. ");
                printQueueStatus(waitGuestList);
            }
        }
        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }

    // 현재 대기열 상태 출력
    private static void printQueueStatus(Deque<String> queue) {
        if (queue.isEmpty()) {
            System.out.println("대기열이 비어 있습니다.");
        } else {
            System.out.println("현재 대기열: " + queue);
        }
    }
}
