package forMID.Lecture7_Primitive_Reference;

//passing reference type (ADDRESS)

class Test
{
    String testName;
    float score;

    Test(String n, float s)
    {
        testName = n;
        score = s;
    }

    void display()
    {
        System.out.println("testName : " + testName + "; Score : " + score);
    }
}

public class theoryClassSeven_Parameter_Passing
{
    public static void main(String[] args)
    {
        Test t = new Test("CT1", 10);
        t.display();

        updateScore(t, 15.0f);
        System.out.println("After update :");
        t.display();
    }

    static void updateScore(Test test, float newScore) //test variable : reference type; newScore variable : float type
    {
        //address of 't' will be placed at beforeMID.Test test because it's reference type variable
        test.score = newScore;
    }
}
