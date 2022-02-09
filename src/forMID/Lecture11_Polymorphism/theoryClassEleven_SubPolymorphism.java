package forMID.Lecture11_Polymorphism;

//subclass polymorphism
class Shape
{
    void draw(){
        System.out.println("Drawing a random shape");
    }
}
class Triangle extends Shape
{
    void draw(){
        System.out.println("Drawing a triangle");
    }
}
class Rectangle extends Shape
{
    void draw(){
        System.out.println("Drawing a triangle");
    }
}
class Circle extends Shape
{
    void draw(){
        System.out.println("Drawing a circle");
    }
}
class Isosceles extends Triangle
{
    void draw(){
        System.out.println("Drawing an beforeMID.Isosceles triangle");
    }
}
class Square extends Rectangle
{
    void draw(){
        System.out.println("Drawing an beforeMID.Isosceles triangle");
    }
}


public class theoryClassEleven_SubPolymorphism
{
    public static void main(String[] args)
    {
        draw(new Triangle());
        draw(new Rectangle());
        draw(new Isosceles());
    }

    //doing : beforeMID.Shape shape = new beforeMID.Triangle(); using methode
    //assigning objects to (static) beforeMID.Shape Class' reference shape
    static void  draw(Shape shape) //assigning sub classes' object to super class
    {
        shape.draw();
    }

    //if it was not allowed, we'd have to write draw methode multiple time...
//    static void draw(beforeMID.Triangle triangle)
//    {
//        triangle.draw();
//    }
//
//    static void draw(beforeMID.Rectangle rectangle)
//    {
//        rectangle.draw();
//    }
//
//    static void draw(beforeMID.Isosceles rectangle)
//    {
//        rectangle .draw();
//    }
}
