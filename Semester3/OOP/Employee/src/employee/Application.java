/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

import java.io.Serializable;

/**
 *
 * @author eoin0
 */
public class Application implements Serializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//        EmployeeUI myUI = new EmployeeUI();  //declare and create EmployeeIU obj
//        String goAgain;
//        do {
//            myUI.menu();
//            goAgain = JOptionPane.showInputDialog(null, "Enter yes to go back to menu");
//        } while (goAgain.equalsIgnoreCase("yes"));
////write to file
//        String txt = "fourth 2 word";
//        File outfile;
//        FileWriter fw;
//        BufferedWriter bw;
//
//        try {
//            //writing to file code
//            outfile = new File("log.txt");
//            fw = new FileWriter(outfile, true); //true means it will write to end of file
//            bw = new BufferedWriter(fw);
//
//            bw.write(txt); //write the txt to the file
//            bw.newLine(); //add a new line after writing the last line
//            bw.close();  //important
//
//            System.out.println("Written to file");
//
//        } catch (IOException e) {
//            System.out.println("Error: " + e);
//        }
//        File infile;
//        FileReader fr;
//        BufferedReader br;
//
//        try {
//            infile = new File("log.txt");
//            fr = new FileReader(infile);
//            br = new BufferedReader(fr);
//
//            txt = br.readLine();
//            while (text != null) {
//                System.out.println(txt);
//                txt = br.readLine();
//
//            }
//            System.out.println("all read");
//        } catch (IOException e) {
//            System.out.println("error" + e);
//        }
//    }


EmpGUI empGUI = new EmpGUI();
        empGUI.setVisible(true);
    }
    
}
