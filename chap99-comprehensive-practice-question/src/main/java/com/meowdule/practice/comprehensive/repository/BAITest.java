package com.meowdule.practice.comprehensive.repository;

import com.meowdule.practice.comprehensive.domain.Question;
import com.meowdule.practice.comprehensive.domain.TestScoreInterpretation;
import com.meowdule.practice.comprehensive.domain.TestType;

import java.util.List;
import java.util.Map;

/**
 * BAI (불안 장애 테스트) 클래스
 * 테스트 질문 목록과 응답 매핑을 제공한다.
 */
public class BAITest implements TestScoreInterpretation {
    private final List<Question> questions = TestDataLoader.loadQuestions(TestType.of("BAI", "BAI 불안 장애 테스트"));

    @Override
    public TestType getTestType() {
        return TestType.of("BAI", "BAI 불안 장애 테스트");
    }

    @Override
    public List<Question> getQuestions() {
        return questions;
    }

    @Override
    public Map<Integer, String> getResponseMapping() {
        return Map.of(
                0, "전혀 느끼지 않음",
                1, "약간 느꼈음",
                2, "상당히 느꼈음",
                3, "심하게 느꼈음"
        );
    }
}
