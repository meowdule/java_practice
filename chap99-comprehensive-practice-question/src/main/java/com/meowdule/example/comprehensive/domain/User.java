package com.meowdule.example.comprehensive.domain;

import java.io.Serializable;
import java.util.Arrays;

/* 불변 객체의 형태로 관리
 * setter 제거 후 update 메소드만 사용
 * */
public class User implements Serializable {
    private int no;
    private String id;
    private String pwd;
    private int age;
    private String[] hobbies;
    private BloodType bloodType;

    public User(int no, String id, String pwd, int age, String[] hobbies, BloodType bloodType) {
        this.no = no;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
        this.bloodType = bloodType;
    }

    public User update(String id, int age, String[] hobbies, BloodType bloodType) {
        return new User(this.no, id, this.pwd, age, hobbies, bloodType);
    }

    public int getNo() { return no; }
    public String getId() { return id; }
    public String getPwd() { return pwd; }
    public int getAge() { return age; }
    public String[] getHobbies() { return hobbies; }
    public BloodType getBloodType() { return bloodType; }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", bloodType=" + bloodType +
                '}';
    }

}