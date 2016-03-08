package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1,
вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        int sum = 0;
//        //for (int i = 1; ;i++)
//        for (; true ;){
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            int num1i = Integer.parseInt(reader.readLine());
//            sum += num1i;
//            //System.out.println(sum);
//            if (num1i==-1) {
//                System.out.println(sum);
//                break;
//            }
//        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        for (; true; ) {
            Integer i = new Integer(reader.readLine());
            result += i;

            if (i == -1) {
                System.out.println(result);
                break;
            }
        }
    }
}
