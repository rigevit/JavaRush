package com.javarush.test.level09.lesson11.home04;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String dateS = reader.readLine();
        Date dateD = new Date(reader.readLine());
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(dateFormat.format(dateD).toUpperCase());
    }
//    class MyEx extends Exception{}

//    class M1{
//
//        void mm(){
//            try {
//                FileReader n = new FileReader("dfggggg");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            int v= 0;
//            int nc = 6/v;
//
//           // try {
//                mm4();
//            //} catch (MyEx myEx) {
//              //  myEx.printStackTrace();
//           //}
//
//        }
//        void mm4() throws RuntimeException{
//          throw new ArithmeticException();
//        }
//
//
//    }
}
