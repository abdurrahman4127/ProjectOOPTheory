package forMID.Lecture4_ForEachLoop_ClassObject;
//function means Method
//Method : static returnType methodName (functionParameters)

public class theoryClassFour_functionMethod{
    public static void main(String[] args) {
        System.out.println(sum(4, 10));
    }
    
    //mention 'static' if you want to write function inside 'main'
    static int sum(int a, int b) {
        int c = a + b;
        return (c);
    }
}
