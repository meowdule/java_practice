package com.meowdule.practice.comprehensive.service;

import com.meowdule.practice.comprehensive.domain.Question;
import com.meowdule.practice.comprehensive.domain.TestScoreInterpretation;
import com.meowdule.practice.comprehensive.domain.TestResult;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestService {
    private final Scanner scanner = new Scanner(System.in);

    /**
     * 사용자가 선택한 테스트를 실행하는 메서드
     *  test 사용자가 선택한 테스트 인터페이스
     *  테스트 결과 객체 반환
     */
    public TestResult startTest(TestScoreInterpretation test) {
        System.out.println("\n=== " + test.getTestType().getDisplayName() + " 시작 (" + test.getQuestionCount() + "문항) ===");

        List<Question> questions = test.getQuestions();
        Map<Integer, String> responseMapping = test.getResponseMapping();

        int totalScore = 0;
        // 전체 문항 기준 최대 점수
        int maxScore = questions.size() * 3;

        for (Question q : questions) {
            int score;
            while (true) {
                System.out.println(q.getQuestionText());

                // 응답 선택지 출력
                System.out.print("응답 (");
                for (int i = 0; i <= q.getTestMaxScore(); i++) {
                    System.out.print(i + ": " + responseMapping.getOrDefault(i, i + "점") + " ");
                }
                System.out.println(")");

                System.out.print("입력: ");

                if (scanner.hasNextInt()) {
                    score = scanner.nextInt();
                    if (score >= 0 && score <= q.getTestMaxScore()) break;
                }
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                scanner.nextLine();
            }
            totalScore += score;
        }

        // 점수를 기반으로 결과 평가 후 반환
        return new TestResult(totalScore, ScoreEvaluator.evaluate(test.getTestType(), totalScore), maxScore);
    }
}