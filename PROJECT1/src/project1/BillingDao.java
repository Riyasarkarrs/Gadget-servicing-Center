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
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BillingDao extends DB{
public static int save(int callno,String cod,String dc,String bu){
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into billing(callno,cod,dc,bu) values(?,?,?,?)");
		ps.setInt(1,callno);
		ps.setString(2,cod);
		ps.setString(3,dc);
		ps.setString(4,bu);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static boolean checkBook(int callno){
	boolean status=false;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from books where callno=?");
		ps.setInt(1,callno);
	    ResultSet rs=ps.executeQuery();
		status=rs.next();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}
