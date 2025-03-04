package com.meowdule.example.comprehensive.domain;

public enum BloodType {
    A, AB, B, O;

    /* fromString() 메서드를 추가하여, 혈액형 검증 로직을 BloodType 내부에서 처리 */
    public static BloodType fromString(String type) {
        return switch (type.toUpperCase()) {
            case "A" -> A;
            case "AB" -> AB;
            case "B" -> B;
            case "O" -> O;
            default -> throw new IllegalArgumentException("Invalid BloodType: " + type);
        };
    }
}