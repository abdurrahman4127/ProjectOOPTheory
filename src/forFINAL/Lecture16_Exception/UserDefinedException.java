package forFINAL.Lecture16_Exception;

// Exception is a built-in class
class CustomException extends Exception {
     CustomException() {   //exception has parameterless constructor too
         super();   //calling Exception's parameterless constructor
     }

     CustomException(String message) {
         super(message);  //string parameter constructor of Exception class
     }

     CustomException(int a) {
//         super(a); //no const. available in Exception that accepts integer
         super("The number is : " + a); //allowed as it's passing as string; not as integer; passes to Exception class
     }
}


public class UserDefinedException {
    public static void main(String[] args)
    {
        try {
            throw new CustomException(50);  //creates an obj. and calling the constructor
            //Exception class receives the parameter and prints : The number is : 50;
        }

        catch (CustomException c) {
            System.out.println(c.getMessage());  // prints : The number is : 50
        }
    }
}
