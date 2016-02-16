package com.javarush.test.level03.lesson12.home02;

/* Я не хочу изучать Java, я хочу большую зарплату
Вывести на экран десять раз надпись «Я не хочу изучать Java, я хочу большую зарплату»
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        printText ("Я не хочу изучать Java, я хочу большую зарплату");
    }
    public static void printText (String s){
    for (int i = 0; i < 10; i++) {
        System.out.println(s);
    }
}
}
