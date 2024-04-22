/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

/**
 *
 * @author riyasarkar
 */

import java.sql.*;  
import javax.swing.JOptionPane;
class MySqlcon{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HELLO?autoReconnect=true&useSSL=false","root","Tatanagar"); 
/**JOptionPane.showMessageDialog(null,"connected");
here hello is database name, root is username and password  

Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from books");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close(); **/
}catch(Exception e){ System.out.println(e);}  
}  
}


