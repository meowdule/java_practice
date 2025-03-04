package com.meowdule.example.comprehensive.persistence;

import com.meowdule.example.comprehensive.domain.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 파일 저장 방식을 구현하는 구현체 */
public class FileUserStorage implements UserStorage {
    private static final String FILE_PATH = "src/main/java/com/ohgiraffers/comprehensive/db/userDB.dat";

    @Override
    public void saveUsers(List<User> users) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(users);
        } catch (IOException e) {
            throw new RuntimeException("파일 저장 중 오류 발생", e);
        }
    }

    @Override
    public List<User> loadUsers() {
        File file = new File(FILE_PATH);
        if (!file.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<User>) ois.readObject();
        } catch (EOFException e) {
            System.out.println("회원 정보를 모두 로딩하였습니다.");
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("파일 로딩 중 오류 발생", e);
        }
    }
}