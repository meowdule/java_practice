package com.meowdule.practice.comprehensive.repository;

import com.meowdule.practice.comprehensive.domain.Question;
import com.meowdule.practice.comprehensive.domain.TestScoreInterpretation;
import com.meowdule.practice.comprehensive.domain.TestType;

import java.util.List;
import java.util.Map;

/**
 * PHQ-9 (우울증 테스트) 클래스
 * 테스트 질문 목록과 응답 매핑을 제공한다.
 */
public class PHQTest implements TestScoreInterpretation {
    private final List<Question> questions = TestDataLoader.loadQuestions(TestType.of("PHQ9", "PHQ-9 우울증 테스트"));

    @Override
    public TestType getTestType() {
        return TestType.of("PHQ9", "PHQ-9 우울증 테스트");
    }

    @Override
    public List<Question> getQuestions() {
        return questions;
    }

    @Override
    public Map<Integer, String> getResponseMapping() {
        return Map.of(
                0, "전혀 없음",
                1, "며칠 동안",
                2, "일주일 이상",
                3, "거의 매일"
        );
    }
}
