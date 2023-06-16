package com.javarush.task.task03.task0301;

/*
Метод finalize класса Cat
*/

import java.util.ArrayList;

/*
Статические коты
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
        cats.add(this);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();
        printCats();
    }

    public static void printCats() {
        for (Cat cat: cats) {
            System.out.println(cat);
        }
    }
}

