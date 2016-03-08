package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        int n = 0;
        int m = 0;
        int o = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int s = 0;
        int t = 0;
        int u = 0;
        int v = 0;
        //напишите тут ваш код
        for (int i = 1; i <= 10; i++)
        {
            n++;
            System.out.print(n + " ");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++)
        {
            m = m + 2;
            System.out.print(m + " ");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++)
        {
            o = o +3;
            System.out.print(o + " ");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++)
        {
            p = p + 4;
            System.out.print(p + " ");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++)
        {
            q = q + 5;
            System.out.print(q + " ");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++)
        {
            r = r + 6;
            System.out.print(r + " ");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++)
        {
            s = s + 7;
            System.out.print(s + " ");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++)
        {
            t = t + 8;
            System.out.print(t + " ");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++)
        {
            u = u + 9;
            System.out.print(u + " ");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++)
        {
            v = v + 10;
            System.out.print(v + " ");
        }


    }
}