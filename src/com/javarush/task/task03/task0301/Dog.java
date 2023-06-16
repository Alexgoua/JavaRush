package com.javarush.task.task03.task0301;

/*
Геттеры и сеттеры для класса Dog
*/

public class Dog {
    String name;
    int age;

    String getName() {
        return this.name;
    }
    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return this.age;
    }
    void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.toString());
    }
}
