package com.javarush.test.level15.lesson12.home05;

/**
 * Created by veles on 13.07.2016.
 */
public class SubSolution extends Solution {
    public SubSolution(int a) {
        super(a);
    }
    public SubSolution(short sh)
    {
        super(sh);
    }
    public SubSolution(byte by)
    {
        super (by);
    }

    protected SubSolution(String s)
    {
        super(s);
    }
    protected SubSolution(char c)
    {
        super(c);
    }
    protected SubSolution(double d)
    {
        super(d);
    }
    SubSolution(boolean b){
        super(b);
    }
    SubSolution(Object o){
        super(o);
    }
    SubSolution(Double D) {
        super(D);
    }

    private SubSolution(Integer I){}
    private SubSolution(Short SH){}
    private SubSolution(Character CH){}
}
