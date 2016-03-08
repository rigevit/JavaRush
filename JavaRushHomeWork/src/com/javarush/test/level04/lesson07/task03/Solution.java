package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1s = reader.readLine();
        int num1i = Integer.parseInt(num1s);
        String num2s = reader.readLine();
        int num2i = Integer.parseInt(num2s);
        String num3s = reader.readLine();
        int num3i = Integer.parseInt(num3s);

        if (num1i<0 && num2i<0 && num3i<0) {
            System.out.println(0);
        }
        if (num1i>0 && num2i>0 && num3i>0) {
            System.out.println(3);
        }
        if ((num1i>0 && num2i>0 && num3i<0)||((num1i<0 && num2i>0 && num3i>0))||((num1i>0 && num2i<0 && num3i>0)))
            System.out.println(2);
        if ((num1i<0 && num2i<0 && num3i>0)||((num1i<0 && num2i>0 && num3i<0))||((num1i>0 && num2i<0 && num3i<0)))
            System.out.println(1);

    }
}
