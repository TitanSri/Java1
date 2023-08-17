/*
Another class named Patient that extends the Person class and this class contains:
• Five data fields: Patient Id, complications, previous history, finding, and health cover status.
• A no-arg constructor.
• A constructor that creates patient’s information with ten fields.
• A get method to return the health coverage status.
• A get method to retune the patient name.
• A set method to set the finding of the patient (e.g. back pain).
 */

/**
 *
 * @author mano itc206
 */
public class Patient extends Person_Dr_Patient {
    //data fields
    private int patientId;
    private String complications;
    private String previousHistory;
    private String finding;
    private boolean healthCoverage;
    
    //no-arg constructor
    public Patient(){
        patientId=0;
        complications="";
        previousHistory="";
        finding="";
        healthCoverage=false;
    }
    
    //constructor with patient’s information
    public Patient(int patientId,String name,char sex,int age,String
    address,String phone,String complecations,String previousHistory,String
    finding,boolean healthCoverage){
        this.patientId=patientId;
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.address=address;
        this.phone=phone;
        this.complications=complications;
        this.previousHistory=previousHistory;
        this.finding=finding;
        this.healthCoverage=healthCoverage;
    }
    
    //method that will finding the disease
    public void setFinding(String finding){
        this.finding=finding;
    }
    
    //return patient name
    public String getName(){
        return this.name;
    }
    
    //return health coverage information
    public boolean gethealthCoverage(){
        return this.healthCoverage;
    }
}