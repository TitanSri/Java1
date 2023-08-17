/*********************************************************************************
* (Financial application: compute tax) Rewrite Listing 3.5, ComputeTax.java,     *
* using arrays. For each filing status, there are six tax rates. Each rate is    *
* applied to a certain amount of taxable income. For example, from the taxable   *
* income of $400,000 for a single filer, $8,350 is taxed at 10%, (33,950 - 8,350)*
* at 15%, (82,250 - 33,950) at 25%, (171,550 - 82,550) at 28%, (372,550 - 82,250)*
* at 33%, and (400,000 - 372,950) at 36%. The six rates are the same for all     *
* filing statuses, which can be represented in the following array:              *
*                                                                                *
* double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};                         *
*                                                                                *
* The brackets for each rate for all the filing statuses can be represented in a * 
* two dimensional array as follows:                                              *
* int[][] brackets = {                                                           *
* 	 {8350, 33950, 82250, 171550, 372950},  // Single filer                       *
* 	 {16700, 67900, 137050, 20885, 372950}, // Married jointly                    *
* 	                                        // -or qualifying widow(er)           *
* 	 {8350, 33950, 68525, 104425, 186475},  // Married separately                 *
* 	 {11950, 45500, 117450, 190200, 372950} // Head of household                  *
*  };                                                                            *
*                                                                                *
* Suppose the taxable income is $400,000 for single filers. The tax can be       *
* computed as follows:                                                           *
*                                                                                *
* tax = brackets[0][0] * rates[0] +                                              *
* 	 (brackets[0][1] – brackets[0][0]) * rates[1] +                               *
* 	 (brackets[0][2] – brackets[0][1]) * rates[2] +                               *
* 	 (brackets[0][3] – brackets[0][2]) * rates[3] +                               *
* 	 (brackets[0][4] – brackets[0][3]) * rates[4] +                               *
* 	 (400000 – brackets[0][4]) * rates[5]                                         *
*********************************************************************************/
import java.util.Scanner;
/**
 * 
 * @author Toby Sriratanakoul
 */
public class Chapter8_12_Compute_Tax {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        //Tax rates
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        
        //The brackets for each rate of all the filing statuses
        int[][] brackets = {
            {0, 3850, 33950, 82250, 171550, 372950}, //Single filer
            {0, 16700, 67900, 137050, 208850, 372950}, //Married jointly
            {0, 8350, 33950, 68525, 104425, 186475}, //Married seperately
            {0,11950, 45500, 117450, 190200, 372950} // Head of household
        };
        
        //Prompt the user to enter filing status
        System.out.println("0-single filer, 1-married jointly or " +
                "qualifying window(er), 2-married seperately, 3-head of " + 
                "household) Enter the filing status: ");
         int status = getStatus();
         
         //Prompt the user to enter the Taxable income
         System.out.println("Enter the taxable income: ");
         double income = input.nextDouble();
         double totalTaxed = computeTax(brackets, rates, status, income);
         //Display the results
         System.out.printf("The Total Tax is: %6.2f%n", + totalTaxed);
         System.out.println("The income " + income + " minus the total tax " + 
                 totalTaxed + 
                 " is "  + (income - totalTaxed));
         
    }
    //**METHODS
    //computeTax and return the total
    public static double computeTax(int[][] brackets, double[] rates,
            int status, double income){
        double totalTax = 0, incomeTaxed = 0;
        for (int i = 5; i >=0; i--){
            if (income > brackets[status][i])
                totalTax += ((incomeTaxed = income - brackets[status][i]) * rates[i]); //total income minus the bracket times the tex percent
                System.out.println("The total tax is: " + totalTax);
                System.out.println("The incomeTaxed is: " + incomeTaxed);
                income -= incomeTaxed;
                System.out.println("The income is: " + income);
            }
        return totalTax;
    }
    
    //getStatus returns a valid status
    public static int getStatus(){
        Scanner input = new Scanner(System.in);
        int status;
        do {
            status = input.nextInt();
            if (status < 0 || status > 3)
            System.out.println("Error: invalid status");
        }while (status < 0 || status > 3);
        return status;
        }
    }
