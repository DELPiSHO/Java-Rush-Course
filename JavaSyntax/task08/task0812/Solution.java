package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int period = 1;
        int result = 0;


        for (int i = 0; i < 10; i++) {
            int s = Integer.parseInt(reader.readLine());
            list.add(s);
        }

        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) == list.get(i + 1))
                period++;
            else period = 1;

            if (period > result) result = period;

        }
        System.out.println(result);
    }
}