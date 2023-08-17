/****************************************************************************************
 *      Event                                                                           *
 * -------------------------------------------------------------------------------------*
 * <<constructor>>Event()                                                               *
 * <<constructor>>Event(String: newTitle, int: newStatus)                               *
 * <<constructor>>Event(String: title; String: category, int: status, int popularity)   *
 * +__PENDING__: int                                                                        *
 * +__ON__: int                                                                             *
 * +__DONE__: int                                                                           *
 * +__LOW__: int                                                                            *
 * +__MEDIUM__: int                                                                         *
 * +__HIGH__: int                                                                           *
 * -title: String                                                                       *
 * -category: String                                                                    *
 * -status: int                                                                         *
 * -popularity: int                                                                     *
 * -------------------------------------------------------------------------------------*
 * +getTitle: String                                                                    *
 * +getCategory: String                                                                 *
 * +getStatus: String                                                                   *
 * +getPopularity: String                                                               *
 * +setTitle(String): void                                                              *
 * +setCategory(String): void                                                           *
 * +setStatus(int): void                                                                *
 * +setPopularity(int): void                                                            *
 * +toString: String                                                                    *
 * **************************************************************************************
 */

/**
 *
 * @author Toby Sriratanakoul
 */
public class Event {
    // Declaration
    public final static int PENDING = 1;
    public final static int ON = 2;
    public final static int DONE = 3;
    
    public final static int LOW = 1;
    public final static int MEDIUM = 2;
    public final static int HIGH = 3;
    
    private String title;
    private String category;
    private int status;
    private int popularity;
    
    // Constructor default
    Event(){
        title = "unknown";
        category = "soccer";
        status = 1;
        popularity = 3;
    }
    // Constructor
    Event(String newTitle, int newStatus){
        this.title = newTitle;
        this.status = newStatus;
    }
    // Constructor overload
    Event(String title, String category,int status, int popularity){
        this.title = title;
        this.category = category;
        this.status = status;
        this.popularity = popularity;
    }
    
    // ***Accessor*** (getter)
    // Get title method
    public String getTitle(){
        return title;
    }
    
    // Get category method
    public String getCategory(){
        return category;
    }
    
    // Get status method
    public String getStatus(){
        String s = "";
        switch (status){
            case PENDING: s = "PENDING"; 
                break;
            case ON: s = "ON";
                break;
            case DONE: s = "DONE";
                break;            
        }
        return s;
    }
    
    // Get popularity method
    public String getPopularity(){
        String s = "";
        switch (popularity){
            case LOW: s = "LOW";
                    break;
            case MEDIUM: s = "MEDIUM";
                    break;
            case HIGH: s = "HIGH";
                    break;
        }
        return s;
    }
    
    // ***Mutator*** (setter)
    // Set title method
    public void setTitle(String newTitle){
        title = newTitle;
    }
    
    // Set category method
    public void setCategory(String newCategory){
        category = newCategory;
    }
    
    // Set status method
    public void setStatus(int newStatus){
        status = newStatus;
    }
    
    // Set popularity method
    public void setPopularity(int newPopularity){
        popularity = newPopularity;
    }
    
    // Set to string method
    public String toString(){
        return "\nTitle: " + getTitle() + "\nCategory: " + getCategory() + 
                "\nStatus: " + getStatus() + "\nPopularity: " + getPopularity();
    }
}
