package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int[] liczby = new int[20];

        for (int i = 0; i < 20; i++){
            liczby[i] = Integer.parseInt(reader.readLine());
        }
        for(int a: liczby){
            if(a>maximum)
                maximum = a;

            if(a<minimum)
                minimum = a;
        }

        //напишите тут ваш код

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
