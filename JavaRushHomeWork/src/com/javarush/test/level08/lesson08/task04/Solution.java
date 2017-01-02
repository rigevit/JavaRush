package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{


        public static HashMap<String, Date> createMap ()
        {
            HashMap<String, Date> map = new HashMap<String, Date>();
            map.put("Stallone", new Date("June 1 1980"));
            map.put("Ivanov", new Date("January 4 1999"));
            map.put("Sidorov", new Date("February 3 2002"));
            map.put("Petrov", new Date("June 25 1940"));
            map.put("Kozlov", new Date("July 1 1939"));
            map.put("Fakov", new Date("September 6 2015"));
            map.put("Rebrov", new Date("August 30 1998"));
            map.put("Iliev", new Date("December 2 1980"));
            map.put("Aliev", new Date("January 17 1970"));
            map.put("Ananiev", new Date("March 19 1997"));

            //напишите тут ваш код
            //removeAllSummerPeople(map);

            return map;
        }


    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> item = iterator.next();
            int month = item.getValue().getMonth();

            if (month > 4 && month < 8)
                iterator.remove();
        }

    }



//    public static void main (String[] args) {
//        //createMap();
//
//        //HashMap<String, Date> map1 =  removeAllSummerPeople(createMap());
//
//        for (Map.Entry<String, Date> pair: createMap().entrySet())
//        {
//            String key = pair.getKey();
//            Date value = pair.getValue();
//            System.out.println(key + " - " + value);
//        }
//
//    }

}
