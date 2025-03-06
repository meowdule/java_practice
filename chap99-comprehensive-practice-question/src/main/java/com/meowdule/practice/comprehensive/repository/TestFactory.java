package com.meowdule.practice.comprehensive.repository;

import com.meowdule.practice.comprehensive.domain.TestScoreInterpretation;
import com.meowdule.practice.comprehensive.domain.TestType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestFactory {
    private static final Map<TestType, TestScoreInterpretation> testMap = new HashMap<>();

    /**
     * 정적 블록에서 자동으로 테스트를 등록한다.
     */
    static {
        registerTestsAutomatically();
    }

    /**
     * 지원되는 모든 테스트를 자동으로 등록한다.
     */
    private static void registerTestsAutomatically() {
        List<TestScoreInterpretation> availableTests = List.of(
                new PHQTest(),
                new AUDITTest(),
                new BAITest()
        );
        availableTests.forEach(test -> registerTest(test.getTestType(), test));
    }

    /**
     * 특정 테스트 유형에 해당하는 테스트 객체를 반환한다.
     *  type 테스트 유형
     *  해당 테스트의 객체 반환, 없을 경우 null 반환
     */
    public static TestScoreInterpretation getTest(TestType type) {
        return testMap.get(type);
    }

    /**
     * 새로운 테스트를 등록한다.
     *  type 테스트 유형
     *  test 테스트 객체
     */
    public static void registerTest(TestType type, TestScoreInterpretation test) {
        testMap.put(type, test);
    }
}