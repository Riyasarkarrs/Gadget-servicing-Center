/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author riyasarkar
 */
package project1;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RerequestDao extends DB{
public static int save(int callno,String issue){
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into rerequest(callno,issue) values(?,?)");
		ps.setInt(1,callno);
		ps.setString(2,issue);
		
		
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}
