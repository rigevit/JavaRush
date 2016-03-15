package com.javarush.test.level08.lesson08.task02;

import java.util.*;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/


public class Solution {
//    public static void main (String[] args)
//        {
//            for (Integer i: removeAllNumbersMoreThan10(createSet()))
//                System.out.println(i);
//        }

    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            set.add(1 + i);
        }
        return (HashSet) set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        LinkedList<Integer> setAL = new LinkedList<>(set);
        for (int i = 0; i < setAL.size(); i++)
        {
            if (setAL.get(i) > 10) {
                setAL.remove(i);
                i--;
            }
        }
        HashSet<Integer> set1 = new HashSet<>(setAL);
        return (HashSet) set1;
    }
}


