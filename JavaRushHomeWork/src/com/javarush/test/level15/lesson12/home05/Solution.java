package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {

    public Solution (){}
    public Solution (short sh) {}
    public Solution (byte by) {}

    protected Solution(String s){}
    protected Solution(double d){}
    protected Solution(char c){}

    Solution(boolean b){}
    Solution(Object o){}
    Solution(Double D) {}

    private Solution(Integer I){}
    private Solution(Short SH){}
    private Solution(Character CH){}


}

