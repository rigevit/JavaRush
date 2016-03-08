package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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

        if (num1i == num2i)
            System.out.println(3);
        if (num2i == num3i)
            System.out.println(1);
        if (num1i == num3i)
            System.out.println(2);

    }
}
