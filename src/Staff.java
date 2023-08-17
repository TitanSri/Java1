/**********************************************************************
*                                Staff                                *
*---------------------------------------------------------------------*
* -title: String                                                      *
* +Staff(name: String, address: String, phone: String, email: String, *
*  office: int, salary: double, dateHired: MyDate, title: String)     *
* +getTitle(): String                                                 *
* +setTitle(title: String): void                                      *
* +toString(): String                                                 *
**********************************************************************/

/**
 *
 * @author jsquared21
 * edited by Toby Sriratanakoul
 */
public class Staff 
        extends Employee{
     private String title;
     
     // Constructor with arg
     public Staff(String name, String address, String phone, String email,
             int office, double salary, String title){
         super(name, address, phone, email, office, salary);
         this.title = title;
     }
    
     // Return title
     public String getTitle(){
         return title;
     }
     
     // Set title
     public void setTitle(String tilte){
         this.title = title;
     }
     
     // To string description of staff
     public String toString(){
         return super.toString() + "\nTitle: " + title;
     }
}
