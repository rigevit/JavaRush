package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
//        list.add(0, "мама");
//        list.add(1, "мыла");
//        list.add(2, "раму");
        Collections.addAll(list, "мама", "мыла", "раму");
        for (int i = 0; i < 6; i++)
        {
            if (i%2 != 0)
            {
                list.add(i, "именно");
            }
        }
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
