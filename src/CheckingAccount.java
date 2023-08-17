/****************************************
 *          CheckAccount                *
 * -------------------------------------*
 * -overdraftLimit: double              *
 * +CheckingAccount()                   *
 * +CheckingAccount(int: id, double: balance, double: overdraftLimit*
 * -------------------------------------*
 * +setOverdraftLimit(double): void     *
 * +getOverdraftLimit(): double         *
 * +withdraw(amount: double): boolean   *
 * +toString(): String                  *
 * **************************************
 */

/**
 *
 * @author admin
 */
public class CheckingAccount 
        extends Account{
    private double overdraftLimit;
    
    // Default constructor
    public CheckingAccount(){
        super();
        overdraftLimit = -20;
    }
    
    // Constructor with arg
    public CheckingAccount(int id, double balance, double overdraftLimit){
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }
    
    // Set over draft limit
    public void setOverdraftLimit(double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }
    
    // Return overdraft limit
    public double getOverdraftLimit(){
        return overdraftLimit;
    }
    
    // Decrease the balance by amount
    public void withdraw(double amount){
        if (getBalance() - amount > overdraftLimit){
            setBalance(getBalance() - amount);
        }
        else
            System.out.println("Error! Checking account amount exceeds overdraft limit.");
    }
    
    // Return description of CheckingAccount
    public String toString(){
        return super.toString() + "\nOverdraft limit: $" +
                String.format("%.2f", overdraftLimit);
    }
    
}
