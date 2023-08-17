/*************************************************
*                   Student                      *
*------------------------------------------------*
* -status: String                                *
* ---------------                                *
* +Student(name: String, address: String,        *
*  phone: String, email: String, status: String) *
* +getStatus(): String                           *
* +setStatus(status: String): void               *
* +toString(): String                            *
*************************************************/

/**
 *
 * @author jsquared21
 * edited by Toby Sriratanakoul
 */
public class Student 
        extends Person{
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 2;
    public final static int JUNIOR = 3;
    public final static int SENIOR = 4;
    
    // Construtor with arg (overload)
    public Student(String name, String address, String phone, 
            String email, int status){
        super(name, address, phone, email);
        this.status = status;
    }
    
    // Set new status
    public void setStatus(int status){
        this.status = status;
    }
    
    // Return status
    public String getStatus(){
        switch(status){
            case 1 : return "freshman";
            case 2 : return "sophomore";
            case 3 : return "junior";
            case 4 : return "senior";
            default : return "Unknown";
        }
    }
    
    // Return description of class object
    public String toString(){
        return super.toString() + "\nStatus: " + getStatus();
    }
}
