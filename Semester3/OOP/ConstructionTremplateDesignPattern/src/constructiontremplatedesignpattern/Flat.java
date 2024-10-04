/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructiontremplatedesignpattern;

/**
 *
 * @author eoin0
 */
public class Flat extends Construction {
    
    @Override
    public void type(String type) {
        System.out.println("u r building " +type);
    }

    @Override
    public void foundations() {
        System.out.println("foundations done");
    }

    @Override
    public void floors() {
        System.out.println("floors done");
    }

    @Override
    public void walls() {
        System.out.println("walls done");
    }

    @Override
    public void facilities() {
        String services[] = {"power","internet","water","mainteinance","gym"};
        String flatService = services[(int) Math.floor(Math.random()*4)];
        System.out.println("Services:"+flatService);
    }
    
}
