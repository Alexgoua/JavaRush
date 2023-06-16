package com.javarush.task.task03.task0301;

public class StringHelper {
    public static String multiply(String text) {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result = result + text;
        }
        return result;
    }

    public static String multiply(String text, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + text;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("privet"));
        System.out.println();
        System.out.println(multiply("Ok", 3));
    }
}
