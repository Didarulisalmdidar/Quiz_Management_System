/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author HP
 */
public class ConnectionProvider {
    public static Connection getcon()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:330/qems","root","1234");
            return con;
            
        }
    
        catch(Exception e)
        {
            //System.out.println("cpd");
            return null;
        }
        
        }
    
    
}
