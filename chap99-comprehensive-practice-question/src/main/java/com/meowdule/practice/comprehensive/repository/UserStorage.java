package com.meowdule.practice.comprehensive.repository;

import com.meowdule.practice.comprehensive.user.User;

/**
 * 사용자 데이터를 저장 및 관리하는 인터페이스
 */
public interface UserStorage {

    /**
     * 사용자 저장
     */
    void saveUser(User user);

    /**
     * 사용자 ID로 사용자 찾기
     */
    User findUserById(String userId);

    /**
     * 사용자 정보 업데이트
     */
    void updateUser(User user);
}
