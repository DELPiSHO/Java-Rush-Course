package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String k;

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            else {
                if (s.length() % 2 == 0) {
                    k = s + " " + s;
                    list.add(k);
                } else {
                    k = s + " " + s + " " + s;
                    list.add(k);
                }
            }
        }

     /*   ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            listUpperCase.add(s.toUpperCase());
        }

        for (int i = 0; i < listUpperCase.size(); i++) {
            System.out.println(listUpperCase.get(i));
        }*/
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}