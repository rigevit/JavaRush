package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

import com.sun.corba.se.impl.presentation.rmi.StubInvocationHandlerImpl;
import com.sun.javafx.stage.StageHelper;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
//        String a = "Мама";
//        String b = "Мыла";
//        String c = "Раму";
        System.out.println("Мама" + "Мыла" + "Раму");
        System.out.println("Мыла" + "Мама" + "Раму");
        System.out.println("Мыла" + "Раму" + "Мама");
        System.out.println("Раму" + "Мыла" + "Мама");
        System.out.println("Раму" + "Мама" + "Мыла");
        System.out.println("Мама" + "Раму" + "Мыла");
//        System.out.println(a + b + c);
//        System.out.println(b + a + c);
//        System.out.println(b + c + a);
//        System.out.println(c + b + a);
//        System.out.println(c + a + b);
//        System.out.println(a + c + b);

    }
}