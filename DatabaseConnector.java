/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginsignup;

import java.util.logging.Level;
import java.sql.*;
import java.util.logging.Logger;
        
public class DatabaseConnector {

public static void main (String [] args) {

     
        
    try {
        
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/mysql", "root", "012345");
        System.out.println("con");
        
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
    }
            
          
    }
    
    
}
