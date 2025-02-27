package com.meowdule.level01.basic;

import java.util.HashMap;
import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {
        /* 이름을 입력하면 전화번호를 검색할 수 있는 전화번호부 */
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> numList = new HashMap<>();
        while (true) {
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 " +
                    "(검색하려면 'search', 종료하려면 'exit'): ");
            String input = sc.nextLine();
            String[] inputParts = input.split("\\s+");
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("전화번호부 : " + numList);
                break;
            } else if (input.equalsIgnoreCase("search")) {
                System.out.print("검색할 이름 : ");
                String searchName = sc.nextLine().trim();
                if (numList.containsKey(searchName)) {
                    System.out.println(searchName + "씨의 전화번호 : " + numList.get(searchName));
                } else {
                    System.out.println(searchName + "씨의 번호는 등록되어 있지 않습니다.");
                }
                /**/
            } else if (inputParts.length != 2) {
                System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
            } else {
                numList.put(inputParts[0], inputParts[1]);
                System.out.println("추가 완료 : " + input);
            }
        }
        System.out.println("전화번호부를 종료합니다.");
        sc.close();
    }
}
