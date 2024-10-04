/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadlab;

/**
 *
 * @author eoin0
 */
public class ThreadExample {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            int threadIndex = i; // Capture the current value of i
            Thread thread = new Thread(() -> {
                Thread.currentThread().setName("T" + threadIndex);
                System.out.println("Thread ID: " + Thread.currentThread().getId() + ", Thread Name: " + Thread.currentThread().getName());
            });
            thread.start();
        }
    }
}
