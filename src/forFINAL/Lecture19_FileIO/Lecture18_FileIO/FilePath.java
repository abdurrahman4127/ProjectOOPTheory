package forFINAL.Lecture19_FileIO.Lecture18_FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePath
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\MC\\projectOOP\\src\\forFINAL\\Lecture19_FileIO\\Lecture18_FileIO\\file_1.txt");

        try
        {
            Scanner scanner = new Scanner(file);

//            while (scanner.hasNext()) //if there exist any token, it'll keep going
//            {
//                String  str = scanner.next(); //scanning till one white-space
//                System.out.println(str);
//            }

            System.out.println();

//            while (scanner.hasNext()) //if there exist any token, it'll keep going
//            {
//                String  str = scanner.nextLine(); //scanning till enter-key
//                System.out.println(str);
//            }

            while (scanner.hasNextInt()) //if there exist any integer, it'll keep going
            {
                String  str = scanner.next(); //scanning till the white-space
                System.out.println(str);
            }
        }

        catch (Exception e)
        {
            System.out.println("file not found !!");
            e.printStackTrace();
        }
    }
}
