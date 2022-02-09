package forMID.Lecture5_ClassObject;

public class theoryClassFive
{
    //class animal
    String name;
    int age;
    boolean hasTail; //depends on true / false
    //methods
    void eat()
    {
        System.out.println(name + " is eating");
    }

    void bark()
    {
        System.out.println(name + " is barking");
    }

    public static void main(String[] args)
    {
        //creating object
        theoryClassFive rabbit = new theoryClassFive();
        rabbit.age = 10;
        rabbit.name = "Rocket";
        rabbit.hasTail = true;
        // calling methode
        rabbit.eat();

        //creating another object
        theoryClassFive cat = new  theoryClassFive();
        cat.name = "Tom";
        cat.eat();
    }
}
