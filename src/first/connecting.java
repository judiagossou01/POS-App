/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PCLand
 */
public class connecting {
    
    public static Connection db(){
    
     Connection conn = null;
    
    
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sportsshop","root","");
            
              
        } catch (Exception e) {
            
         
            
            
        }
    
    
        return conn;
        
    
}
    
}
