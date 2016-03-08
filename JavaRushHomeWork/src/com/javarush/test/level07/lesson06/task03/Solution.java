package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> spisok = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            spisok.add(i, reader.readLine());
        }
        int min = spisok.get(0).length();
        for (int i = 1; i < spisok.size(); i++)
        {
            if (min > spisok.get(i).length())
            {
                min = spisok.get(i).length();
            }
        }
        for (int i = 0; i < spisok.size(); i++)
        {
            if (spisok.get(i).length() == min)
                System.out.println(spisok.get(i));
        }
    }
}
