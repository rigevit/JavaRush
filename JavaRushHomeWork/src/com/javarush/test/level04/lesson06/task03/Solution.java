package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
//class Mint{
//    int v;
//}
public class Solution
{
    public static void main(String[] args) throws Exception
    {

        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String as = reader.readLine();
//        Mint aii = new Mint();
//        aii.v = Integer.parseInt(as);
        int ai = Integer.parseInt(as);
        String bs = reader.readLine();
//        Mint bii = new Mint();
//        bii.v = Integer.parseInt(bs);
        int bi = Integer.parseInt(bs);
        String cs = reader.readLine();
//        Mint cii = new Mint();
//        cii.v = Integer.parseInt(cs);
        int ci = Integer.parseInt(cs);
        int pi;


        //swap(ai, bi);
        //System.out.println(ai, bi);

        if (ai < bi){
            pi = ai;
            ai = bi;
            bi = pi;
//            swap(bii.v, aii.v);
        }
//        System.out.println(ai + " " + bi + " " + ci);
        if (ai < ci){
            pi = ai;
            ai = ci;
            ci = pi;
        }
//        System.out.println(ai + " " + bi + " " + ci);
        if (bi < ci){
            pi = bi;
            bi = ci;
            ci = pi;
        }
        System.out.println(ai + " " + bi + " " + ci);

    }
//    public static void swap(int a, int b) {
//        int c = a;
//        a = b;
//        b = c;
//    }

//    public static void swap(Mint a, Mint b) {
//        int c = a.v;
//        a.v = b.v;
//        b.v = c;
//    }
}
