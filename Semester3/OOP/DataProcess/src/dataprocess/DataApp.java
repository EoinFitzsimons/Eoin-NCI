/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dataprocess;

import javax.swing.JOptionPane;

/**
 *
 * @author eoin0
 */
public class DataApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sentence;
        
        ProcessData pd = new ProcessData();
        
        sentence = JOptionPane.showInputDialog(null, "Enter Sentence");
        pd.setSentence(sentence);
        pd.compute();
        JOptionPane.showMessageDialog(null, pd.getNumCon()+" "+pd.getNumLetters());
    }
    
}
