package com.meowdule.practice.comprehensive.user;

/**
 * 사용자 서비스 클래스 (UserManagementService 및 UserTestHistoryService 통합)
 */
public class UserService {
    private final UserManagementService userManagementService;
    private final UserTestHistoryService userTestHistoryService;

    public UserService(UserManagementService userManagementService, UserTestHistoryService userTestHistoryService) {
        if (userManagementService == null || userTestHistoryService == null) {
            throw new IllegalArgumentException("UserManagementService 또는 UserTestHistoryService가 null입니다.");
        }
        this.userManagementService = userManagementService;
        this.userTestHistoryService = userTestHistoryService;
    }

    /**
     * 회원 관리 서비스 반환
     */
    public UserManagementService getUserManagementService() {
        return userManagementService;
    }

    /**
     * 검사 기록 관리 서비스 반환
     */
    public UserTestHistoryService getUserTestHistoryService() {
        return userTestHistoryService;
    }

    /**
     * 회원가입 기능 (비밀번호 포함)
     */
    public void registerUser(String userId, String password, String name, int age) {
        userManagementService.registerUser(userId, password, name, age);
    }

    /**
     * 로그인 기능 (비밀번호 검증 포함)
     */
    public void loginUser(String userId, String password) {
        userManagementService.loginUser(userId, password);
    }

    /**
     * 로그아웃 기능
     */
    public void logoutUser() {
        userManagementService.logoutUser();
    }

    /**
     * 로그인 상태 확인 기능
     */
    public boolean isUserLoggedIn() {
        return userManagementService.isUserLoggedIn();
    }

    /**
     * 검사 기록 저장 기능
     */
    public void saveTestHistory(String testName, int score, String result) {
        userTestHistoryService.saveTestHistory(testName, score, result);
    }

    /**
     * 검사 기록 조회 기능
     */
    public void viewTestHistory() {
        userTestHistoryService.viewTestHistory();
    }
}