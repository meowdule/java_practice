package com.meowdule.practice.comprehensive.service;

import com.meowdule.practice.comprehensive.domain.TestType;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ScoreEvaluator {
    // 테스트 유형별 점수 기준을 저장하는 정적 맵
    private static final Map<String, Map<Integer, String>> SCORE_MAPPINGS = Map.of(
            "PHQ9", new TreeMap<>(Map.of(4, "우울 증상 없음", 9, "경미한 우울증", 14, "중등도 우울증", 19, "중등도에서 중증 우울증", 27, "중증 우울증")),
            "BAI", new TreeMap<>(Map.of(7, "불안 없음", 15, "경미한 불안", 21, "중증도 불안", 30, "심한 불안")),
            "AUDITK", new TreeMap<>(Map.of(7, "알코올 의존 위험 없음", 15, "경미한 알코올 의존", 20, "중증도 알코올 의존", 25, "심한 알코올 의존"))
    );

    /**
     * 사용자의 총 점수를 기준으로 해당하는 평가 결과를 반환하는 메서드
     * testType 테스트 유형 (PHQ9, BAI, AUDITK 등)
     * score 사용자의 총 점수
     * 평가 결과 문자열 반환
     */
    public static String evaluate(TestType testType, int score) {
        return SCORE_MAPPINGS.getOrDefault(testType.getName(), Map.of())
                .entrySet().stream()
                .filter(entry -> score <= entry.getKey())
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse("알 수 없음");
    }

    /**
     * 테스트별 점수 기준을 문자열 형태로 반환하는 메서드
     * testType 테스트 유형
     * 점수 기준을 정렬된 문자열로 반환
     */
    public static String getScoreCriteria(TestType testType) {
        return SCORE_MAPPINGS.getOrDefault(testType.getName(), new TreeMap<>())
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> entry.getKey() + "점 이하 : " + entry.getValue())
                .collect(Collectors.joining("\n"));
    }
}
