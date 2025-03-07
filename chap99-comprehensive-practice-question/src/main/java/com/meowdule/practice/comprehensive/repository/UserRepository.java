package com.meowdule.practice.comprehensive.repository;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.meowdule.practice.comprehensive.user.User;

import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * 사용자 데이터를 파일 기반으로 저장하는 저장소 구현 클래스
 */
public class UserRepository implements UserStorage {
    private static final String FILE_PATH = "C:/develop/java_programming_practice/chap99-comprehensive-practice-question/src/main/java/com/meowdule/practice/comprehensive/db/user_data.json";
    private final Map<String, User> userMap;
    private final Gson gson;

    public UserRepository() {
        this.gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter()) // LocalDate 지원 추가
                .setPrettyPrinting()
                .create();
        this.userMap = loadUsers();
    }

    /**
     * 사용자 정보를 파일에서 로드
     */
    private Map<String, User> loadUsers() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return new HashMap<>();
        }
        try (Reader reader = new FileReader(file)) {
            return gson.fromJson(reader, new TypeToken<Map<String, User>>() {}.getType());
        } catch (IOException e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }

    /**
     * 사용자 정보를 파일에 저장
     */
    private void saveUsers() {
        try (Writer writer = new FileWriter(FILE_PATH)) {
            gson.toJson(userMap, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 사용자 저장
     */
    @Override
    public void saveUser(User user) {
        userMap.put(user.getUserId(), user);
        saveUsers();
    }

    /**
     * 사용자 ID로 사용자 찾기
     */
    @Override
    public User findUserById(String userId) {
        return userMap.get(userId);
    }

    /**
     * 사용자 정보 업데이트
     */
    @Override
    public void updateUser(User user) {
        if (userMap.containsKey(user.getUserId())) {
            userMap.put(user.getUserId(), user);
            saveUsers();
        }
    }

    /**
     * 🔹 사용자 데이터 삭제 기능 추가
     */
    public void deleteUser(String userId) {
        if (userMap.containsKey(userId)) {
            userMap.remove(userId);
            saveUsers(); // JSON 파일에 즉시 반영
            System.out.println(userId + " 사용자가 삭제되었습니다.");
        } else {
            System.out.println(userId + " 사용자를 찾을 수 없습니다.");
        }
    }

    /**
     * LocalDate 변환을 위한 커스텀 어댑터
     */
    private static class LocalDateAdapter implements JsonSerializer<LocalDate>, JsonDeserializer<LocalDate> {
        private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE;

        @Override
        public JsonElement serialize(LocalDate localDate, Type type, JsonSerializationContext context) {
            return new JsonPrimitive(localDate.format(FORMATTER));
        }

        @Override
        public LocalDate deserialize(JsonElement json, Type type, JsonDeserializationContext context) {
            return LocalDate.parse(json.getAsString(), FORMATTER);
        }
    }
}