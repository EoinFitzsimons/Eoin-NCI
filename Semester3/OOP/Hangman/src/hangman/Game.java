/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman;

/**
 *
 * @author eoin0
 */
public class Game {
    private String secret;
    private char playerGuess;
    private String output;
    private StringBuilder sb =  new StringBuilder();
    
    public Game(){
        secret = "java";
        output = "";
        for(int i = 0; i < secret.length(); i++){
            sb.append("*");
        }
    }
    
    public void setPlayerguess(char playerGuess){
        this.playerGuess = playerGuess;
    }

    public String getSecret() {
        return secret;
    }

    
    public void compute(){
        for(int i = 0; i < secret.length(); i++){
            if(playerGuess == secret.charAt(i)){ // taken from Emer NCI
                sb.setCharAt(i, playerGuess); 
                }
        }
        output = sb.toString();
        
    }
    
    public String getOutput() {
        return output;
    }
    
}