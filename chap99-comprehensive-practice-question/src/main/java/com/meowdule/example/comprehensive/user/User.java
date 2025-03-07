package com.meowdule.example.comprehensive.user;

import com.meowdule.practice.comprehensive.user.TestHistory;

import java.util.ArrayList;
import java.util.List;

/**
 * 회원 정보를 저장하는 클래스
 */
public class User {
    private final String userId;
    private final String name;
    private final int age;
    private final List<TestHistory> testHistories;

    public User(String userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.testHistories = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<TestHistory> getTestHistories() {
        return testHistories;
    }

    /**
     * 새로운 검사 기록을 추가합니다.
     */
    public void addTestHistory(TestHistory history) {
        testHistories.add(history);
    }
}