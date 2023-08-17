/*
 * Sample Exam question 3
 */
import java.util.*;
/**
 *
 * @author admin
 */
public class WordList {
    private static final int DEFAULTSIZE = 100;
    
    private int maxWords;
    private String[] list;
    private int length;
    
    //Constructor
    public WordList(int size){
        if (size > DEFAULTSIZE){
            list = new String[DEFAULTSIZE];
        }
        else{
            list = new String[size];
        }
        length = 0;
    }
    
    // Methods
    // Add word
    public boolean addWord(String word){
        if (length < DEFAULTSIZE){
            
            this.list[length] = word;
            length++;
            return true;
        }
        else{
            System.out.println("List is full!");
            return false;
        }
    }
    // Find word
    public void findWord(String word){
        for (int i = 0; i < length; i++){
            if (list[i].startsWith(word)){
                System.out.println("Word found!");
                        return;
            }  
        }
        System.out.println("Word not found!");
    }
    // Print list
    public void printList(){
        for (String s : list){
            System.out.println(s);
        }
    }
}
