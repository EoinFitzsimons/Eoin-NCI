/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructiontremplatedesignpattern;

import javax.swing.JOptionPane;

/**
 *
 * @author eoin0
 */
public class CTDPApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String type = JOptionPane.showInputDialog(null,"House of Flat?");
        
        if(type.equalsIgnoreCase("house")){
            Construction temp = new House();
            temp.build(type);
        }else{
            Construction temp = new Flat();
            temp.build(type);
        }
        
    }

    
}
