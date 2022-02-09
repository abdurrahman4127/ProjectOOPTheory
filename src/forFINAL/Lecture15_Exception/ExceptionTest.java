package forFINAL.Lecture15_Exception;

//Grandparents -> Throwable
//Uncle 1 -> Exception
//Uncle 2 -> Error
//son of uncle 1 -> Runtime Exception

public class ExceptionTest {
    public static void main(String[] args) //main function
    {
        testSqrt(-1);  //1. goto : testSqrt() method
    }

    public static void testSqrt(int s ) {
        try
        {
            System.out.println(callSqr(s)); //2. goto : line no. 32
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static int sqr(int a) throws Exception {
        if (a < 0)
        {
            throw new Exception("Can't be less than 0");  //4. go to the called function (line 32)
        }
        return a*a;
    }

    public static int callSqr(int a) throws Exception  //5. go to caller function (line 14)
    {
        return sqr(a);   //3. goto : line no. 23
    }
}
