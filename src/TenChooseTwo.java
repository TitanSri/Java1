/*
 * Ten numbers choose 2, print all the combinations
 */
import java.util.*;
/**
 * @author mano itc206
 */
public class TenChooseTwo {
    public static void main(String args[]) {
        //Enter 10 integers 
        System.out.println("Enter 10 integers: ");
        Scanner input = new Scanner(System.in);
        final int N = 10;
        int [] numbers = new int [N];
        
        //Loop through array and insert the number
        for (int i = 0; i < N; i++ )
            numbers[i] = input.nextInt();
        
        //Loop through first minus 1 and display combo
        for (int i = 0; i < 10; i++)
            for (int j = i + 1; j < 10; j++)
                System.out.println(numbers[i] + " " + numbers[j]);
    }
}
