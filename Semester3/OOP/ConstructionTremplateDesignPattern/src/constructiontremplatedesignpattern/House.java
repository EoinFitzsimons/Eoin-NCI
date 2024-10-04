/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructiontremplatedesignpattern;

/**
 *
 * @author eoin0
 */
public class House extends Construction {

    @Override
    public void type(String type) {
        System.out.println("you r building " +type);
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
        String services[] = {"power","internet","water"};
        String houseService = services[(int) Math.floor(Math.random()*2)];
        System.out.println("Services:"+houseService);
    }
    
}
