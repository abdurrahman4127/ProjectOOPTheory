package forMID.Lecture4_ForEachLoop_ClassObject;//function means Method
//Method : static returnType methodName (functionParameters)

public class theoryClassFour_functionMethod
{
    static int sum(int a, int b) //mention 'static' if you want to write function inside 'main'
    {
        int c = a+b;
        return (c);
    }

    public static void main(String[] args)
    {
        System.out.println(sum(4,10));
    }
}
