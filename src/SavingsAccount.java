/****************************************
 *          SavingsAccount              *
 * -------------------------------------*
 * +SavingsAccount()                    *   
 * +withdraw(double: amount): boolean    *
 * **************************************
 */

/**
 *
 * @author jsquared21
 * edited by Toby Sriratanakoul
 */
public class SavingsAccount 
        extends Account{
    
    // Constructor with no-arg
    public SavingsAccount(int id, double balance){
        super(id, balance);
    }
    
    // Decrease savings amount
    public void withdraw(double amount){
        if (amount < getBalance()){
            setBalance(getBalance() - amount);
        }
        else 
            System.out.println("Error! Savings account overdrawn transaction rejected");
    }
    
}
