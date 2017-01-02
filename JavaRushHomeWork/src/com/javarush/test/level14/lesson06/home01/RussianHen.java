package com.javarush.test.level14.lesson06.home01;

/**
 * Created by veles on 17.06.2016.
 */
public class RussianHen extends Hen {

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 1;
    }
}
