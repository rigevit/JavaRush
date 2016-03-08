package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);

        //напишите тут ваш код
        Dog tjDog = new Dog("Smothy", 12, 6);
        Cat tomCat = new Cat("Tom", "blue", 50);

    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Dog
    {
        String name;
        int weight;
        int age;

        public Dog (String name, int weight, int age)
        {
            this.name = name;
            this.weight = weight;
            this.age = age;
        }
    }
    public static class Cat
    {
        String  name;
        String colour;
        int height;

        public Cat (String name, String colour, int height)
        {
            this.name = name;
            this.colour = colour;
            this.height = height;
        }
    }

    //добавьте тут ваши классы

}
