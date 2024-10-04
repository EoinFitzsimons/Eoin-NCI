/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singlelinkedlist;

/**
 *
 * @author eoin0
 */
class Node {
	private Object element;
	private Node next;

public Node(Object e, Node n){
	element = e;
	next = n;
	}

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Node{" + "element=" + element + '}';
    }

	
}  
