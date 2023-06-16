package com.javarush.task.task03.task0301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/*
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }
//        Iterator<String> iterator = list.iterator();
        for (int i = 0; i < m; i++) {
            list.add(list.remove(0));
        }
        for (String s : list) {
            System.out.println(s);
        }


    }
}
