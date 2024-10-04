/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eoin0
 */
public class ThreadIDsRun implements Runnable {

    public String id;
    public String name;

    public ThreadIDsRun(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.id + this.name);
        }

    }
}
