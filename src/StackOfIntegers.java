/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    /** Construct a stack with the default capacity 16 */
    public StackOfIntegers() {
      this(DEFAULT_CAPACITY);
    }

    /** Construct a stack with the specified capacity */
    public StackOfIntegers(int capacity) {
      elements = new int[capacity];
    }

    /** Push a new integer into the top of the stack */
    public void push(int value) {
      if (size >= elements.length) {
        int[] temp = new int[elements.length * 2];
        // Arrarycopy from start 0 to destination start 0 until length
        System.arraycopy(elements, 0, temp, 0, elements.length);
        elements = temp;
      }

      elements[size++] = value;
    }

    /** Return and remove the top element from the stack */
    public int pop() {
      return elements[--size];
    }

    /** Return the top element from the stack */
    public int peek() {
      return elements[size - 1];
    }

    /** Test whether the stack is empty */
    public boolean empty() {
      return size == 0;
    }

    /** Return the number of elements in the stack */
    public int getSize() {
      return size;
    }
}
    

