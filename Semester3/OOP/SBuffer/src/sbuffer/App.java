/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sbuffer;

/**
 *
 * @author eoin0
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String word = "Hello world";
        StringBuilder sb = new StringBuilder();
        
        sb.append(word.charAt(0));//added 1st char
        for(int i = 1; i < word.length()-1; i++){ //looping over all middle characters
            if (word.charAt(i) == ' ') {
            sb.append(' ');
            }else
            sb.append('*'); // 
            
        }
        
        sb.append(word.charAt(word.length()-1)   ); //added last char
        
        String newWord = sb.toString();
        System.out.println(newWord);
    }
}
