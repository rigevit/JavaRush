package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human child1 = new Human();
        child1.name = "Misha";
        child1.sex = true;
        child1.age = 3;
        child1.children = new ArrayList<>();

        Human child2 = new Human();
        child2.name = "Masha";
        child2.sex = false;
        child2.age = 1;
        child2.children = new ArrayList<>();

        Human child3 = new Human();
        child3.name = "Gosha";
        child3.sex = true;
        child3.age = 5;
        child3.children = new ArrayList<>();

        Human father = new Human();
        father.name = "Grisha";
        father.sex = true;
        father.age = 31;
        father.children = new ArrayList<>();
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        Human mother = new Human();
        mother.name = "Galya";
        mother.sex = false;
        mother.age = 29;
        mother.children = father.children;

        Human grandma1 = new Human();
        grandma1.name = "Valentyna";
        grandma1.sex = false;
        grandma1.age = 56;
        grandma1.children = new ArrayList<>();
        grandma1.children.add(father);

        Human grandfa1 = new Human();
        grandfa1.name = "Vasiliy";
        grandfa1.sex = true;
        grandfa1.age = 58;
        grandfa1.children = grandma1.children;

        Human grandma2 = new Human();
        grandma2.name = "Antonina";
        grandma2.sex = false;
        grandma2.age = 51;
        grandma2.children = new ArrayList<>();
        grandma2.children.add(mother);

        Human grandfa2 = new Human();
        grandfa2.name = "Andrew";
        grandfa2.sex = true;
        grandfa2.age = 54;
        grandfa2.children = grandma2.children;

        System.out.println(grandma1.toString());
        System.out.println(grandfa1.toString());
        System.out.println(grandma2.toString());
        System.out.println(grandfa2.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
