package forFINAL.Lecture14_Abstract;

interface One1{
    public void X();
}

interface Two2 extends One1{
    String name2 = "Abdur Rahman";
    public void Y();
}

//implementing
class Three3 implements Two2
{
    public void X(){
        System.out.println("Three");
    }

    public void Y(){
        System.out.println("Two2");
    }
}

public class InterfaceQuestion {
    public static void main(String[] args)
    {
        Three3 three3 = new Three3();
        System.out.println(three3.name2);
        three3.Y();
    }
}
