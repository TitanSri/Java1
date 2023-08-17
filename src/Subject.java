/*******************************************************************************
 *                          Subject Class                                      *
 * ----------------------------------------------------------------------------*
 * -subjectName: String                                                         *
 * -subjectCode: String                                                         *
 * +Subject(subjectName: String, subjectCode: String)                           *
 * +getSubjectName(): String                                                   *
 * +getSubjectCode(): String                                                   *
 * +setSubjectCode(): String                                                   *
 * +codeMatches(subjectCode: String): boolean                                  *
 * +toString(): String                                                         *
 * +isValidCode(String): boolean                                               *
 * +codeExists(ArrayList): boolean                                             *
 * *****************************************************************************
 */
import java.util.ArrayList;
/**
 *
 * @author Toby Sriratanakoul
 */
public class Subject {
    // Declaration
    private String subjectName;
    private String subjectCode;
    
    // Constructor 
    public Subject(String subjectName, String subjectCode){
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
    }
    
    // Methods
    // Get the subject name
    public String getSubjectName(){
        return subjectName;
    }
    
    // Get the subject code
    public String getSubjectCode(){
        return subjectCode;
    }
    
    // Set the subject code
    public void setSubjectCode(String subjectCode){
        this.subjectCode = subjectCode;
    }
    
    // Check to see if the code matches the requirements with an argument 
    public boolean codeMatches(String subjectCode){
        if (subjectCode.matches(this.subjectCode)){
            return true;
        }
        else 
            return false;
    }
    
    // To string method
    public String toString(){
        return subjectName + " " + subjectCode;
    }
    
    // Validate the code is three letters and three numbers
    public boolean isValidCode(){
        if (subjectCode.matches("[a-zA-Z]{3}[0-9]{3}")){
            return true;
        }
        else 
            return false;
    }
    
    // Checks the list for the new subject code
    public boolean codeExists(ArrayList<String> list){
        // Convert the list to upper case
        ArrayList<String> temp = new ArrayList(list);
        temp.replaceAll(String::toUpperCase);
        // Convert the subject code to upper case
        String testSubjectCode = subjectCode.toUpperCase();
        // search for upper case subject code with the upper case array list
        for (String str: temp){
            if (str.trim().contains(testSubjectCode))
                return true;
        }
        return false;
    }
    
    
}
