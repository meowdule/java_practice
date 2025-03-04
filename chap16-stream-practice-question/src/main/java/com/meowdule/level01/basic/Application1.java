package com.meowdule.level01.basic;

import java.util.*;
import java.util.stream.Collectors;

public class Application1 {

    public static void main(String[] args) {
        /* 회사의 직원 데이터를 다루는 프로그램
           직원은 이름, 나이, 부서, 급여 정보를 가지고 있습니다. */
        List<Employee> employees = Arrays.asList(
                new Employee("홍길동", 25, "IT", 6000),
                new Employee("김철수", 28, "HR", 3000),
                new Employee("이영희", 30, "IT", 7000),
                new Employee("박민수", 22, "영업", 4000),
                new Employee("최지현", 35, "HR", 3500),
                new Employee("한석봉", 40, "IT", 5000)
        );

        /* 1. 모든 직원의 이름을 쉼표로 구분된 문자열로 반환 */
        String allNames = employees
                .stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "));

        /* 2. IT 부서에서 급여가 5,000 이상인 직원의 이름을 급여 순으로 내림차순 정렬하여 반환 */
        List<String> highSalaryIT = employees
                .stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .map(Employee::getName)
                .collect(Collectors.toList());

        /* 3. 각 부서별 평균 급여를 계산하여 맵으로 반환 */
        Map<String, Double> averageSalaryByDept = employees
                .stream()
                .collect(
                        Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingInt(Employee::getSalary))
                );

        System.out.println("직원 이름 목록 : " + allNames);
        // 출력 예시: "홍길동, 김철수, 이영희, 박민수, 최지현, 한석봉"

        System.out.println("IT 부서의 급여 순 직원 목록 : " + highSalaryIT);
        // 출력 예시: [이영희, 홍길동, 한석봉]

        System.out.println("부서별 평균 급여 : " + averageSalaryByDept);
        // 출력 예시: {HR=3250.0, IT=6000.0, 영업=4000.0}
    }
}
