package com.javarush.test.level14.lesson08.bonus01;

import java.io.InputStreamReader;
import java.util.*;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()

    {   //it's first exception

        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here
        try
        {
            int [] array = {1, 4, 5};
            array[3] = 6;
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Object obj = null;
            obj.hashCode();
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            String s = "abc";
            int a = Integer.parseInt(s);
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Object x[] = new String[3];
            x[0] = new Integer(0);
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Object x = new Integer(0);
            System.out.println((String)x);
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int c[]=new int[-2];
            Scanner in=new Scanner(new InputStreamReader(System.in));
            int b=in.nextInt();
            int a[]=new int[b];
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            String str = "Java Code Geeks!";
            char ch = str.charAt(50);
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            final int TOTAL_ELEMS = 10;
            final Random random = new Random();
            Collection integers = new HashSet(TOTAL_ELEMS);
            // Fill the collection with some random values.
            for(int i = 0; i < TOTAL_ELEMS; ++i)
            integers.add(random.nextInt());
            // Retrieve an unmodifiable view of the collection.
            Collection unmodifiableCollection = Collections.unmodifiableCollection(integers);
            // This statement throws an UnsupportedOperationException.
            unmodifiableCollection.add(random.nextInt());
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            final String CLASS_TO_LOAD = "main.java.Utils";
            Class loadedClass = Class.forName(CLASS_TO_LOAD);
            System.out.println("Class " + loadedClass + " found successfully!");
        } catch (Exception e)
        {
            exceptions.add(e);
        }

    }
}
