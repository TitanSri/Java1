/*
 * Use with TestHolden
 */

/**
 *
 * @author admin
 */
public class Holden implements Cars{
    private boolean gas;
    public Holden(boolean gas){
        this.gas=gas;
    }
    
    public boolean getGas() {
        return this.gas;
    }
    
    public void run(){
        if (gas==true){
            System.out.println("Running");
        }
        else{
            System.out.println("Stopped");
        }
    }
}