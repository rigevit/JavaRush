package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human {
        //напишите тут ваши переменные и конструкторы
        public String name;
        public int age;
        public double height;
        public int weight;
        public String surname;
        public String sex;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String sex)
        {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Human (String name, double height)
        {
            this.name = name;
            this.height = height;
        }

        public Human (String name, String surname, String sex)
        {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
        }

        public Human (String name, int age, String surname)
        {
            this.name = name;
            this.age = age;
            this.surname = surname;
        }

        public Human (String name, double height, String sex)
        {
            this.name = name;
            this.height = height;
            this.sex = sex;
        }

        public Human (String name, String sex, int weight)
        {
            this.name = name;
            this.sex = sex;
            this.weight = weight;
        }

        public Human (String name, double height, int age)
        {
            this.name = name;
            this.height = height;
            this.age = age;
        }

        public Human (String name, String surname, String sex, int age)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }
    }
}
