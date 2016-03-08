package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "Kolya";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Vasya";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Mashka";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Barsik";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Martuzik";
        Zerg zerg6 = new Zerg();
        zerg6.name = "Panda";
        Zerg zerg7 = new Zerg();
        zerg7.name = "Kainohrasen";
        Zerg zerg8 = new Zerg();
        zerg8.name = "Karabas";
        Zerg zerg9 = new Zerg();
        zerg9.name = "Barabas";
        Zerg zerg10 = new Zerg();
        zerg10.name = "Privetos";

        Protos protos1 = new Protos();
        protos1.name = "Atos";
        Protos protos2 = new Protos();
        protos2.name = "Partos";
        Protos protos3 = new Protos();
        protos3.name = "Aramis";
        Protos protos4 = new Protos();
        protos4.name = "Dartanian";
        Protos protos5 = new Protos();
        protos5.name = "Somebody";

        Terran terran1 = new Terran();
        terran1.name = "Man'ka";
        Terran terran2 = new Terran();
        terran2.name = "Vanda";
        Terran terran3 = new Terran();
        terran3.name = "Baliberda";
        Terran terran4 = new Terran();
        terran4.name = "Chayka";
        Terran terran5 = new Terran();
        terran5.name = "Prosvetov";
        Terran terran6 = new Terran();
        terran6.name = "Shpetniy";
        Terran terran7 = new Terran();
        terran7.name = "Zyk";
        Terran terran8 = new Terran();
        terran8.name = "Yakimenko";
        Terran terran9 = new Terran();
        terran9.name = "Malyhin";
        Terran terran10 = new Terran();
        terran10.name = "Lena";
        Terran terran11 = new Terran();
        terran11.name = "Nastya";
        Terran terran12 = new Terran();
        terran12.name = "Katya";
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}