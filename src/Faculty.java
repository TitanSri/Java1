
/**********************************************************
*                      Faculty                            *
*---------------------------------------------------------*
* -officeHours: int                                       *
* -rank: String                                           *
* +Faculty(name: String, address: String, phone: String,  *
*  email: String, office: int, salary: double,            *
*  officeHours: int, rank: String)     *
* +getOfficeHours(): int                                  *
* +setOfficeHours(officeHours: int): void                 *
* +getRank(): String                                      *
* +setRank(rank: String): void                            *
* +toString(): String                                     *
**********************************************************/

/**
 *
 * @author jsquared21
 * edited by Toby Sriratanakoul
 */
public class Faculty 
        extends Employee{
     private String officeHours;
     private String rank;
     
     // Constructor with arg
     public Faculty(String name, String address, String phone, String email, int office,
             double salary, String officeHours, String rank){
         super(name, address, phone, email, office, salary);
         this.officeHours = officeHours;
         this.rank = rank;
     }
    
     // Return office hours
     public String getOfficeHours(){
         return officeHours;
     }
     
     // Set office hours
     public void setOfficeHours(String officeHours){
         this.officeHours = officeHours;
     }
     
     // Return rank
     public String getRank(){
         return rank;
     }
     
     // Set rank
     public void setRank(String rank){
         this.rank = rank;
     }
     
     // To string description of faculty
     public String toString(){
         return super.toString() + "\nOffice hours: " + officeHours +
                 "\nRank: " + rank;
     }
    
}
