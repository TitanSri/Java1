/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class TestStackOfIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        StackOfIntegers stack = new StackOfIntegers();
    
        for (int i = 0; i < 10; i++)
          stack.push(i);

        while (!stack.empty())
          System.out.print(stack.pop() + " ");  
        }
}
    