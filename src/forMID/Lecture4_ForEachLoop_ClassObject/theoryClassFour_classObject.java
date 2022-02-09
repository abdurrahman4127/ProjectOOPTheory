package forMID.Lecture4_ForEachLoop_ClassObject;

//creating class..
class Student {
    //instance / member / property variable
    String name;
    String id;
    double cgpa;
}

public class theoryClassFour_classObject {
    public static void main(String[] args)
    {
        //creating object of the class 'Student' inside main function

        //className variableName = new className();
        Student ar7 = new Student();
        Student nhi = new Student();

        //object name:
        ar7.name = "Abdur Rahman";
        ar7.cgpa = 3.77;
        ar7.id = "011202260";
        nhi.name = "Thao Nhi"; //nhi.name = "Thao" + " Nhi"; both are same
        nhi.cgpa = 3.7;
        nhi.id = "011202260";

        //printing ...
        System.out.println(ar7.name);
        System.out.println(nhi.name);
    }
}
