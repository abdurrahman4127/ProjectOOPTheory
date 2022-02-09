package forMID.Lecture7_Primitive_Reference;

class Students
{
    String name;
    double cgpa;
    String id;


    void attendingClass()
    {
        System.out.println(name + " is attending the class");
    }

    void attendingExam()
    {
        System.out.println(name + " is attending the exam");
    }

    //constructor
    public Students(String name, double cgpa, String id)
    {
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }
}

public class theoryClassSeven_Reference_Type_Array
{
    public static void main(String[] args)
    {
        Students s1 = new Students("Abdur Rahman", 3.77, "011202260"); //string goes inside quote
//        s1.attendingClass();
//        s1.attendingExam();

        new Students("Abdur Rahman", 3.77, "011202260"); // this'll create an object, without any reference (garbage memory)

        //reference type array...
        Students []arr = new Students[3];
        arr[0] = new Students("Abdur Rahman", 3.77, "011202260");
        arr[1] = new Students("Thao Nhi", 3.77,  "2912005");

        arr[0].attendingExam();
        //here, it's pointing at s1 reference, therefore it will access its properties
        arr[2] = s1;
//        System.out.println(arr[2].name);
    }
}
