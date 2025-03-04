package com.meowdule.example.comprehensive.service;

import com.meowdule.example.comprehensive.domain.User;
import com.meowdule.example.comprehensive.persistence.UserRepository;

import java.util.List;
import java.util.regex.Pattern;

/* Service : 비즈니스 로직 */
public class UserService {
    private final UserRepository userRepository;
    private static final int MIN_AGE = 14;  // 회원가입 최소 나이
    private static final int MIN_PASSWORD_LENGTH = 6;  // 최소 비밀번호 길이
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(".*[!@#$%^&*(),.?\":{}|<>].*"); // 특수문자 포함

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers() {
        return userRepository.selectAllUsers();
    }

    public User findUserByNo(int no) {
        return userRepository.selectUserByNo(no);
    }

    public void registerUser(User user) {
        if (isDuplicateUserId(user.getId())) {
            throw new IllegalArgumentException("회원 가입 실패: 이미 존재하는 아이디입니다.");
        }

        if (!isValidPassword(user.getPwd())) {
            throw new IllegalArgumentException("회원 가입 실패: 비밀번호는 최소 " + MIN_PASSWORD_LENGTH + "자 이상이어야 하고 특수문자를 포함해야 합니다.");
        }

        if (user.getAge() < MIN_AGE) {
            throw new IllegalArgumentException("회원 가입 실패: 나이는 최소 " + MIN_AGE + "세 이상이어야 합니다.");
        }

        userRepository.insertUser(user);
    }

    public void removeUser(int no) {
        User existingUser = userRepository.selectUserByNo(no);
        if (existingUser == null) {
            throw new IllegalArgumentException("삭제 실패: 해당 회원을 찾을 수 없습니다.");
        }
        userRepository.deleteUser(no);
    }

    public void modifyUser(User updatedUser, String currentPassword) {
        User existingUser = userRepository.selectUserByNo(updatedUser.getNo());
        if (existingUser == null) {
            throw new IllegalArgumentException("회원 정보 수정 실패: 해당 회원을 찾을 수 없습니다.");
        }

        if (!existingUser.getPwd().equals(currentPassword)) {
            throw new IllegalArgumentException("회원 정보 수정 실패: 비밀번호가 일치하지 않습니다.");
        }

        if (!existingUser.getPwd().equals(updatedUser.getPwd()) && !isValidPassword(updatedUser.getPwd())) {
            throw new IllegalArgumentException("회원 정보 수정 실패: 새 비밀번호는 최소 " + MIN_PASSWORD_LENGTH + "자 이상이어야 하고 특수문자를 포함해야 합니다.");
        }

        userRepository.updateUser(updatedUser);
    }

    private boolean isDuplicateUserId(String userId) {
        return userRepository.selectAllUsers()
                .stream()
                .anyMatch(user -> user.getId().equals(userId));
    }

    private boolean isValidPassword(String password) {
        return password.length() >= MIN_PASSWORD_LENGTH && PASSWORD_PATTERN.matcher(password).matches();
    }
}