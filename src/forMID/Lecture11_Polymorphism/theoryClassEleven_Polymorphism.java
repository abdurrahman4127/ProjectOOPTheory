package forMID.Lecture11_Polymorphism;

//static methode can't be overridden
class BOX {
    double width;
    double height;
    double depth;

    //constructor when al dimensions are mentioned
    BOX(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //constructor when cube is created
    BOX(double len) {
        this(len,len,len); //calling constructor from the same class (just like 'super')
        //width = height = depth = len; // is also correct
    }

    double getVolume() {
        return (width*height*depth);
    }
}

////subclass polymorphism
//class Animals
//{
//    double weight;
//    String color;
//
//    void eat(){
//        System.out.println("Animal is eating");
//    }
//    void sleep(){
//        System.out.println("Animal is eating");
//    }
//}
//
//class Birds extends Animals
//{
//    void fly(){
//        System.out.println("Bird is flying");
//    }
//}
//
//class Horses extends Animals
//{
//    void sleep(){
//        System.out.println("Horse is sleeping");
//    }
//}

 //output finding
class AnimaLs {
    AnimaLs()
    {
        System.out.println("An animal is created");
    }

    void fly()
    {
        System.out.println("Don't know if I can fly");
    }
    void eat()
    {
        System.out.println("Eating...");
    }
}

class Birds extends AnimaLs {
    Birds()
    {
        System.out.println("A bird is created");
    }

    void fly()
    {
        System.out.println("Flying..");
    }
}

class Magpie extends Birds {
    Magpie()
    {
        System.out.println("A magpie is created");
    }

    void fly()
    {
        System.out.println("Magpie is flying..");
    }

    void fly(int speed)
    {
        System.out.println("Magpie is flying at speed " + speed);
    }
    void eat()
    {
        System.out.println("Magpie is eating");
    }
}


public class theoryClassEleven_Polymorphism {
    public static void main(String[] args)
    {
//        BOX b = new BOX(10,5,8);
//        System.out.println("vol of b : " + b.getVolume());
//
//        BOX b1 = new BOX(5); //calling the 2nd constructor
//        System.out.println("vol of b1 : " + b1.getVolume());

        /*
        //compile time - run time; objects get created when code runs
        Animals a = new Birds();
        a.sleep();
        Horses h = new Horses();
        h.sleep();

        // a.fly(); won't work since in compile-time, there's no methode in that name inside the reference of beforeMID.Animal class.
        // to make it word, we gotta cast the reference-object

        ((Birds)a).fly(); //casting beforeMID.Animal class reference into beforeMID.Bird class

         */

        AnimaLs a = new AnimaLs();  //animal is created
        Birds b = new Magpie(); //constructor call first //beforeMID.Animal is created, beforeMID.Bird is created, magpie is created

        // casting b variable to beforeMID.Magpie class and assigning it to beforeMID.Magpie class
        Magpie c = (Magpie)b; //no output

        a.fly();  //don't know if i can fly
        b.fly();  // magpie is flying
        ((Magpie)b).fly(15);  //magpie is flying at speed 15

        a.eat();   //eating
        b.eat();   //magpie is eating
        c.eat();   //magpie is eating
    }
}
