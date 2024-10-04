/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dllist2024;

/**
 *
 * @author EThornbury
 */
public interface LinearListInterface {
    
    public boolean isEmpty();
    public int size();
    public Object get(int index);
    public void remove(int index);
    public void add(int index, Object theElement);
    //public void add(Object element);
    public void printList();
    
    
}
