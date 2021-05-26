package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i;
        int j;
        int pr;
        for (i = 1; i < 11; i++) {
            for (j = 1; j < 11; j++) {
                pr = i * j;
                System.out.print(pr + "\t"  + " ");
            }
            System.out.println();
        }
    }
}