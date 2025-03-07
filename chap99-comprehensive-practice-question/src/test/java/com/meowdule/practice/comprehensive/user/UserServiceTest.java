package com.meowdule.practice.comprehensive.user;

import com.meowdule.practice.comprehensive.repository.UserRepository;
import com.meowdule.practice.comprehensive.repository.UserStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * UserService 테스트 클래스
 */
class UserServiceTest {
    private UserService userService;
    private UserManagementService userManagementService;
    private UserTestHistoryService userTestHistoryService;
    private UserStorage userStorage;

    @BeforeEach
    void setUp() {
        userStorage = new UserRepository();
        userManagementService = new UserManagementService(userStorage);
        userTestHistoryService = new UserTestHistoryService(userStorage, userManagementService);
        userService = new UserService(userManagementService, userTestHistoryService);
    }

    @Test
    void testRegisterUser() {
        userService.registerUser("testUser", "testPass", "테스트 유저", 25);

        User retrievedUser = userStorage.findUserById("testUser");
        assertNotNull(retrievedUser);
        assertEquals("testUser", retrievedUser.getUserId());
        assertEquals("testPass", retrievedUser.getPassword());
    }

    @Test
    void testLoginUser() {
        userService.registerUser("loginUser", "password123", "로그인 유저", 30);

        userService.loginUser("loginUser", "password123");
        assertTrue(userService.isUserLoggedIn());
        assertEquals("loginUser", userManagementService.getLoggedInUser().getUserId());
    }

    @Test
    void testLogoutUser() {
        userService.registerUser("logoutUser", "logoutPass", "로그아웃 유저", 28);
        userService.loginUser("logoutUser", "logoutPass");
        assertTrue(userService.isUserLoggedIn());

        userService.logoutUser();
        assertFalse(userService.isUserLoggedIn());
    }

    @Test
    void testViewTestHistory() {
        userService.registerUser("historyUser", "historyPass", "기록 유저", 27);
        userService.loginUser("historyUser", "historyPass");
        userService.saveTestHistory("PHQ-9", 15, "중등도 우울증");
        userService.viewTestHistory();
    }
}
