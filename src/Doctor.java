/*
Another class named Doctor that extends the Person class. This class contains:
• Three data fields: doctor Id, specialization, fees.
• A no-arg constructor.
• A constructor that creates a Doctor’s information with specified eight fields.
• A get method that return the doctor’s fees.
 */

/**
 *
 * @author mano itc206
 */
public class Doctor extends Person_Dr_Patient{
    // data fields
    private int doctorId;
    private String specilization;
    private double fees;
    
    //no-arg constructor
    public Doctor(){
    doctorId=0;
    specilization="Medicine";
    fees=0.0;
    }
    
    //constructor with doctor’s information
    public Doctor(int doctorId,String name,char sex,int age,String address,

        String phone, String specilization,double fees){
        this.doctorId=doctorId;
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.address=address;
        this.phone=phone;
        this.specilization=specilization;
        this.fees=fees;
    }

    //method that return the doctor fees
    public double getFees(){
        return this.fees;
    }
}
