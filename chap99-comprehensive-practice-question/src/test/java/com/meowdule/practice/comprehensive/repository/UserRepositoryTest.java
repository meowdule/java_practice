package com.meowdule.practice.comprehensive.repository;

import com.meowdule.practice.comprehensive.user.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/**
 * UserRepository 테스트 클래스
 */
class UserRepositoryTest {
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
    }

    @Test
    void testSaveAndFindUser() {
        User user = new User("testUser", "testPassword", "테스트 유저", 25);
        userRepository.saveUser(user);

        User retrievedUser = userRepository.findUserById("testUser");
        assertNotNull(retrievedUser);
        assertEquals("testUser", retrievedUser.getUserId());
        assertEquals("testPassword", retrievedUser.getPassword());
        assertEquals("테스트 유저", retrievedUser.getName());
        assertEquals(25, retrievedUser.getAge());
    }

    @Test
    void testUpdateUser() {
        User user = new User("updateUser", "oldPassword", "업데이트 유저", 30);
        userRepository.saveUser(user);

        User updatedUser = new User("updateUser", "newPassword", "업데이트 유저", 30);
        userRepository.updateUser(updatedUser);

        User retrievedUser = userRepository.findUserById("updateUser");
        assertNotNull(retrievedUser);
        assertEquals("newPassword", retrievedUser.getPassword());
    }
}
