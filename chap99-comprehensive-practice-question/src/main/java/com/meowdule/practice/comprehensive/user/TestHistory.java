package com.meowdule.practice.comprehensive.user;

import java.time.LocalDate;

/**
 * 회원의 검사 기록을 저장하는 클래스
 */
public class TestHistory {
    private final LocalDate testDate;
    private final String testName;
    private final int score;
    private final String result;

    public TestHistory(String testName, int score, String result) {
        this.testDate = LocalDate.now();
        this.testName = testName;
        this.score = score;
        this.result = result;
    }

    public LocalDate getTestDate() {
        return testDate;
    }

    public String getTestName() {
        return testName;
    }

    public int getScore() {
        return score;
    }

    public String getResult() {
        return result;
    }

    @Override
    public String toString() {
        return testDate + " - " + testName + " (점수: " + score + ", 결과: " + result + ")";
    }
}
