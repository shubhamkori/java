import java.io.*;
import java.util.*;

public class reverse {
    public static void main(String[] args)
    {
        List<Integer> number = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
       
        System.out.println(
            "Reverse order of given List :- ");
 
        // the number list will be reversed using this method
        Collections.reverse(number);
       
        System.out.println(number);
    }
}
