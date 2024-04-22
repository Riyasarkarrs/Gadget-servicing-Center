/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author riyasarkar
 */

public class FeedbackDao extends DB{
	
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

/**public static int save(String callno,int CS,String BP,String HP){
	//int status=0;
	try{
		Connection con=DB.getConnection();
		
		//status=updatebook(idno);//updating quantity and issue
		
		//if(status>0){
		PreparedStatement ps=con.prepareStatement("insert into feedbacks(callno,CS,BP,HP) values(?,?,?,?)");
		ps.setString(1,callno);
		ps.setInt(2,CS);
		ps.setString(3,BP);
		ps.setString(4,HP);
		//status=ps.executeUpdate();
		//}
		
		con.close();
	}catch(Exception e){System.out.println(e);}
	//return status;
//}}

//public static int updatebook(String bookcallno){
	/**int status=0;
	int quantity=0,issued=0;
	try{
		Connection con=DB.getConnection();
		
		PreparedStatement ps=con.prepareStatement("select quantity,issued from books where idno=?");
		ps.setString(1,bookcallno);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			quantity=rs.getInt("quantity");
			issued=rs.getInt("issued");
		}
		
		if(quantity>0){
		PreparedStatement ps2=con.prepareStatement("update books set quantity=?,issued=? where callno=?");
		ps2.setInt(1,quantity-1);
		ps2.setInt(2,issued+1);
		//ps2.setString(3,bookcallno);
		
		status=ps2.executeUpdate();
		}
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}**/



public static int save(int callno,String CS,String BP,String HP){
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into feedback(callno,CS,BP,HP) values(?,?,?,?)");
		ps.setInt(1,callno);
		ps.setString(2,CS);
		ps.setString(3,BP);
		ps.setString(4,HP);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}
