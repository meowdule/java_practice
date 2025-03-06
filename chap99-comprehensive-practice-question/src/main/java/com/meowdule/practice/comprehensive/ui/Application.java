package com.meowdule.practice.comprehensive.ui;

import com.meowdule.practice.comprehensive.repository.*;
import com.meowdule.practice.comprehensive.service.TestService;
import com.meowdule.practice.comprehensive.service.ScoreEvaluator;
import com.meowdule.practice.comprehensive.domain.TestScoreInterpretation;
import com.meowdule.practice.comprehensive.domain.TestResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    private final Scanner scanner = new Scanner(System.in);
    private final TestService testService = new TestService();
    private final List<TestScoreInterpretation> tests = new ArrayList<>();

    /**
     * 애플리케이션 생성자: 모든 테스트를 자동 등록하는 역할을 수행한다.
     */
    public Application() {
        tests.add(new PHQTest());
        tests.add(new AUDITTest());
        tests.add(new BAITest());
    }

    /**
     * 애플리케이션 실행 메서드
     * 사용자가 원하는 테스트를 선택하고 실행할 수 있도록 한다.
     */
    public void start() {
        while (true) {
            System.out.println("\n=== 자가진단 테스트 ===");
            System.out.println("0. 테스트 종료"); // 종료 옵션
            for (int i = 0; i < tests.size(); i++) {
                System.out.println((i + 1) + ". " + tests.get(i).getTestType().getDisplayName() + " (" + tests.get(i).getQuestionCount() + "문항)");
            }
            System.out.print("테스트를 선택하세요 (0-" + tests.size() + "): ");

            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 0) break;
                if (choice >= 1 && choice <= tests.size()) {
                    TestScoreInterpretation selectedTest = tests.get(choice - 1);
                    TestResult result = testService.startTest(selectedTest);

                    // 테스트 결과 출력
                    System.out.println("\n=== 테스트 결과 ===");
                    System.out.println("총 점수: " + result.getTotalScore() + " / " + result.getMaxScore());
                    System.out.println("결과: " + result.getResult());

                    // 배점 기준 추가 출력
                    System.out.println("\n=== 테스트 기준 ===");
                    System.out.println(ScoreEvaluator.getScoreCriteria(selectedTest.getTestType()));
                }
            } else {
                scanner.nextLine();
            }
        }
    }

    /**
     * 프로그램의 진입점 (main 메서드)
     */
    public static void main(String[] args) {
        new Application().start();
    }
}