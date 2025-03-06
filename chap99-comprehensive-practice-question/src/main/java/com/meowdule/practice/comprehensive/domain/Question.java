package com.meowdule.practice.comprehensive.domain;

/**
 * 질문(Question) 객체를 정의하는 클래스
 * 각 테스트의 질문과 해당 질문의 배점을 저장한다.
 */
public class Question {
    private final String questionText;
    private final int testMaxScore;

    public Question(String questionText, int testMaxScore) {
        this.questionText = questionText;
        this.testMaxScore = testMaxScore;
    }

    public String getQuestionText() {
        return questionText;
    }

    public int getTestMaxScore() {
        return testMaxScore;
    }
}
