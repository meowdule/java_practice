package com.meowdule.practice.comprehensive.user;

import com.meowdule.practice.comprehensive.repository.UserStorage;

/**
 * 검사 기록 저장 및 조회 기능을 제공하는 서비스 클래스
 */
public class UserTestHistoryService {
    private final UserStorage userStorage;
    private final UserManagementService userManagementService;

    public UserTestHistoryService(UserStorage userStorage, UserManagementService userManagementService) {
        this.userStorage = userStorage;
        this.userManagementService = userManagementService;
    }

    /**
     * 검사 기록 저장 기능
     */
    public void saveTestHistory(String testName, int score, String result) {
        User loggedInUser = userManagementService.getLoggedInUser();
        if (loggedInUser == null) {
            System.out.println("로그인이 필요합니다.");
            return;
        }
        TestHistory history = new TestHistory(testName, score, result);
        loggedInUser.addTestHistory(history);
        userStorage.updateUser(loggedInUser);
        System.out.println("검사 기록이 저장되었습니다.");
    }

    /**
     * 검사 기록 조회 기능
     */
    public void viewTestHistory() {
        User loggedInUser = userManagementService.getLoggedInUser();
        if (loggedInUser == null) {
            System.out.println("로그인이 필요합니다.");
            return;
        }
        System.out.println("=== " + loggedInUser.getName() + "님의 검사 기록 ===");
        if (loggedInUser.getTestHistories().isEmpty()) {
            System.out.println("검사 기록이 없습니다.");
        } else {
            for (TestHistory history : loggedInUser.getTestHistories()) {
                System.out.println(history);
            }
        }
    }
}