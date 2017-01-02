package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static
    {
        labels.put(324.9, "sfefd");
        labels.put(45.8, "vbcvb");
        labels.put(4685.0, "xvdvcvd");
        labels.put(3843543.7, "xvcvxdvxv");
        labels.put(4557.6, "xvdcxdvx");
    }


    public static void main(String[] args) {


        System.out.println(labels);
    }
}
