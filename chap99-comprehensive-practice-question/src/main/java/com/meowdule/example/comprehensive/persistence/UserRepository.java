package com.meowdule.example.comprehensive.persistence;

import com.meowdule.example.comprehensive.domain.User;

import java.util.ArrayList;
import java.util.List;

/* User 데이터 저장 및 조회 */
public class UserRepository {
    private final UserStorage userStorage;
    private final List<User> userList;

    public UserRepository(UserStorage userStorage) {
        this.userStorage = userStorage;
        this.userList = userStorage.loadUsers();
    }

    public List<User> selectAllUsers() {
        return new ArrayList<>(userList);
    }

    public User selectUserByNo(int no) {
        return userList.stream().filter(user -> user.getNo() == no).findFirst().orElse(null);
    }

    public void insertUser(User user) {
        userList.add(user);
        userStorage.saveUsers(userList);
    }

    public void deleteUser(int no) {
        userList.removeIf(user -> user.getNo() == no);
        userStorage.saveUsers(userList);
    }

    public void updateUser(User updatedUser) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getNo() == updatedUser.getNo()) {
                userList.set(i, updatedUser);
                userStorage.saveUsers(userList);
                break;
            }
        }
    }
}