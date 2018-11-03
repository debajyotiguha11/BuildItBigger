package com.htcardone.libjokes;
import java.util.Random;

public class Joker {
    public static String[] jokes = {
            "joke 1",
            "joke 2",
            "joke 3",
            "joke 4",
            "joke 5"};

    public static String getJoke() {
        return jokes[new Random().nextInt(jokes.length)];
    }
}