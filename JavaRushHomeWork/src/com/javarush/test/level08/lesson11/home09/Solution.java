package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
//        String d = "JANUARY 2 2022";
//        System.out.println(d + " " + isDateOdd(d));
    }

    public static boolean isDateOdd(String date)
    {
        Date date2 = new Date(date);
        Date date1 = new Date();
        date1.setSeconds(0);
        date1.setMinutes(0);
        date1.setHours(0);

        date1.setDate(1);
        date1.setMonth(0);
        date1.setYear(date2.getYear());
        long msDay = 24 * 60 * 60 * 1000;
        long raznica = date2.getTime() + msDay - date1.getTime();
        int daycount = (int)(raznica/msDay);

        return ((daycount%2==0)?((true)):((false)));
    }
}
