package com.meowdule.practice.comprehensive.repository;

import com.meowdule.practice.comprehensive.domain.Question;
import com.meowdule.practice.comprehensive.domain.TestType;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 테스트 데이터 로딩을 담당하는 클래스
 * JSON 파일에서 테스트 문항 및 응답 매핑을 읽어와 객체로 변환한다.
 */
public class TestDataLoader {
    private static final String DATA_PATH = System.getProperty("user.dir") +
            "/src/main/java/com/meowdule/practice/comprehensive/db/test_questions.json"; // 절대 경로 사용

    /**
     * 특정 테스트 유형에 해당하는 질문 목록을 로드한다.
     *  testType 테스트 유형
     *  질문 리스트 반환
     */
    public static List<Question> loadQuestions(TestType testType) {
        try (Reader reader = new FileReader(new File(DATA_PATH))) {
            Map<String, Map<String, Object>> questionsMap = new Gson().fromJson(reader, new TypeToken<Map<String, Map<String, Object>>>() {}.getType());

            // JSON에서 "questions" 배열을 가져와 Question 리스트로 변환
            List<Question> questions = new Gson().fromJson(
                    new Gson().toJson(questionsMap.get(testType.getName()).get("questions")),
                    new TypeToken<List<Question>>() {}.getType()
            );

            return questions;
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }

    /**
     * 특정 테스트 유형에 대한 응답 매핑을 로드한다.
     *  testType 테스트 유형
     *  응답 매핑 (점수 -> 의미) 반환
     */
    public static Map<Integer, String> loadResponseMapping(TestType testType) {
        try (Reader reader = new FileReader(new File(DATA_PATH))) {
            Map<String, Map<String, Object>> questionsMap = new Gson().fromJson(reader, new TypeToken<Map<String, Map<String, Object>>>() {}.getType());

            // JSON에서 "responseMapping"을 가져와 맵으로 변환
            Map<String, String> rawMapping = new Gson().fromJson(
                    new Gson().toJson(questionsMap.get(testType.getName()).get("responseMapping")),
                    new TypeToken<Map<String, String>>() {}.getType()
            );

            // 키를 Integer로 변환하여 반환
            return rawMapping.entrySet().stream().collect(Collectors.toMap(
                    entry -> Integer.parseInt(entry.getKey()),
                    Map.Entry::getValue
            ));
        } catch (Exception e) {
            e.printStackTrace();
            return Map.of();
        }
    }
}
