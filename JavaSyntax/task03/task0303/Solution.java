package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(115,3.1));
        System.out.println(convertEurToUsd(1421,3.1));
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        double p;
        p = eur * course;
        return p;
    }
}
