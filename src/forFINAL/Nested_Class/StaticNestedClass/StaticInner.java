package forFINAL.Nested_Class.StaticNestedClass;

public class StaticInner
{
    static int data = 30;

    static class Inner
    {
        void msg()
        {
            System.out.println("data is "+data);
        }

        static void msg(String msg)
        {
            System.out.println(msg);
        }
    }

    public static void main(String[] args)
    {
        StaticInner.Inner obj = new StaticInner.Inner();
        obj.msg();
        StaticInner.Inner.msg("Hello"); //no need to create the instance of static nested class
    }
}