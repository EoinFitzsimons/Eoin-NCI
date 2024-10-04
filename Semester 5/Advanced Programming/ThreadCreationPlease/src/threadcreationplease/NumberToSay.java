/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadcreationplease;

/**
 *
 * @author eoin0
 */
public class NumberToSay implements Runnable{

    private int num;
    private int times;

    public NumberToSay(int num, int times) {
        this.num = num;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
                System.out.println(num);
                num++;
            }
        }
    }

