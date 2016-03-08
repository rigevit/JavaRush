package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a = 0;
        String sum = "сумма";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        for (int b = 1;; b++)
        {
            String is = reader.readLine();
            if (is.equals(sum))
            {
                System.out.println(a);
                break;
            }
            else
            {
                int ii = Integer.parseInt(is);
                a += ii;
                //System.out.println(a);
            }
        }
    }
}
