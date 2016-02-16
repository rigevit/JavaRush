package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда»,
«четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String snum = reader.readLine();
        int inum = Integer.parseInt(snum);
        if (inum == 1)
        {
            System.out.println("понедельник");
        }
        if (inum == 2)
        {
            System.out.println("вторник");
        }
        if (inum == 3)
        {
            System.out.println("среда");
        }
        if (inum == 4)
        {
            System.out.println("четверг");
        }
        if (inum == 5)
        {
            System.out.println("пятница");
        }
        if (inum == 6)
        {
            System.out.println("суббота");
        }
        if (inum == 7)
        {
            System.out.println("воскресенье");
        }
        if (inum<1 || inum>7)
        {
            System.out.println("такого дня недели не существует");
        }
    }

}