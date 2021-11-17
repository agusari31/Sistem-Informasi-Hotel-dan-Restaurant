/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.hotel.dan.restaurant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class koneksi {
    public static Connection con;
    public static Statement stm;
    
    public koneksi(){
        try{
            String url ="jdbc:mysql://localhost/db_hotel_and_restaurant";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stm = con.createStatement();
            System.out.println("Database connected");
            
        }catch(Exception e){
            System.out.println("Database not connected");
        }
    }
    
    public Statement getStatement(){
        return stm;
    }
    
}
