package com.greedy.level01.basic;

import com.greedy.level01.basic.Calculator;
import static com.greedy.level01.basic.Calculator.checkMaxNumber;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //메소드 호출 확인용 메소드 호출
        calculator.checkMethod();

        //함수를 호출하여 1~10까지의 합을 리턴 받아 출력
        int sum = calculator.sum1to10();
        System.out.println("1부터 10까지의 합 : " + sum);

        //10, 20 두 개의 정수를 매개변수로 하여 큰 값 출력하는 메소드 호출
        checkMaxNumber(10, 20);

        //10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력
        int num1 = 10;
        int num2 = 20;
        int sumTwo = calculator.sumTwoNumber(num1, num2);
        System.out.println(num1 + "과 " + num2 + "의 합은 : " + sumTwo);

        //10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력
        int num3 = 10;
        int num4 = 5;
        int diff = calculator.minusTwoNumber(num3, num4);
        System.out.println(num3 + "과 " + num4 + "의 차는 : " + diff);
    }
}
