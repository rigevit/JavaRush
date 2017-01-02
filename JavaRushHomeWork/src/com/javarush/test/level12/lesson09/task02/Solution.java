package com.javarush.test.level12.lesson09.task02;

/* Интерфейсы Fly, Run, Swim
Напиши public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавить в каждый интерфейс по одному методу.
*/

import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {

    }

//add interfaces here - добавь интерфейсы тут
    public interface Fly
{
    void up (float height);

}

    public interface Run
    {
        void footUp (Date date);

    }
    public interface Swim
    {
        void isInWater (int x, int y);

    }
}
