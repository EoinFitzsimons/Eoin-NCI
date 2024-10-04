/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinkedlist;

/**
 *
 * @author eoin0
 */
public class DLList implements LinkedListInterface {

    private Node head, curr, prev;
    private int size;

    public DLList() {
        head = null;
        size = 0;
        curr = head;
        prev = null;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public int size() {
        return size;
    }

    private void setCurrent(int index) {
        curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.getNext();
            
        }
    }

    @Override
    public void add(Object element) {
        Node newNode = new Node(element, null, null);
        if (head == null) {
            head = newNode;
            
        } else {
            setCurrent(size);
            newNode.setPrev(curr);
            curr.setNext(newNode);
            
        }
        size = size + 1;
    }

    @Override
    public void add(Object element, int index) {
        if (isEmpty()) {
            Node newNode = new Node(element, null, null);
            head = newNode;
            prev = newNode;
        } else {
            if (index == 1) {
                Node newNode = new Node(element, null, null);
                newNode.setNext(head);
                head.setPrev(newNode);
                head = newNode;
            } else {
                if (index == (size + 1)) {
                    Node newNode = new Node(element, null, null);
                    newNode.setPrev(prev);
                    prev.setNext(newNode);
                    prev = newNode;
                } else {
                    setCurrent(index);
                    Node newNode = new Node(element, null, null);

                    newNode.setNext(curr);
                    Node previous = curr.getPrev();
                    newNode.setPrev(previous);
                    previous.setNext(newNode);
                    curr.setPrev(newNode);
                }
            }
        }size++;
    }

    @Override
    public Object get(int index) {
        setCurrent(index);
        return curr;
    }

    @Override
    public void printList() {
        for (Node aNode = head; aNode != null; aNode = aNode.getNext()) {
            System.out.println(aNode.getElement());
    }}

    @Override
    public void remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
