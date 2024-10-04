/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eoin0
 */
public class ThreadIDsTest {
    public static void main(String args[]) 
  {
    Runnable T1 = new ThreadIDsRun("T1", "Apple");
    Runnable T2 = new ThreadIDsRun("T2", "Banana");
    new Thread(T1).start();
    new Thread(T2).start();
  }
}
