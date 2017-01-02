package com.javarush.test.level09.lesson02.task03;

/* Метод должен вернуть номер строки кода, из которого вызвали этот метод
Написать пять методов, которые вызывают друг друга. Метод должен вернуть номер строки кода, из которого вызвали этот метод.
Воспользуйся функцией: element.getLineNumber().
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
 //       System.out.println(method5());
    }

    public static int method1()
    {
        method2();
//        return  /*add your code here*/ 0;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements [2];
        //int a = element.getLineNumber();
        return element.getLineNumber();
    }

    public static int method2()
    {
        method3();
//        return  /*add your code here*/ 0;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements [2];
        //int a = element.getLineNumber();
        return element.getLineNumber();
    }

    public static int method3()
    {
        method4();
//        return  /*add your code here*/ 0;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements [2];
        //int a = element.getLineNumber();
        return element.getLineNumber();
    }

    public static int method4()
    {
        method5();
//        return  /*add your code here*/ 0;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements [2];
        //int a = element.getLineNumber();
        return element.getLineNumber();
    }

    public static int method5()
    {
//        return  /*add your code here*/ 0;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements [2];
        //int a = element.getLineNumber();
        return element.getLineNumber();
    }

}
