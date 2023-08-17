/*******************************************************************
*                        Employee                                  *
*------------------------------------------------------------------*
* -office: int                                                     *
* -salary: double                                                  *
* -dateHired: MyDate                                               *
* +Employee(name: String, address: String, phone: String,          *
*  email: String, office: int, salary: double, dateHired: MyDate); *
* +getOffice(): int                                                *
* +getSalary(): double                                             *
* +getDateHired(): MyDate                                          *
* +setOffice(office: int): void                                    *
* +setSalary(salary: double): void                                 *
* +setDateHired(dateHired: MyDate): void                           *
* +toString():String                                               *
*******************************************************************/

/**
 *
 * @author jsquared21
 */
public class Employee 
        extends Person{
    private int office;
    private double salary;
    private MyDate dateHired;
    
    
    // Constructor name only
    public Employee(String name){
        super();
        setName(name);
        this.dateHired = new MyDate();
    }
    
    // Constructor with name and salary
    public Employee(String name, double salary){
        super();
        setName(name);
        setSalary(salary);
        this.dateHired = new MyDate();
    }
    
    // Contructor with arg
    public Employee(String name, String address, String phone,
            String email, int office, double salary){
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }
    
    // Return office 
    public int getOffice(){
        return office;
    }
    
    // Return salary
    public String getSalary(){
        return String.format("%.2f", salary);
    }
    
    // Return date hired
    public String getDateHired(){
        return dateHired.getMonth() + "/" + dateHired.getDay()
                + "/" + dateHired.getYear();
    }
    
    // Set new office
    public void setOffice(int office){
        this.office = office;
    }
    
    // Set salary
    public void setSalary(double salary){
        if (salary >= 0 && salary <+100000)
            this.salary = salary;
        else
            System.out.println("Salary not changed!");
    }
    
    // Set date hired
    public void setDateHired(){
        dateHired = new MyDate();
    }
        
    // Get Tax
    public double getTax(){
        return salary * 0.4;
    }
    
    // Return description of employee
    public String toString(){
        return super.toString() + "\nOffice: " + office +
                "\nSalary: " + salary + "\nDate hired: " + dateHired
                + "\nTax: " + getTax();
    }
    
}
