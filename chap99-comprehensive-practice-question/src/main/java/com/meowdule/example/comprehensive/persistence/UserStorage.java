package com.meowdule.example.comprehensive.persistence;

import com.meowdule.example.comprehensive.domain.User;

import java.util.List;

/* 파일 저장 방식, 데이터베이스 저장 방식 등을 쉽게 교체할 수 있도록 인터페이스 분리 */
public interface UserStorage {
    void saveUsers(List<User> users);
    List<User> loadUsers();
}