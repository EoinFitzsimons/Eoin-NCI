/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructiontremplatedesignpattern;

/**
 *
 * @author eoin0
 */
public abstract class Construction {
    public abstract void type(String type);
    public abstract void foundations();
    public abstract void floors();
    public abstract void walls();
    public abstract void facilities();
    
    public void complete(){
        System.out.println("Build Complete");
    }
    
    // order - final means cannot be changed
    public final void build(String type){
        type(type);
        foundations();
        floors();
        walls();
        facilities();
        complete();
    }
            
    
}
