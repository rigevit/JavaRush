package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String as = reader.readLine();
        int ai = Integer.parseInt(as);
        String bs = reader.readLine();
        int bi = Integer.parseInt(bs);
        String cs = reader.readLine();
        int ci = Integer.parseInt(cs);

        if ((ai == bi)&&(bi != ci)) {
            System.out.println(ai + " " + bi);
        }
        if ((bi == ci)&&(ai != ci)) {
            System.out.println(bi + " " + ci);
        }
        if ((ci == ai)&&(bi != ai)) {
            System.out.println(ci + " " + ai);
        }
        if (ai == bi && bi == ci) {
            System.out.println(ai + " " + bi + " " + ci);
        }
    }
}