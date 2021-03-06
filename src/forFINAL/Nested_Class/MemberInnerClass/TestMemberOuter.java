package forFINAL.Nested_Class.MemberInnerClass;

public class TestMemberOuter
{
    public void show()
    {
        System.out.println("Show method");

        Inner inner = new Inner();  //if it's inside a method, then don't to write it as line no.28
        inner.msg(); // Can access private member of inner class

        System.out.println("--End of Show method--");
    }

    class Inner
    {
        private void msg()
        {
            System.out.println("Inner Method" );
        }
    }

    public static void main(String[] args)
    {
        TestMemberOuter tmo = new TestMemberOuter();
        tmo.show();

        TestMemberOuter.Inner in = tmo.new Inner();
        in.msg();
    }
 }

 /*
 show method
 inner method
 end of show method
 inner method
 */