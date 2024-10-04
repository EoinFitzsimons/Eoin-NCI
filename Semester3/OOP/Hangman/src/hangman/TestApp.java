/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hangman;

import javax.swing.JOptionPane;

/**
 *
 * @author eoin0
 */
public class TestApp {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        String output;
        char playerGuess;
        
        Game g = new Game(); //Game obj is declared and created
        
        for(int i = 0; i < 7; i++){
            
            playerGuess = JOptionPane.showInputDialog(null, "Enter Letter").charAt(0);
            
            g.setPlayerguess(playerGuess);
            
            g.compute();
            
            output = g.getOutput();
            
            JOptionPane.showMessageDialog(null, output);
        }
        
        JOptionPane.showMessageDialog(null, "Secret word: " +g.getSecret());
        
    }
    
}
