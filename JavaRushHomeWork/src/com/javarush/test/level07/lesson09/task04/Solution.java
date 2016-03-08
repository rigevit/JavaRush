package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
            list.add(i, bis.readLine());
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        //напишите тут ваш код
        int n = list.size();
        for (int i = 0; i < n; i++)
            if (list.get(n - i - 1).indexOf("р") != -1 && list.get(n - i - 1).indexOf("л") == -1)
            {
                list.remove(n - i - 1);
            }
        for (int i = 0; i < n; i++)
            if (list.get(i).indexOf("л") != -1 && list.get(i).indexOf("р") == -1)
            {
                list.add(i, list.get(i));
                i++;
            }
        return list;
    }
}