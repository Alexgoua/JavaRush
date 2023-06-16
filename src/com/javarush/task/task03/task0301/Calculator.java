package com.javarush.task.task03.task0301;

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static double division(int a, int b) {
        return (double)a/b;
    }

    public static double percent(int a, int b) {
        return a*(b/100.0);
    }

    public static void main(String[] args) {
        System.out.println(percent(4, 40));
        System.out.println(division(10, 4));
    }
}