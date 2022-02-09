package forFINAL.PracticeCode;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortFile {
    public static void main(String[] args) throws Exception
    {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/forFINAL/PracticeCode/input_file.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/forFINAL/PracticeCode/generated_file.txt"));

            ArrayList<Integer> list = new ArrayList<>();
            String a = bufferedReader.readLine();

            while(a != null) {
                String []s = a.split(" ");
                try {
                    for (int i = 0; i < s.length; i++) {
                        int d = Integer.parseInt(s[i]);
                        list.add(d);
                    }

                }
                catch (Exception e) {
                    e.printStackTrace();
                }

                a = bufferedReader.readLine();  //update it
            }

            System.out.println(list);

            Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer left, Integer right)
                {
                    if(left > right)
                        return -1;
                    return 0;
                }
            });

            System.out.println(list);
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
