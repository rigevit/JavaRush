package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grandma1 = new Human();
        grandma1.name = "Larisa";
        grandma1.sex = false;
        grandma1.age = 56;
        System.out.println(grandma1.toString());

        Human grandfa1 = new Human();
        grandfa1.name = "Leonid";
        grandfa1.sex = true;
        grandfa1.age = 60;
        System.out.println(grandfa1.toString());

        Human grandma2 = new Human();
        grandma2.name = "Anastasiya";
        grandma2.sex = false;
        grandma2.age = 50;
        System.out.println(grandma2.toString());

        Human grandfa2 = new Human();
        grandfa2.name = "Anton";
        grandfa2.sex = true;
        grandfa2.age = 53;
        System.out.println(grandfa2.toString());

        Human mother = new Human();
        mother.name = "Tonya";
        mother.sex = false;
        mother.age = 32;
        mother.mother = grandma1;
        mother.father = grandfa1;
        System.out.println(mother.toString());

        Human father = new Human();
        father.name = "Taras";
        father.sex = true;
        father.age = 35;
        father.mother = grandma2;
        father.father = grandfa2;
        System.out.println(father.toString());

        Human child1 = new Human();
        child1.name = "Kolya";
        child1.sex = true;
        child1.age = 1;
        child1.mother = mother;
        child1.father = father;
        System.out.println(child1.toString());

        Human child2 = new Human();
        child2.name = "Marina";
        child2.sex = false;
        child2.age = 3;
        child2.mother = mother;
        child2.father = father;
        System.out.println(child2.toString());

        Human child3 = new Human();
        child3.name = "Vova";
        child3.sex = true;
        child3.age = 5;
        child3.mother = mother;
        child3.father = father;
        System.out.println(child3.toString());
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
