/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singlelinkedlist;

/**
 *
 * @author eoin0
 */
public class SLList implements LinkedListInterface {

    private Node head, curr, prev;
    private int size;

    public SLList() {
        head = null;
        size = 0;
        curr = head;
        prev = null;
    }

//    	public boolean isEmpty();
//	public int size();
//	public Object get(int index);
//	public void remove(int index);
//	public void add(Object theElement, int index);
//	public void add(Object theElement);
//	public void printList();
    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object element) {
        Node newNode = new Node(element, null);
        if (head == null) {
            head = newNode;
        } else {
            setCurrent(size);
            curr.setNext(newNode);
        }
        size = size + 1;
    }

    private void setCurrent(int index) {
        int k;
        prev = null;
        curr = head;
        for (k = 1; k < index; k++) {
            prev = curr;
            curr = curr.getNext();
        }
    }

    @Override
    public Object get(int index) {
        setCurrent(index);
        return curr;
    }

    @Override
    public void add(Object element, int index) {
        if (index == 1) {
            Node newNode = new Node(element, head);
            head = newNode;
        } else {
            setCurrent(index);
            Node newNode = new Node(element, curr);
            prev.setNext(newNode);
        }
        size = size + 1;
    }

    @Override
    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Nothing to remove");
        } else {
            if (index == 1) {
                head = head.getNext();
            }else{
                setCurrent(index);
                prev.setNext(curr.getNext());
            }
            size = size - 1;
        }
    }
    
    @Override
    public void printList(){
        Node aNode = head;
        while(aNode != null){
            System.out.println(aNode.toString());
            aNode = aNode.getNext();
        }
    }
    
    
}