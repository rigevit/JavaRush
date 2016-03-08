package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1s = reader.readLine();
        int num1i = Integer.parseInt(num1s);
        String num2s = reader.readLine();
        int num2i = Integer.parseInt(num2s);
        String num3s = reader.readLine();
        int num3i = Integer.parseInt(num3s);
        int temp;

        if (num1i<num2i) {
            temp = num1i;
            num1i = num2i;
            num2i = temp;
        }
        if (num2i<num3i) {
            temp = num2i;
            num2i = num3i;
            num3i = temp;
        }
        if (num1i<num2i) {
            temp = num1i;
            num1i = num2i;
            num2i = temp;
        }
        System.out.println(num2i);
    }
}
