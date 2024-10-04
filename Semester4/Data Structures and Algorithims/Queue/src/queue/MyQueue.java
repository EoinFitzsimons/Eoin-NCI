/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author eoin0
 */
public class MyQueue implements QueueInterface {
    private ArrayList<String> qlist;
//  declaration
 
    public MyQueue() {
        qlist = new ArrayList<>();
//      creation of objects
    }
    @Override
    public int size(){
        return qlist.size();
    } 
    @Override
    public boolean isEmpty(){
        return qlist.isEmpty();
    }
    @Override
    public void enqueue(Object newItem){
        qlist.add((String)newItem);
//      cast the object accepted to a String in line with thte qlist
    }
    @Override
    public Object dequeue(){
//      check if there is something in the q
        if(isEmpty()){
        System.out.println("Empty queue");
        return null;
    }else{
        return qlist.remove(0);
//      returning the item at index 0- top of q   
    }
    }
    @Override
    public Object frontElement(){
//  check if something is on the q
    if(isEmpty()){
        System.out.println("Nothing in the Q");
        return null;
    }else{
        return qlist.get(0);
    }
    }
    @Override
    public String display(){
    String str = "";
    Iterator myIterator;
    myIterator = qlist.iterator();
//  use the iterator on the qlist
    if(isEmpty()){
        str = str.concat("Q is empty");
    }else{
        while(myIterator.hasNext()){
            str = str.concat((String)myIterator.next());
            str = str.concat(" ; ");
        }
    }
    return str;
    }
}