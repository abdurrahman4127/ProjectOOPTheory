package forFINAL.Nested_Class.AnonymousClass;

// interface : all methods are by default public
interface Eatable
{
    void eat();
}

public class AnonymousInterface
{
    public static void main(String[] args)
    {
        Eatable eatable = new Eatable()  //object of anonymous class referred by eatable
        {
            public void eat()
            {
                System.out.println("nice fruits");
            }
        };
        eatable.eat();
    }
}

