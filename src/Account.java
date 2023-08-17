/********************************************************
*                     Account                            *
*-------------------------------------------------------*
* -id: int                                              *
* -balance: double                                      *
* -annualInterestRate: double                           *
* ---------------------------                           *
* -dateCreated: String                                  *
* +Account()                                            *
* +Account(newId: int, newBalance: double)              *
* +setId(newId: int)                                    *
* +setBalance(newBalance: double)                       *
* +setAnnualInterestRate(newAnnualInterestRate: double) *
* +getId(): int                                         *
* +getBalance(): double                                 *
* +getAnnualInterestRate(): double                      *
* +getDateCreated(): String                             *
* +getMonthlyInterestRate(): double                     *
* +getMonthlyInterest(): double                         *
* +withdraw(amount: double)                             *
* +deposit(amount: double)                              *
********************************************************/

/**
 * 
 * @author jquared21
 * edited by Toby Sriratanakoul
 */

// Implement the Account Class
import java.util.Date;

public class Account {
    // Data fields
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated = new Date();
    
    // Constructor
    /* Creates the default account */
    Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    
    /* Creates an account with the specificed id and initial balance */
    Account(int newId, double newBalance){
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }
    
    // Mutator methods
    /* Set id */
    public void setId(int newId){
        id = newId;
    }
    
    /* Set balance */
    public void setBalance(double newBalance){
        balance = newBalance;
    }
    
    /* Set annualInterestRate */
    public void setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }
    
    // Accessor methods
    /* Get id */
    public int getId(){
        return id;
    }
    
    /* Get balance */
    public double getBalance(){
        return balance;
    }
    
    /* Get annualInterestRate */
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    /* Get dateCreated */
    public String getDateCreated(){
        return dateCreated.toString();
    }
    
    /* Get monthly interest rate */
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    
    //Methods
    /* Return monthly interest */
    public double getMonthlyInterest(){
        return balance * (getMonthlyInterestRate() / 100);
    }
    
    /* Decrease blance by amount */
    public void withdraw(double amount){
        balance -= amount;
    }
    
    /* Increase balance by amount */
    public void deposit(double amount){
        balance += amount;
    }
    
    /** Return a String description of Account class */
	public String toString() {
		return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
			+ "\nBalance: $" + String.format("%.2f", balance) + 
			"\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
        }
}
