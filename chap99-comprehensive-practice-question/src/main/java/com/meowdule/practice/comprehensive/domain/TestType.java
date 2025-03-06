package com.meowdule.practice.comprehensive.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * 테스트 유형(TestType) 클래스
 * 각 테스트 유형의 이름과 표시명을 관리하며, 동일한 유형의 객체를 재사용할 수 있도록 한다.
 */
public class TestType {
    private static final Map<String, TestType> TYPES = new HashMap<>();

    /* name 테스트 유형의 내부 식별자
    * displayName 사용자에게 표시되는 테스트 이름 */
    private final String name;
    private final String displayName;

    private TestType(String name, String displayName) {
        this.name = name;
        this.displayName = displayName;
    }

    public static TestType of(String name, String displayName) {
        return TYPES.computeIfAbsent(name, key -> new TestType(name, displayName));
    }

    public static TestType get(String name) {
        return TYPES.get(name);
    }

    public static Map<String, TestType> getAllTypes() {
        return TYPES;
    }

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
