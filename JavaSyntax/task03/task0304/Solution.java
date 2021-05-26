package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        //напишите тут ваш код
        double x;
        double y;
        x = i * 0.10;
        y = i + x;
        return y;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
