package forMID.Lecture2_DataType_Casting;

public class theoryClassTwo {
    public static void main(String[] args)
    {
        //primitive types :

        byte b = 127; // stores  8 bits
        /* byte storing...
        max : (0)1111111 == 2^7 - 1 == 127
        max : (1)0000000 ==   -2^8  == -128
        */

        int i = 5; // limit : -2^31 to 2^31 - 1
        float f = 1.5F; // stores 32 bits
        double d = 4.56; // stores 64 bits
        char c = 'A'; //single quote is for char, 16 bits (2 bytes; in c, it was 1 byte)
        long l = 545754L; // 64 bits
        short s = 231; // 16 bits

        boolean b1 = true;  // 1 bit.

        //reference type :
        String s1 = "Cristiano Ronaldo";
        String s2 = new String("Cristiano Ronaldo"); //because it's reference type (not primitive)
        /*
        double quote is for char; 'S' upper-case;
        one character from String worth 16 bits.
        "Nhi" = 3 * 16
        */
    }
}
