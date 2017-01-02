package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //C:\temp\sortnumbers.txt
        ArrayList<Integer> list = new ArrayList<>();

        File f = new File(reader.readLine());
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        while ((line = fin.readLine()) != null) {
            try {
                list.add(Integer.parseInt(line));
            } catch (NumberFormatException e) {
            }
        }

        ArrayList<Integer> listPair;
        listPair = filPairList(list);

        sortAc(listPair);

        printList(listPair);

}

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

    public static void sortAc(ArrayList<Integer> list) {
        int t;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                t = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, t);
                i = -1;
            }
        }
    }

    public static ArrayList<Integer> filPairList (ArrayList<Integer> list)
    {
        ArrayList<Integer> listPairs = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                listPairs.add(list.get(i));
        }
        return listPairs;
    }
}
