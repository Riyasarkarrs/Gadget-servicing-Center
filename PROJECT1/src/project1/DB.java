/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

/**
 *
 * @author riyasarkar
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    public static Connection getConnection(){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
                      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HELLO?autoReconnect=true&useSSL=false","root","Tatanagar"); 
                        return con;
		}catch(Exception e){
                return null;}
}
}