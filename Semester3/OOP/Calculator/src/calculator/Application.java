/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**
 *
 * @author eoin0
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Operations op = new Operations();
        op.add(2,3);
        System.out.println("Result for two parameters: " + op.getResult());
        System.out.println("Result for three parameters: " + op.add(2,3,4));
        
    }
    
}
