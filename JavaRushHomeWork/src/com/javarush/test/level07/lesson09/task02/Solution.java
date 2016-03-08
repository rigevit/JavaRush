package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            list.add(i, reader.readLine());
        }
        list.remove(2);
        for (int i = 0; i < list.size(); i++)
        {
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }


//        class a{
//            void gav(){
//            System.out.println("from a");
//            }
//        }
//        class b extends a{
//            void gav(){
//            System.out.println("from b");
//            }
//        }
//        a a1 = new b();
//        a1.gav();
//
//        a a2 = (a) a1;
//        a2.gav();
//
//        a aa[] = new a[2];
//        aa[0] = new a();
//        aa[1] = new b();
//
//        for (a ai: aa){
//            ai.gav();
//        }
//        //b b1 = (b) new a();
    }
}
