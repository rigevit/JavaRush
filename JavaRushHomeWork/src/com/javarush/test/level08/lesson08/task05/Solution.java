package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Stallone", "Silvestr");
        map.put("Ivanov", "Dima");
        map.put("Sidorov", "Petr");
        map.put("Petrov", "Dima");
        map.put("Kozlov", "Roman");
        map.put("Fakov", "Ivan");
        map.put("Rebrov", "Sergey");
        map.put("Iliev", "Alex");
        map.put("Aliev", "Ivan");
        map.put("Ananiev", "Vasya");

        return (HashMap<String, String>) map;
    }

//    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
//    {
//        //напишите тут ваш код
//        for (int i=0; i<map.size(); i++){
//            ArrayList<String> arrayList = new ArrayList<String>(map.keySet());
//            for (int j=i+1; j<arrayList.size(); j++){
//                if (map.get(arrayList.get(i)).equals(map.get(arrayList.get(j)))) map.remove(arrayList.get(j));
//            }
//        }
//
//
//    }
public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
{
    //напишите тут ваш код
    ArrayList<String> ar  = new ArrayList<>(map.values());
    HashMap<String,Integer> m = new HashMap<>();

    for (int i = 0; i <ar.size() ; i++) {
        if (m.get(ar.get(i))!=null){
            int pr = m.get(ar.get(i));
            pr++;

            m.put(ar.get(i),pr); //решение родил почти сразу, но не мог понять почему не работает,
        }                        //т.к. pr++ пихал внутрь этого метода put.
        else m.put(ar.get(i),1);
    }


    HashMap<String, String> copy = new HashMap<String, String>(map);
    for (Map.Entry<String, String> pair: copy.entrySet())
    {
        int mn = m.get(pair.getValue());
        if (mn>1) map.remove(pair.getKey());
    }

}


    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

        public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            System.out.println(pair.getKey()+":"+pair.getValue());

        }

    }

}
