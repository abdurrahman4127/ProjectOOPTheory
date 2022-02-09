package forMID.Lecture10_MethodOverloading;

//methode signature depends on
//1.methode name 2.parameter number 3.parameter types 4.parameter order (return type doesn't matter)
class MethodeSignature
{
    void methode(String a)
    {
        System.out.println("//");
    }
//    void show(String a) //can't have same signature methode under same class;
//    {
//        System.out.println("//");
//    } //return type doesn't matter

    //methode overloading :
    //same class, same name; but different signature
    void methode(int a) //parameter type different
    {
        System.out.println("//");
    }

    void print(int a)
    {
        System.out.println("int : " + a);
    }

    void print(double a)
    {
        System.out.println("double : " + a);
    }

    void print(float a) //float won't be called if double has the same signature
    {
        System.out.println("double : " + a);
    }
}

public class theoryClassTen
{
    public static void main(String[] args)
    {
        MethodeSignature a = new MethodeSignature();

        a.print(10);
        a.print(10.0);
        a.print(10.0);
    }
}
