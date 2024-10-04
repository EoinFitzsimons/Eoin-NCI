/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadcreationplease;

/**
 *
 * @author eoin0
 */
public class WordToSay implements Runnable{
 private String word;
    private int times;

    public WordToSay(String word, int times) {
        this.word = word;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
}
