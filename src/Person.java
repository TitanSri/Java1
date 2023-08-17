/*****************************************
*                Person                  *
*----------------------------------------*
* -name: String                          *
* -address: String                       *
* -phone: String                         *
* -email: String                         *
* +Person()                              *
* +Person(name: String, address: String, *
*  phone: String, email: String)         *
* +getName(): String                     *
* +getAddress(): String                  *
* +getPhone(): String                    *
* +getEmail(): String                    *
* +setName(name: String ): void          *
* +setAddress(address: String): void     *
* +setPhone(phone: String): void         *
* +setEmail(email: String): void         *
* +toString(): String                    *
*****************************************/

/**
 *
 * @author jsquared21
 * edited by Toby Sriratanakoul
 */
public class Person {
    private String name;
    private String address;
    private String phone;
    private String email;
    
    // Construct default Person
    public Person(){
        this("Unknown", "Unknown", "Unknown", "Unknown");
    }
    
    // Construct Person object with arguments (overload)
    public Person(String name, String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    
    // Return name
    public String getName(){
        return name;
    }
    
    // Return address
    public String getAdress(){
        return address;
    }
    
    // Return phone
    public String getPhone(){
        return phone;
    }
    
    // Return email
    public String getEmail(){
        return email;
    }
    
    // Set name
    public void setName(String name){
        this.name = name;
    }
    
    // Set address
    public void setAddress(String address){
        this.address = address;
    }
    
    // Set phone
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    // Set email
    public void setEmail(String email){
        this.email = email;
    }
    
    // To String
    public String toString(){
        return "\nName: " + name + "\nAdress: " + address + "\nPhone: " + phone
                + "\nEmail: " + email;
    }
   
}
