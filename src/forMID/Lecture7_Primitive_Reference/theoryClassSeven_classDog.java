package forMID.Lecture7_Primitive_Reference;

class Dog
{
    String name;

    Dog(String name)
    {
        this.name = name;
    }

    String getName()
    {
        return name;
    }
}

public class theoryClassSeven_classDog
{
    public static void main(String[] args)
    {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;

        //passing the object to foo
        foo(aDog);

        // aDog variable is still pointing to the "Max" dog when foo(...) returns

        System.out.println(aDog.getName().equals("Max"));
        System.out.println(aDog.getName().equals("Fifi"));
        System.out.println(aDog = oldDog);
    }

    static void foo(Dog d) //static must be mentioned (inside public class)
    {
        System.out.println(d.getName().equals("Max"));

        //change d inside foo(...) to point a new beforeMID.Dog; instance "Fifi"

        d = new Dog("Fifi");
        System.out.println(d.getName().equals("Fifi"));
    }

}
