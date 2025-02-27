package com.meowdule.level01.basic;


public class Application2 {
    /* Number 타입 또는 그 하위 타입만 허용하는 sum 메서드를 작성한다.
    Application2 클래스 내에 static 메소드로 작성하며 배열을 매개변수로 받아 해당 요소들의 합계를 반환하도록 한다.
    Number 하위 타입이 아닌 경우 컴파일 에러가 발생하는 것을 확인한다.
    * */
    public static <T extends Number> double sum(T[] array) {
        /* 입력 배열 확인 */
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("잘못된 배열입니다.");
        }
        double sumResult = 0.0;
        for (T num : array) {
            sumResult += num.doubleValue();
        }
        return sumResult;

    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer 합계 : " + sum(intArray));

        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Double 합계 : " + sum(doubleArray));

        String[] strArray = {"A", "B", "C"};
//         System.out.println("String 합계 : " + sum(strArray));  // 컴파일 에러 발생
    }
}