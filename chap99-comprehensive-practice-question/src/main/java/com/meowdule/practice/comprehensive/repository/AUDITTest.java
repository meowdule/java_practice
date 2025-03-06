package com.meowdule.practice.comprehensive.repository;

import com.meowdule.practice.comprehensive.domain.Question;
import com.meowdule.practice.comprehensive.domain.TestScoreInterpretation;
import com.meowdule.practice.comprehensive.domain.TestType;

import java.util.List;
import java.util.Map;

/**
 * AUDIT-K (알코올 의존 테스트) 클래스
 * 테스트 질문 목록과 응답 매핑을 제공한다.
 */
public class AUDITTest implements TestScoreInterpretation {
    private final List<Question> questions = TestDataLoader.loadQuestions(TestType.of("AUDITK", "AUDIT-K 알코올 의존 테스트"));

    @Override
    public TestType getTestType() {
        return TestType.of("AUDITK", "AUDIT-K 알코올 의존 테스트");
    }

    @Override
    public List<Question> getQuestions() {
        return questions;
    }

    @Override
    public Map<Integer, String> getResponseMapping() {
        return Map.of(
                0, "없음",
                1, "월 1회 미만",
                2, "월 2-4회",
                3, "주 2-3회",
                4, "'주 4회 이상"
        );
    }
}
