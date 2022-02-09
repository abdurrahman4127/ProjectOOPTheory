package forFINAL.Nested_Class.AnonymousClass;

//abstract class
abstract class Person1
{
   abstract void eat();
}

public class AnonymousAbstract
{
    public static void main(String[] args)
    {
        Person1 p = new Person1() //anonymous class
        {
            void eat()
            {
                System.out.println("nice fruits");
            }
        };
        p.eat();
    }
}
