/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author riyasarkar
 */
import java.math.*;
import java.security.*;
public class NewClass {
public static String Getsha256(String input) {
	try {
	MessageDigest md= MessageDigest.getInstance("SHA-256");
	byte[] messageDigest=md.digest(input.getBytes());
	BigInteger v= new BigInteger(1,messageDigest);
	String hashtext=v.toString(16);
	while(hashtext.length()>32) {
		hashtext="0"+hashtext;
	}return hashtext;}
	catch(Exception e){
		System.out.println("invalid algorithm"+e);
		return null;
	}
}
	public static void main(String args[]) throws Exception{
		String st1="hello";
		System.out.println(st1+":"+Getsha256(st1));
		String st2="world";
		System.out.println(st1+":"+Getsha256(st2));
		String st3=st1.concat(st2);
		System.out.println(st1+":"+Getsha256(st3));
	
}
}