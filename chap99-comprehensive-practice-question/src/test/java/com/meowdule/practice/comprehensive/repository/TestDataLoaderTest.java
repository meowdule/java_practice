package com.meowdule.practice.comprehensive.repository;

import com.meowdule.practice.comprehensive.domain.Question;
import com.meowdule.practice.comprehensive.domain.TestType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TestDataLoader 테스트 클래스
 */
class TestDataLoaderTest {
    private TestType testType;

    @BeforeEach
    void setUp() {
        testType = TestType.of("PHQ9", "PHQ-9 우울증 테스트");
    }

    @Test
    void testLoadQuestions() {
        List<Question> questions = TestDataLoader.loadQuestions(testType);
        assertNotNull(questions);
        assertFalse(questions.isEmpty());

        // 첫 번째 질문 확인 (예제에 따라 다름)
        assertEquals("1. 일상생활에서 흥미나 즐거움을 느끼지 못함", questions.get(0).getQuestionText());
    }

    @Test
    void testLoadResponseMapping() {
        Map<Integer, String> responseMapping = TestDataLoader.loadResponseMapping(testType);
        assertNotNull(responseMapping);
        assertFalse(responseMapping.isEmpty());

        // 예제 데이터 기준 확인
        assertEquals("전혀 없음", responseMapping.get(0));
        assertEquals("며칠 동안", responseMapping.get(1));
    }
}
