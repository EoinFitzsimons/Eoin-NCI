/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giftdb23;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectDB {
    //1 private attribute
    //2 private constructor
    //3 public static method 
    
    private static Connection conn = null;
    //private constructor
    private ConnectDB(){
    }
    
    //static block to initialise our vars with predefined values
    //myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/giftDB", "root", "password"); 
    static{
       String url = "jdbc:mysql://localhost:3306/giftDB";
       String user = "root";
       String pass ="";
       try{
           conn = DriverManager.getConnection(url, user, pass);
       }catch(SQLException e){
           System.out.println("Error in connection "+e);
       }
    }
    
    public static Connection getConnection(){
        return conn;
    }
}