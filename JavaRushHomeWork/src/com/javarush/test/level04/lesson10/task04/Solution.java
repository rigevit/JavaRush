package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int s = 1;
        while (s++<=10) {

            int k = 1;
            while (k <= 10) {
                System.out.print("S");
                k++;
            }
            System.out.println();
        }

    }
}
