package forFINAL.Nested_Class.AnonymousClass;

class Person
{
    String name;
    public Person(String a)
    {
        name = a;
    }

    public void display()
    {
        System.out.println("Hello from Person " + name);
    }

    public void display(String msg)
    {
        System.out.println("Hello from Person " +name+ " " + msg);
    }
}

public class AnonymousTest
{
    public static void main(String[] args)
    {
        Person p = new Person("Thao Nhi")
        {

            public void display()
            {
                display(2); // this is fine
                System.out.println("Hello from Anonymous");
            }

            // Extra method
            public void display(int a)
            {
                System.out.println("Number: " + a);
            }

        };

        p.display();
        p.display("Vo"); // Ok
//        p.display(3); // error: The method display(String) in the type Person is not applicable for the arguments (int)

    }

}