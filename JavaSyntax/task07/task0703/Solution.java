package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] index = new int[10];
        String[] str = new String[10];

        for (int i = 0; i < str.length; i++) {
            str[i] = reader.readLine();
            index[i] = str[i].length();
        }
     /*   index[0] = str[0].length();
        index[1] = str[1].length();
        index[2] = str[2].length();
        index[3] = str[3].length();
        index[4] = str[4].length();
        index[5] = str[5].length();
        index[6] = str[6].length();
        index[7] = str[7].length();
        index[8] = str[8].length();
        index[9] = str[9].length();
        */
        for (int i = 0; i < 10; i++) {
                System.out.println(index[i]);
        }
    }
}
