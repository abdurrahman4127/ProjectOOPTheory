package forFINAL.Lecture13_Static_Abstract;

//abstract means : hiding complexities
// it's super-class
//can't create object of abstract; incomplete
//subclass fills out the abstract (empty) class.

//abstract can be of no abstract methode
abstract class Abs {
    // it's a abstract class, though it doesn't have any body-less methode
    //just we can't make any object from this class
}

abstract class Car {
    int regNo;
    String model;

    abstract void runEngine(); //empty body; just the definition
}

//abstract class Audi extends Car{}  -> also correct
class Audi extends Car {
    @Override
    void runEngine() {  //subclass must complete the incomplete segment of abstract class
        System.out.println("In Audi's engine");
    }
}

class Ferrari extends Car {        //can't do it unless the abstract methode is overridden
    @Override
    void runEngine() {
        System.out.println("In Ferrari's engine");
    }
}

public class AbstractClass {
    public static void main(String[] args)
    {
        //Car c = new Car(); //can't create object of abstract class
        Audi audi = new Audi();
        Car audi2 = new Audi(); //allowed since we're assigning a concrete class's object to Abstract class; not creating Abstract class's object

        audi.runEngine(); //remember compile-run time ?
        audi2.runEngine();

        Car f = new Ferrari();
        f.runEngine(); // in ferrari's engine
    }
}
