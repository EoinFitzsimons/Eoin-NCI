/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author eoin0
 */
public class MyStack implements StackInterface {

    private ArrayList<String> aStack;

    public MyStack() {
        aStack = new ArrayList<>();
    }

    @Override
    public void push(Object newItem) {
        aStack.add(0, (String) newItem);
    }

    @Override
    public boolean isEmpty() {
        return aStack.isEmpty();
    }

    @Override
    public Object pop() {
        if (aStack.isEmpty()) {
//      if(isEmpty()){
            return null;
        } else {
            return aStack.remove(0);
        }
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return aStack.get(0);
        }
    }

    @Override
    public int size() {
        return aStack.size();
    }

    @Override
    public String display() {
//      display stack from top zero index to the bottom
        String str = "";
        if (isEmpty()) {
            str = str.concat("Empty stack, nothing to display");
        } else {
//            for(int i = 0; i < aStack.size(); i++){
//                str = str.concat(aStack.get(i));
//                str = str.concat(" ; ");
//            }
            Iterator it;
            it = aStack.iterator();
            while (it.hasNext()) {
                str = str.concat((String)it.next());
                str = str.concat(" ; ");
            }
        }
//      return the str
        return str;
    }
}
