package com.meowdule.practice.comprehensive.domain;

import java.util.List;
import java.util.Map;

/**
 * 테스트 점수 해석을 위한 인터페이스
 * 각 테스트 유형별 질문 목록과 응답 매핑을 제공한다.
 */
public interface TestScoreInterpretation {
    TestType getTestType();
    List<Question> getQuestions();
    Map<Integer, String> getResponseMapping();

    // 총 문항 개수를 반환하는 기본 메서드
    default int getQuestionCount() {
        return getQuestions().size();
    }
}
