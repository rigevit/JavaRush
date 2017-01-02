package com.javarush.test.level12.lesson02.task05;

/* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
Написать метод, который определяет, объект какого класса ему передали,
и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o)
    {
        //Напишите тут ваше решение
        if (o instanceof Cow)
            return ((Cow) o).getName();
        if (o instanceof Dog)
            return ((Dog) o).getName();
        if (o instanceof Whale)
            return ((Whale) o).getName();
        else
            return "Неизвестное животное";
    }

    public static class Cow
    {
        public String getName()
        {
            return "Корова";
        }
    }

    public static class Dog
    {
        public String getName()
        {
            return "Собака";
        }
    }

    public static class Whale
    {
        public String getName()
        {
            return "Кит";
        }
    }

    public static class Pig
    {
        public String getName()
        {
            return "Неизвестное животное";
        }
    }
}
