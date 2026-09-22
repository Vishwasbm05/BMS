package com.bank.backend;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.exceptions.ConnectionFeatureNotAvailableException;

public class BankApp {
	static Connection con;
	static Statement stmt;
	
	
	
	static void CreateAccount(String cname,String email,String password,double bal) throws SQLException {
		String iqry="insert into account(cname,email,password,balance) values ('"+cname+"','"+email+"','"+password+"','"+bal+"')";  
		int result=stmt.executeUpdate(iqry);
		System.out.println("Result is : "+result);
		System.out.println("Account created successfully");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("load and registered");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","vishwas");
		System.out.println("Connection eshtablished");
	    stmt= con.createStatement();
	    System.out.println("Platform created to execcute the query");
	    
		
		
		BankApp b=new BankApp();
		b.CreateAccount("Dinga","Dinga@gmail.com","dingi",5000.0);
		
		
		
				
	}
}
