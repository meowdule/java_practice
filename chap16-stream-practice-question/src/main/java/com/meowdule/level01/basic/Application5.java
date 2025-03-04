package com.meowdule.level01.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application5 {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("해리포터와 마법사의 돌", "J.K. 롤링", 1997, 10900),
                new Book("해리포터와 비밀의 방", "J.K. 롤링", 1998, 11900),
                new Book("다빈치 코드", "댄 브라운", 2003, 15900),
                new Book("천사와 악마", "댄 브라운", 2000, 12900),
                new Book("호빗", "J.R.R. 톨킨", 1937, 8990)
        );

        /* 1. 특정 저자(J.K. 롤링)의 도서 제목 리스트를 반환 */
        List<String> booksByAuthor = books
                .stream()
                .filter(b -> b.getAuthor().equals("J.K. 롤링"))
                .map(Book::getTitle)
                .collect(Collectors.toList());

        /* 2. 2000년 이후 출판된 도서 중 가장 비싼 도서의 제목을 반환 */
        String mostExpensiveBookAfter2000 = books
                .stream()
                .filter(b -> b.getPublicationYear() >= 2000)
                .max(Comparator.comparing(Book::getPublicationYear))
                .map(Book::getTitle)
                .orElse("없음");

       /*  3. 각 출판 연도별로 도서의 수를 계산하여 맵으로 반환 */
        Map<Integer, Long> booksCountByYear = books
                .stream()
                .collect(
                        Collectors.groupingBy(Book::getPublicationYear,
                        Collectors.counting()
                ));

        System.out.println("J.K. 롤링의 도서 목록 : " + booksByAuthor);
        // 출력 예시: ["해리포터와 마법사의 돌", "해리포터와 비밀의 방"]

        System.out.println("2000년 대 가장 비싼 도서 제목 : " + mostExpensiveBookAfter2000);
        // 출력 예시: "다빈치 코드"

        System.out.println("출판년도별 출판 도서 수 : " + booksCountByYear);
        // 출력 예시: {1997=1, 1998=1, 2000=1, 2003=1, 1937=1}
    }
}
