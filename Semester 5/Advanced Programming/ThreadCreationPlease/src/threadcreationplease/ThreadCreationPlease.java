/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadcreationplease;

/**
 *
 * @author eoin0
 */
public class ThreadCreationPlease {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Runnable A = new WordToSay("A", 100);
        Runnable B = new WordToSay("B", 100);
        Runnable C = new NumberToSay(1, 100);

        Thread thread1 = new Thread(A);
        Thread thread2 = new Thread(B);
        Thread thread3 = new Thread(C);

        thread2.start();
        thread1.start();
        thread3.start();
    }
}
