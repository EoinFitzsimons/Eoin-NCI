/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author eoin0
 */
public class Operations {
    private double n1, n2, n3, result;
    
    public Operations() {
        n1 = n2 = n3 = 0;
    }
    
    public void add(double n1, double n2){
        result = n1 + n2;
    }
    
    public double getResult(){
        return result;
    }
    
    public double add(double n1, double n2, double n3){
        return result = n1 + n2 + n3;
    }
    
}
