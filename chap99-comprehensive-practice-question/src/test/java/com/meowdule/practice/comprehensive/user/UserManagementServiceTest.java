package com.meowdule.practice.comprehensive.user;

import com.meowdule.practice.comprehensive.repository.UserRepository;
import com.meowdule.practice.comprehensive.repository.UserStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * UserManagementService 테스트 클래스
 */
class UserManagementServiceTest {
    private UserManagementService userManagementService;
    private UserStorage userStorage;

    @BeforeEach
    void setUp() {
        userStorage = new UserRepository();
        userManagementService = new UserManagementService(userStorage);
    }

    @Test
    void testRegisterUser() {
        userManagementService.registerUser("testUser", "testPass", "테스트 유저", 25);

        User retrievedUser = userStorage.findUserById("testUser");
        assertNotNull(retrievedUser);
        assertEquals("testUser", retrievedUser.getUserId());
        assertEquals("testPass", retrievedUser.getPassword());

        // 테스트 후 데이터 삭제
        ((UserRepository) userStorage).deleteUser("testUser");
    }

    @Test
    void testLoginUser() {
        userManagementService.registerUser("loginUser", "password123", "로그인 유저", 30);

        userManagementService.loginUser("loginUser", "password123");
        assertTrue(userManagementService.isUserLoggedIn());
        assertEquals("loginUser", userManagementService.getLoggedInUser().getUserId());

        // 테스트 후 데이터 삭제
        ((UserRepository) userStorage).deleteUser("loginUser");
    }

    @Test
    void testLoginUserWithWrongPassword() {
        userManagementService.registerUser("wrongPassUser", "correctPass", "비밀번호 테스트", 22);

        userManagementService.loginUser("wrongPassUser", "wrongPass");
        assertFalse(userManagementService.isUserLoggedIn());

        // 테스트 후 데이터 삭제
        ((UserRepository) userStorage).deleteUser("wrongPassUser");
    }

    @Test
    void testLogoutUser() {
        userManagementService.registerUser("logoutUser", "logoutPass", "로그아웃 유저", 28);
        userManagementService.loginUser("logoutUser", "logoutPass");
        assertTrue(userManagementService.isUserLoggedIn());

        userManagementService.logoutUser();
        assertFalse(userManagementService.isUserLoggedIn());

        // 테스트 후 데이터 삭제
        ((UserRepository) userStorage).deleteUser("logoutUser");
    }
}
