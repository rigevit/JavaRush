package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
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

        //System.out.println((ai >= bi)?bi:ai);
        if (ai >= bi){
            System.out.println(bi);
        } else {
            System.out.println(ai);
        }
    }
}