package forFINAL.Lecture14_Abstract;

//interface-interface -> extends
//class-interface -> implement

interface Student
{
    int f = 0;

    void A();
    void R();
}

interface Teacher extends Student //one interface can extend other Interface
{
    void tn();
}

class NormalClass
{
    void insideNormal()
    {
        System.out.println("Inside Normal");
    }
}

//we can inherit from a concrete class using extend before implementing
class Implement extends NormalClass implements Student, Teacher //must override; if don't want, make it abstract too.
{
    @Override
    public void A() {
        System.out.println("inside A ");
    }

    @Override
    public void R() {
        System.out.println("inside R ");
    }

    @Override
    public void tn() {
        System.out.println("inside tn ");
    }
}

abstract class Implement2 implements Student, Teacher
{
    //tryna implement it without overriding
    //using abstract keyword
}

public class Interface2
{
    //
}