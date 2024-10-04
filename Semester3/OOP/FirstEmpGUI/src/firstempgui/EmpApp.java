/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstempgui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author EThornbury
 */
public class EmpApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpGUI empGUI = new EmpGUI();
        empGUI.setVisible(true);
        
        //writing text to file
        /*
        String txt = "fourth 2 word";
        File outfile;
        FileWriter fw;
        BufferedWriter bw;
        
        try{
            //writing to file code
            outfile = new File("log.txt");
            fw = new FileWriter(outfile, true); //true means it will write to end of file
            bw = new BufferedWriter(fw);
            
            bw.write(txt); //write the txt to the file
            bw.newLine(); //add a new line after writing the last line
            bw.close();  //important
            
            System.out.println("Written to file");
            
        }catch(IOException e){
            System.out.println("Error: "+e);
        }
              
        //read from file
        File infile;
        FileReader fr;
        BufferedReader br;
        
        try{
           infile = new File("log.txt"); 
           fr = new FileReader(infile);
           br = new BufferedReader(fr);
           
           txt = br.readLine(); //text is assigned the line from the file
           while(txt != null){
               System.out.println(txt);
               txt = br.readLine();
           }
//           System.out.println("all read");
           br.close();
        }catch(IOException e){
            System.out.println("Error reading from file: " +e);
        }
           */
        
        
    }
    
}
