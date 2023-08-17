/*
 * PI and e
 */

/**
 * @mano itc206
 */
public class Pi_and_e {

    public static void main(String args[]) {
        //Pi
        //loop 10,000 times than add 10,000 more
        for (int k = 10000; k <= 100000; k +=10000){
            double pi = 0;
            
            // formula for 4(1/(2i-1)-1/(2i+1))
            //loop every second number i.e. 1 3 5
            for (int i = 1; i <= k; i += 2)
                pi += 1.0 / (2 * i - 1) - 1.0 / (2* i + 1);
            
            //times the answer by 4 and print the answer
            System.out.println("The PI is " + 4 * pi);
        }
        
        //e
        //declare the total
        double e = 1;
        //declare the factorial series
        double item = 1;
        
        //loop to add 1/j!
        for (int j = 1; j <= 100000; j++){
            // the number is divided by the next number to make 1/j!
            //i.e. 1/1, 1/2, 1/2/3, 1/2/3/4
            item = item / j;
            // add the answer to the total
            e += item;
        
        //print the total at each number below
        if (j == 10000 || j == 20000 || j == 30000 || j == 40000 ||
                j == 50000 || j == 60000 || j == 70000 ||
                j == 80000 || j == 90000 || j == 100000)
            System.out.println("The e is " + e + " for j = " + j);
        }
        
        // Compute a series
        for (int i = 1; i <= 20; i++){
            System.out.printf("%10d%10.4f\n", i, m(i));
        }
            
    }
    
    // Method equation m = i/2i+1
    public static double m(int i){
        double sum = 0;
        for (int j = 1; j <= i; j++)
        sum += (j /(2 * j + 1.0));
        return sum;
    }
}
