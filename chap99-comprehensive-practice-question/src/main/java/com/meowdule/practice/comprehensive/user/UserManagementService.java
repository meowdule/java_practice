package com.meowdule.practice.comprehensive.user;

import com.meowdule.practice.comprehensive.repository.UserStorage;

/**
 * 회원가입 및 로그인 관련 기능을 제공하는 서비스 클래스
 */
public class UserManagementService {
    private User loggedInUser;
    private final UserStorage userStorage;

    public UserManagementService(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    /**
     * 회원가입 기능 (비밀번호 추가)
     */
    public void registerUser(String userId, String password, String name, int age) {
        if (userStorage.findUserById(userId) != null) {
            System.out.println("이미 존재하는 ID입니다.");
            return;
        }

        User newUser = new User(userId, password.trim(), name, age);
        userStorage.saveUser(newUser);
        System.out.println("회원가입이 완료되었습니다!");
    }

    /**
     * 로그인 기능 (비밀번호 검증 추가)
     */
    public void loginUser(String userId, String password) {
        User user = userStorage.findUserById(userId);
        if (user == null) {
            System.out.println("존재하지 않는 ID입니다.");
            return;
        }
        if (!user.getPassword().trim().equals(password.trim())) {
            System.out.println("비밀번호가 올바르지 않습니다.");
            return;
        }
        loggedInUser = user;
        System.out.println("환영합니다, " + user.getName() + "님!");
    }

    /**
     * 로그아웃 기능
     */
    public void logoutUser() {
        if (loggedInUser == null) {
            System.out.println("로그인된 사용자가 없습니다.");
            return;
        }
        System.out.println(loggedInUser.getName() + "님이 로그아웃되었습니다.");
        loggedInUser = null;
    }

    /**
     * 로그인 상태 확인 기능
     */
    public boolean isUserLoggedIn() {
        return loggedInUser != null;
    }

    /**
     * 현재 로그인된 사용자 정보 반환
     */
    public User getLoggedInUser() {
        return loggedInUser;
    }
}