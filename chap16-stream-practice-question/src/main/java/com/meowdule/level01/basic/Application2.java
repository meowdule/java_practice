package com.meowdule.level01.basic;

import java.util.*;
import java.util.stream.Collectors;

public class Application2 {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("O001", "홍길동", Arrays.asList("노트북", "마우스"), 1200.0, "배송 완료"),
                new Order("O002", "김철수", Arrays.asList("스마트폰"), 800.0, "배송 중"),
                new Order("O003", "이영희", Arrays.asList("태블릿", "키보드"), 600.0, "배송 완료"),
                new Order("O004", "박민수", Arrays.asList("모니터"), 300.0, "배송 중")
        );

        /* 1. 배송 완료 상태의 주문 ID 리스트를 반환 */
        List<String> completedOrderIds =  orders
                .stream()
                .filter(e -> e.getStatus().equals("배송 완료"))
                .map(Order::getOrderId)
                .collect(Collectors.toList());

        /* 2. 각 고객이 주문한 총 금액을 계산하여 맵으로 반환 */
        Map<String, Double> totalAmountByCustomer = orders
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Order::getCustomerName,
                                Collectors.summingDouble(Order::getTotalAmount)
                        )
                );

        /* 3. 가장 높은 주문 금액을 가진 고객의 이름을 반환 */
        String highestOrderCustomer = orders
                .stream()
                .max(Comparator.comparingDouble(Order::getTotalAmount))
                .map(Order::getCustomerName)
                .orElse("없음");

        System.out.println("배송 완료 상태인 주문번호 목록 : " + completedOrderIds);
        // 출력 예시: ["O001", "O003"]

        System.out.println("고객별 총 주문 금액 : " + totalAmountByCustomer);
        // 출력 예시: {홍길동=1200.0, 김철수=800.0, 이영희=600.0, 박민수=300.0}

        System.out.println("가장 많이 구매한 구매자 : " + highestOrderCustomer);
        // 출력 예시: "홍길동"
    }
}
