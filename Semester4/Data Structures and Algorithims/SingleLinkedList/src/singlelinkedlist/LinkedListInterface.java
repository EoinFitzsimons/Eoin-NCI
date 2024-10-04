/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package singlelinkedlist;

/**
 *
 * @author eoin0
 */
public interface LinkedListInterface {
    	public boolean isEmpty();
	public int size();
	public Object get(int index);
	public void remove(int index);
	public void add(Object theElement, int index);
	public void add(Object theElement);
	public void printList();

}
