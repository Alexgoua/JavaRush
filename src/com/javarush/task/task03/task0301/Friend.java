package com.javarush.task.task03.task0301;

/*
Создать класс Friend
*/

public class Friend {
    String name;
    int age;
    char sex;

    public void initialize(String name) {
        this.name = name;
    }
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void initialize(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
