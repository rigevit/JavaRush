package com.javarush.test.level04.lesson04.task02;

/* Ближайшее к 10
Реализовать метод closeToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.
Подсказка:  используйте метод public static int abs(int a), который возвращает абсолютную величину числа.
*/

public class Solution
{
    public static void main(String[] args)
    {
        closeToTen(8,11);
        closeToTen(14,7);
        //System.out.println(abs(-4));
    }

    public static void closeToTen(int a, int b)
    {
        //::CODE:
        int c;
        int d;
        c = abs(a);
        d = abs(b);
        if (abs(c - 10)>abs(d - 10))
            System.out.println(d);
        if (abs(c - 10)<abs(d - 10))
            System.out.println(c);
        if (abs(c - 10)==abs(d - 10))
            System.out.println(c);

    }

    public static int abs(int a)
    {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}