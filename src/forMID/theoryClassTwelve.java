package forMID;

class X
{
    void methode(int a)
    {
        System.out.println("beforeMID.One");
    }

    void methode(double d)
    {
        System.out.println("beforeMID.Two");
    }
}

class Y extends X
{
    @Override
    void methode(double d)
    {
        System.out.println("beforeMID.Three");
    }
}

public class theoryClassTwelve
{
    public static void main(String[] args)
    {
        new Y().methode(100); //passing integer, so integer methode wil be summoned
    }
}