package forFINAL.Lecture14_Abstract;

// final variables -> can't change value
// final methods -> can't override; if inherited, child class will have access
// final classes -> can't extend
//can't finalize any abstract class/method

class Final
{
    final String name = "Thao Nhi"; // to use 'final' : either initialize it
    final String herName; //or access it only using constructor

    Final(String herName)
    {
        this.herName = herName;
    }

    void showName()
    {
        //name = "Another One"; //not allowed
        System.out.println(name);
        System.out.println(herName);
    }

    final void finalMethod() //can't override finalized methods
    {
        System.out.println("inside final method");
    }
}

class Final2 extends Final
{
    Final2(String herName) { super(herName); }
    //can't override finalized methods
    //final void finalMethod() { System.out.println("overriding"); }
}

final class FinalClass //final class can't be extended
{
    //
}

//class FinalClass2 extends FinalClass
//{
//    //cannot extend final class.
//}

public class FinalKeyword
{
    public static void main(String[] args)
    {
        Final f = new Final("Thao Nhi");
        f.showName();
    }
}
