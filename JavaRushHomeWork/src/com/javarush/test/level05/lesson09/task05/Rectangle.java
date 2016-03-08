package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
    private float left;
    private float top;
    private float width;
    private float height;

    public Rectangle (float left, float top, float width, float height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public Rectangle (float left, float top) {
        this.width = 0;
        this.height = 0;
        this.left = 1;
        this.top = 2;
    }
    public Rectangle (float width){
        this.width = width;
        this.height = width;
    }
    public Rectangle () {
        this.top = 1;
        this.left = 2;
        this.height = 3;
        this.width = 4;
    }
}
