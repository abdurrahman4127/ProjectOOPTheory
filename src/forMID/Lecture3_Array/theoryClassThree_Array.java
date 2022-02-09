package forMID.Lecture3_Array;

//array :  dataType[] arrayName = new dataType[size];
//array : arrayName = new dataType[]{arrayElements};
//Jagged/Irregular Array : dataType[][] arrayName = new dataType[size][size];
//3D Array : datatype [][][] arrayName = {{{1,2},{3,4,5,6},{7,8,9}},{{1,2},{3,4,5,6},{7,8,9}}};

public class theoryClassThree_Array {
    public static void main(String[] args)
    {
        /* printing :
        1 2
        3 4 5 6
        7 8 9
         */

        /*
        int[][] array = {{1,2}, {3,4,5,6}, {7,8,9}};   // Jagged array

        for (int i=0; i<array.length; i++)   // size of 1st dimension
        {
            for (int j=0; j<array[i].length; j++)   // size of rest of dimension
            {
                System.out.printf("%d ",array[i][j]);
            }
            System.out.println();
        }
        */



        /*
        int[][] a;             // just declare
        a = new int[3][];      //finding row ; must fill out 1st []
        a[0] = new int[]{1,2};
        a[1] = new int[]{3,4,5,6};
        a[2] = new int[]{7,8};

        for (int i=0; i<a.length; i++)  // size of 1st dimension
        {
            for (int j=0; j<a[i].length; j++)    //j<array[i].length is to find the size of rest of dimension
            {
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println();
        }
         */


        /*
        //3D array :
        int [][][] a3 = {{{1,2},{3,4,5,6},{7,8,9}},{{1,2},{3,4,5,6},{7,8,9}}};
        int len = a3.length; // length will be two; look at the curley-brace carefully
        int len2 = a3[0].length; //prints 3
        int len3 = a3[0][1].length; //prints 4
        //int len4 = a3[1][2][2].length; //prints 9
         */

        // after creating a Student class...
        // Students []arr = new Students[40]; //this will create 40-student-class array
    }
}
