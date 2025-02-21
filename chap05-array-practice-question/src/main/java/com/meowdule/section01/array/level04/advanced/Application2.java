package com.meowdule.section01.array.level04.advanced;

import java.util.Random;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 숫자 야구게임 만들기
         * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
         * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
         * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
         * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
         *
         * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
         * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
         *
         * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
         * 횟수는 차감하지 않는다.
         *
         * -- 프로그램 예시 (난수 7416 의 경우) --
         *
         * 10회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 1234
         * 아쉽네요 0S 2B 입니다.
         * 9회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 5678
         * 아쉽네요 0S 2B 입니다.
         * 8회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 7416
         * 정답입니다.
         * */
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] answerNumbers = generateUniqueNumbers(rand);
        int[] userNumbers = new int[4];
        int countdown = 10;

        // 정답 확인용 출력
        System.out.print("정답: ");
        for (int num : answerNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        while (countdown > 0) {
            int sCount = 0;
            int bCount = 0;

            System.out.println(countdown + "회 남으셨습니다.");
            System.out.print("4자리 숫자를 입력하세요: ");
            String input = sc.nextLine();

            if (input.length() != 4 || !input.matches("\\d{4}")) {
                System.out.println("4자리의 정수를 입력해야 합니다.");
                continue;
            }

            for (int i = 0; i < 4; i++) {
                userNumbers[i] = input.charAt(i) - '0';
            }

            boolean[] isChecked = new boolean[10];
            for (int i = 0; i < 4; i++) {
                if (userNumbers[i] == answerNumbers[i]) {
                    sCount++;
                } else {
                    isChecked[answerNumbers[i]] = true;
                }
            }

            for (int i = 0; i < 4; i++) {
                if (userNumbers[i] != answerNumbers[i] && isChecked[userNumbers[i]]) {
                    bCount++;
                }
            }

            if (sCount == 4) {
                System.out.println("정답입니다.");
                return;
            }

            System.out.println("아쉽네요 " + sCount + "S " + bCount + "B 입니다.");
            countdown--;
        }

        System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
    }

    private static int[] generateUniqueNumbers(Random rand) {
        int[] numbers = new int[4];
        boolean[] usedNumbers = new boolean[10];

        int index = 0;
        while (index < 4) {
            int randomNumber = rand.nextInt(10);
            if (!usedNumbers[randomNumber]) {
                numbers[index++] = randomNumber;
                usedNumbers[randomNumber] = true;
            }
        }
        return numbers;
    }

}