package forMID;

class X {
    void methode(int a) {
        System.out.println("One");
    }

    void methode(double d) {
        System.out.println("Two");
    }
}

class Y extends X {
    @Override
    void methode(double d) {
        System.out.println("Three");
    }
}

public class theoryClassTwelve {
    public static void main(String[] args)
    {
        //passing integer, so integer methode wil be summoned
        new Y().methode(100);
    }
}