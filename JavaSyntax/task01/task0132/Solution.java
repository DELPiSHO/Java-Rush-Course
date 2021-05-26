package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
     /*   String s = String.valueOf(number);
        int digsum = 0;
        for (int i = 0; i<3 ; i++ ) {
            digsum = digsum + Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return digsum;
        */
        return (int)(number/100 + (number%100)/10 + number%10) ;
    }
}