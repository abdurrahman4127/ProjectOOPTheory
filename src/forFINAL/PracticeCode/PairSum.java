package forFINAL.PracticeCode;

public class PairSum {
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5, 2, 3, 2, 4, 5};

        int check = 0;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                // j will start right after thr 1st index (of i)
                if (a[i] + a[j] == 10) //checks if any two numbers can be 10
                {
                    System.out.println("yes, possible; numbers are : " + a[i] + "," + a[j]);
                    System.out.println("index : " + i + "," + j);
                }
            }
        }
    }
}
