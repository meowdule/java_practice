package com.meowdule.practice.comprehensive.domain;

/**
 * 테스트 결과(TestResult) 객체를 정의하는 클래스
 * 사용자의 총 점수, 평가 결과, 최대 점수를 저장한다.
 */
public class TestResult {
    private final int totalScore;
    private final String result;
    private final int maxScore;  // 최대 점수

    public TestResult(int totalScore, String result, int maxScore) {
        this.totalScore = totalScore;
        this.result = result;
        this.maxScore = maxScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public String getResult() {
        return result;
    }

    public int getMaxScore() {
        return maxScore;
    }
}
