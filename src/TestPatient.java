/*
Write a test class named TestPatient that 
prompts the user to enter the following information using two
objects of Doctor and Patient Class:
 */

/**
 *
 * @author mano itc206
 */
public class TestPatient {
    public static void main(String [] args){
        //calculate doctor fees for specific patient
        Doctor doctor1=new
        Doctor(1,"Robert",'M',55,"Bathurst","042112211","Medicine",200);
        Doctor doctor2=new
        Doctor(2,"Tania",'F',50,"Wagga","043212312","Gynae",250);
        Patient patient1=new
        Patient(1,"Michael",'M',35,"Orange","045123123","","back pain","",true);
        Patient patient2=new
        Patient(2,"Adelle",'F',30,"Lithgow","041223123","","pregnancy complications"
                ,"",false);
        Treatment treatment = new Treatment();
        double treatmentCost = treatment.getTreatmentCost(doctor1,patient1);
        System.out.println("Doctor fees " +treatmentCost+" for " +patient1.getName());
        
        treatmentCost = treatment.getTreatmentCost(doctor2,patient2);
        System.out.println("Doctor fees " +treatmentCost+" for " +patient2.getName());
    }
}