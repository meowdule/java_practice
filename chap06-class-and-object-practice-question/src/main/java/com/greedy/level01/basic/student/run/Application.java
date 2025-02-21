package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.mode.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] studentArr = new StudentDTO[10];
        int count = 0;
        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        // 한 명씩 추가 될 때마다 카운트함
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        // 학생들의 정보를 모두 출력 (평균 포함)
        while (count < 10) {
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();

            studentArr[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
            count++;

            System.out.print("계속 추가할 겁니까? ( y / n ) : ");
            char strAdd = sc.next().charAt(0);

            if (strAdd == 'n' || strAdd == 'N') {
                break;
            } else if (strAdd != 'y' && strAdd != 'Y') {
                System.out.println("잘못된 값을 입력하였습니다. 프로그램을 종료합니다.");
                break;
            }
        }

        System.out.println("\n[ 학생 정보 목록 ]");
        for (int i = 0; i < count; i++) {
            StudentDTO student = studentArr[i];
            int avg = (int) ((student.getKor() + student.getEng() + student.getMath()) / 3);
            System.out.println(
                    "학년 = " + student.getGrade() + ", " +
                            "반 = " + student.getClassroom() + ", " +
                            "이름 = " + student.getName() + ", " +
                            "국어 = " + student.getKor() + ", " +
                            "영어 = " + student.getEng() + ", " +
                            "수학 = " + student.getMath() + ", " +
                            "평균 = " + avg );
        }
    }
}
