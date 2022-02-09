package forMID.Lecture9_ClassObject_Final;

class Parents
{
    String name;
    void printName()
    {
        System.out.println(name);
    }

    //parents class constructor with one parameter
    Parents(String name)
    {
        this.name = name;
    }
}

class Child extends Parents
{
   // super(parameter); will call the constructor of the parents class
    String name;
    public Child(String p, String c)
    {
//        super.name = p;
//        super.printName(); //nazmul
        super(p); //this will call parents' constructors
        name = c;
    }

    void printName()
    {
        System.out.println(super.name + " " + name); //nazmul; abdur rahman
    }
}

//super(parameter); and super(parameterless);
class One
{
    One()
    {
        System.out.println("Inside beforeMID.One");
    }

    One (String msg)
    {
        System.out.println("beforeMID.One : " + msg);
    }
}

class Two extends One
{
    Two()
    {
        System.out.println("Inside beforeMID.Two");
    }

    Two (String msg)
    {
        System.out.println("beforeMID.Two : " + msg);
    }
}

class Three extends Two
{
    Three()
    {
        System.out.println("Inside beforeMID.Three");
    }

    Three (String msg)
    {
        System.out.println("beforeMID.Three : " + msg);
    }
}

class objectClassConcept
{
    //all of the classes are inherited from Object class (by default)
    //inside that class, there are many methods (built-in), such as toString(), hashCode(), isEqual()
    // toString() is used to print the address of the Class, but we can override it.

    String name;
    public String toString()
    {
        return name;
    }
}

public class theoryClassNine
{
    public static void main(String[] args)
    {
//        beforeMID.Parents p = new beforeMID.Parents();
//        p.printName();
//
//        beforeMID.Child c = new beforeMID.Child("Nazmul","Abdur Rahman");
//        c.printName();

//        beforeMID.Three three1 = new beforeMID.Three();
//        System.out.println(); //inside one, two, three
//        beforeMID.Three three2 = new beforeMID.Three("University"); //inside one, inside two, inside three university

        //java calls super(parameterless); function by default.
        //it doesn't create parameter including super(); function by itself
        //therefore, it won't pass super(msg) to anyone, other than from the
        //class it was written from (beforeMID.Three)

        objectClassConcept obj = new objectClassConcept();
        obj.name = "objectName";
        System.out.println(obj); //this will print "objectName"

        //if toString() wasn't overridden, it would print the address of the class
        //to try, remove toString methode; it will print : beforeMID.objectClassConcept@1540e19d
    }
}
