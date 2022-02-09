package forFINAL.PracticeCode;

public class OccurrenceCount
{
    public static void main(String[] args)
    {
        int []array = {1, 2, 3, 2, 2, 4, 5, 3, 1};
        System.out.println(array.length);

        for(int i=0; i<array.length; i++)
        {
            for (int j = i+1; j<array.length; j++)
            {
                if(array[i] == array[j])
                {
                    System.out.println(array[i] + " is present again at " + j);
                }
            }
        }
    }
}
