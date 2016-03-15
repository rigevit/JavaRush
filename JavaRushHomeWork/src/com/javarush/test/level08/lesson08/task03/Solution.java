package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
//    public static void main (String[] args)
//    {
//        System.out.println(getCountTheSameFirstName(createMap(), "Иван"));
//        System.out.println(getCountTheSameLastName(createMap(), "Путен"));
//        System.out.println(createMap());
//    }

    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Сидоров", "Сергей");
        map.put("Петров", "Иван");
        map.put("Путен1", "Сергей");
        map.put("Медведев", "Андрей");
        map.put("Ананьев", "Валет");
        map.put("Расторгуев", "Валет");
        map.put("Баранов", "Антон");
        map.put("Путен", "Василий");
        map.put("Мамонов", "Афанасий");
        return (HashMap) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int a = 0;
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            String value = pair.getValue();
            {
                if (name.equals(value))
                    ++a;
            }
        }
        return a;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int a = 0;
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            String key = pair.getKey();
            {
                if (lastName.equals(key))
                    ++a;
            }
        }
        return a;

    }
}
