package com.meowdule.practice.comprehensive.user;

import java.util.ArrayList;
import java.util.List;

/**
 * 사용자 정보를 저장하는 클래스
 */
public class User {
    private final String userId;
    private final String password;
    private final String name;
    private final int age;
    private final List<TestHistory> testHistories;

    public User(String userId, String password, String name, int age) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.testHistories = new ArrayList<>();
    }

    /**
     * 사용자 ID 반환
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 비밀번호 반환 (보안을 위해 해싱 적용 필요 가능성 있음)
     */
    public String getPassword() {
        return password;
    }

    /**
     * 사용자 이름 반환
     */
    public String getName() {
        return name;
    }

    /**
     * 사용자 나이 반환
     */
    public int getAge() {
        return age;
    }

    /**
     * 사용자 검사 기록 반환
     */
    public List<TestHistory> getTestHistories() {
        return testHistories;
    }

    /**
     * 새로운 검사 기록 추가
     */
    public void addTestHistory(TestHistory history) {
        testHistories.add(history);
    }



    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", testHistories=" + testHistories +
                '}';
    }
}