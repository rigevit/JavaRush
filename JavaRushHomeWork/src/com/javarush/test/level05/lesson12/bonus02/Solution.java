package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, min(b, min(c, min(d, e))));
//        int min2 = min(a, b);
//        min2 = min(min2, c);
//        min2 = min(min2, d);
//        min2 = min(min2, e);

        System.out.println("Minimum = " + minimum);
//        System.out.println("Minbest = " + min2);
    }


    public static int min(int a, int b)
            //, int c, int d, int e)
    {
        return
                a < b ? a : b;
        //Math.min(a, b);
//        int[] minArray = {a, b, c, d, e};
//        Arrays.sort(minArray);
//        return minArray[0];

    }

}
