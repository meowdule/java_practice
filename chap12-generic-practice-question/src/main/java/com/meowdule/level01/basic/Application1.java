package com.meowdule.level01.basic;

import java.util.Arrays;

public class Application1 {
    /* 두 개의 요소를 교환하는 제네릭 메서드 swap 을 작성한다.
    Application1 클래스 내에 static 메소드로 작성하며 배열과 교환할 인덱스 두 개를 매개변수로 받아 처리한다. */

    /* 제네릭 메서드 swap 추가*/
    public static <T> void swap(T[] array, int idx1, int idx2) {
        /* 인덱스 확인*/
        if (array == null
                || idx1 < 0 || idx1 >= array.length
                || idx2 < 0 || idx2 >= array.length) {
            throw new IllegalArgumentException("잘못된 인덱스입니다.");
        }

        /* i와 j의 위치 변환*/
        T temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("swap 전 : " + Arrays.toString(intArray));  // [1, 2, 3, 4, 5]
        swap(intArray, 1, 3);
        System.out.println("swap 후 : " + Arrays.toString(intArray));  // [1, 4, 3, 2, 5]

        String[] strArray = {"A", "B", "C", "D"};
        System.out.println("swap 전 : " + Arrays.toString(strArray));  // [A, B, C, D]
        swap(strArray, 0, 2);
        System.out.println("swap 후 : " + Arrays.toString(strArray));  // [C, B, A, D]
    }
}
