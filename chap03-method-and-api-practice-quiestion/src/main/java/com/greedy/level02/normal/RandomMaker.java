package com.greedy.level02.normal;

import java.util.Random;

public class RandomMaker {
    Random random = new Random();
    public int randomNumber(int min, int max) {
        return random.nextInt((max - min) + 1) + min ;
    }

    public String randomUpperAlphabet(int length) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomChar = (char) ('A' + random.nextInt(26)); // 'A' ~ 'Z'
            result.append(randomChar);
        }
        return result.toString();
    }

    public String rockPaperSissors () {
        String[] choices = {"가위", "바위", "보"};
        return choices[random.nextInt(3)];
    }

    public String tossCoin() {
        return random.nextBoolean() ? "앞면" : "뒷면";
    }
}
