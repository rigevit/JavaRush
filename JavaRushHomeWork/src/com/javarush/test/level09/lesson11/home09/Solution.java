package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();
        map.put("Tom", new Cat("Tom"));
        map.put("Lisa", new Cat("Lisa"));
        map.put("Имя", new Cat("Kisa"));
        map.put("Kisa", new Cat("Marusya"));
        map.put("Bubusya", new Cat("Bubusya"));
        map.put("Bonya", new Cat("Bonya"));
        map.put("Gonya", new Cat("Gonya"));
        map.put("Biba", new Cat("Biba"));
        map.put("Buba", new Cat("Buba"));
        map.put("Bububa", new Cat("Bububa"));
           return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();
        for (Cat value: map.values())
                set.add(value);
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
