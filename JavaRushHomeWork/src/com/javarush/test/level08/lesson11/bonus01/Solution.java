package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("January", "1");
        map.put("Fabruary", "2");
        map.put("March", "3");
        map.put("April", "4");
        map.put("May", "5");
        map.put("June", "6");
        map.put("July", "7");
        map.put("August", "8");
        map.put("September", "9");
        map.put("October", "10");
        map.put("November", "11");
        map.put("December", "12");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //for (;true;){
        String s = reader.readLine();
        for (Map.Entry<String, String> pair: map.entrySet()) {

            String month = pair.getKey();
            String numberMonth = pair.getValue();
            if (s.equals(month))
                System.out.println(month + " is " + numberMonth + " month");
//            else System.out.println("You wrote bullshit");
        //}
        }
    }
}
