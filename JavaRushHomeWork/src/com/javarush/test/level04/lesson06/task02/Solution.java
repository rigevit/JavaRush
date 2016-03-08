package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String ds = reader.readLine();
        int di = Integer.parseInt(ds);

        if (ai>=bi && ai>=ci && ai>=di) {
            System.out.println(ai);
        }
        if (bi>=ai && bi>=ci && bi>=di) {
            System.out.println(bi);
        }
        if (ci>=bi && ci>=ai && ci>=di) {
            System.out.println(ci);
        }
        if (di>=bi && di>=ci && di>=ai) {
            System.out.println(di);
        }
    }
}
