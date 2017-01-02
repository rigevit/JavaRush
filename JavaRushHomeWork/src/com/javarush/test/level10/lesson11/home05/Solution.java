package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }


        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        //напишите тут ваш код

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++)
            builder.append(list.get(i));
        String inputString = String.valueOf(builder);
        char[] charArray = inputString.toCharArray();
//
//        HashMap<String, Integer> map = new HashMap<>();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        int x = 0;
        for (int i = 0; i < alphabet.size(); i++) {

            for (int j = 0; j < charArray.length; j++)
            {
                if (charArray[j] == alphabet.get(i)) {
                    x++;
                }
            }
            map.put(String.valueOf(alphabet.get(i)), x);
            x = 0;
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
