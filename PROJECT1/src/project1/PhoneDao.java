/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PhoneDao extends DB{
public static int save(String callno,String name,String malfunction,int quantity){
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into books(callno,name,malfunction,quantity) values(?,?,?,?)");
		ps.setString(1,callno);
		ps.setString(2,name);
		ps.setString(3,malfunction);
		ps.setInt(4,quantity);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}
