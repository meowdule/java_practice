package com.meowdule.practice.comprehensive.service;

import com.meowdule.practice.comprehensive.domain.Question;
import com.meowdule.practice.comprehensive.domain.TestScoreInterpretation;
import com.meowdule.practice.comprehensive.domain.TestResult;
import com.meowdule.practice.comprehensive.user.UserService;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 테스트 실행 및 결과 저장을 담당하는 서비스 클래스
 */
public class TestService {
    private final Scanner scanner = new Scanner(System.in);
    private final UserService userService;

    public TestService(UserService userService) {
        this.userService = userService;
    }

    /**
     * 테스트 실행
     */
    public TestResult startTest(TestScoreInterpretation test) {
        if (!userService.isUserLoggedIn()) {
            System.out.println("로그인이 필요합니다.");
            return null;
        }

        System.out.println("\n=== " + test.getTestType().getDisplayName() + " 시작 (" + test.getQuestionCount() + "문항) ===");

        List<Question> questions = test.getQuestions();
        Map<Integer, String> responseMapping = test.getResponseMapping();

        int totalScore = 0;
        int maxScore = questions.size() * 3;

        for (Question q : questions) {
            int score;
            while (true) {
                System.out.println(q.getQuestionText());
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

        String result = ScoreEvaluator.evaluate(test.getTestType(), totalScore);
        TestResult testResult = new TestResult(totalScore, result, maxScore);
        userService.saveTestHistory(test.getTestType().getDisplayName(), totalScore, result);
        return testResult;
    }
}