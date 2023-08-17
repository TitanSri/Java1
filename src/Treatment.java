/*
Another class named Treatment that contains:
• Calculate treatment cost using a method and 
set the finding of the patient status. This method
return half fees if the patient has health coverage, otherwise return full fees.
 */

/**
 *
 * @author mano itc206
 */
public class Treatment {
    //calculate treatment cost
    public double getTreatmentCost(Doctor doctor,Patient patient){
        patient.setFinding("back trauma");
        double patientFee;
        
        if (patient.gethealthCoverage())
            patientFee=doctor.getFees()/2;
        else
            patientFee=doctor.getFees();
            return patientFee;
    }
}