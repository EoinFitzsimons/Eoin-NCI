/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataprocess;

/**
 *
 * @author eoin0
 */
public class ProcessData {
    private String sentence;
    private int numVowels, numWords, numCon, numSpace, numLetters;
    
    public ProcessData()    {
        
    }
    // setters for inouts

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
    // getters for outputs
    public String getSentence() {
        return sentence;
    }

    public int getNumVowels() {
        return numVowels;
    }

    public int getNumWords() {
        return numWords;
    }

    public int getNumCon() {
        return numCon;
    }

    public int getNumSpace() {
        return numSpace;
    }

    public int getNumLetters() {
        return numLetters;
    }
    
    public void compute(){
        for (int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                numSpace++;
                }else{
                numLetters++;
                if(sentence.charAt(i) == 'a'||sentence.charAt(i) == 'e'||sentence.charAt(i) == 'i'||sentence.charAt(i) == 'o'||sentence.charAt(i) == 'u'){
                numVowels++;
                 }else{
                    numCon++;
            }
        }
    }
}
}