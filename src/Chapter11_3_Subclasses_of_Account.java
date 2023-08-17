/*********************************************************************************
* (Subclasses of Account) In Programming Exercise 9.7, the Account class was     *
* defined to model a bank account. An account has the properties account number, *
* balance, annual interest rate, and date created, and methods to deposit and    *
* withdraw funds. Create two subclasses for checking and saving accounts. A      *
* checking account has an overdraft limit, but a savings account cannot be       *
* overdrawn.                                                                     *
*                                                                                *
* Draw the UML diagram for the classes and then implement them. Write            *
* a test program that creates objects of Account, SavingsAccount, and            *
* CheckingAccount and invokes their toString() methods.                          *
*********************************************************************************/

/**
 *
 * @author jsquared21
 * edited by Toby Sriratanakoul
 */
public class Chapter11_3_Subclasses_of_Account {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Create an Account, SavingAccount and CheckingAccount objects
        Account account = new Account(1122, 0000);
        SavingsAccount savings = new SavingsAccount(1001, 0000);
        CheckingAccount checking = new CheckingAccount(1004, 0000, -20);
        
        // Set annaul intereset rate of 4.5%
        account.setAnnualInterestRate(4.5);
        savings.setAnnualInterestRate(4.5);
        checking.setAnnualInterestRate(4.5);
        
        // Withdraw $2,500
        account.withdraw(2500);
        savings.withdraw(2500);
        checking.withdraw(2500);
        
        // Deposit $3,000
        account.deposit(3000);
        savings.deposit(3000);
        checking.deposit(3000);
        
        //Invoke toString methods
        System.out.println(account.toString());
        System.out.println(savings.toString());
        System.out.println(checking.toString());
    }
}
