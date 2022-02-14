/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author CHIRAG
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms","root","");
            System.out.print("Success");
            return conn;
        }
        catch(Exception e){
            System.out.print("Fail");
            return null;
        }
    }
}
