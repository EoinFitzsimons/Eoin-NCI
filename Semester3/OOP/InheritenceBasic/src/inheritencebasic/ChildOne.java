/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritencebasic;

/**
 *
 * @author eoin0
 */
public class ChildOne extends Parent{
        private String talent;
    
    public ChildOne(){
        System.out.println("ChildOne");
    }

    public ChildOne(String talent, String name) {
        super(name);
        this.talent = talent;
    }

    public String getTalent() {
        return talent;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }

    public void print (String name,String talent){
        System.out.println("name: "+name+", talent: "+talent);
    }
    public void print (String name){
        System.out.println("name: "+name);
    }
    
}
