package com.tnsif.jdbcmini;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;
import java.util.Scanner;

public class Dataamain {

	public static void main(String[] args)throws SQLException
	{
		/*System.out.println("show the datas");
		Dataa.showData();
		System.out.println("delete row");
		Dataa.deleteData();
		System.out.println("insert row");
		Dataa.insertData();
		System.out.println("update data");
		Dataa.updateData();*/
		Scanner sc=new Scanner(System.in);
		System.out.println("press anyone value 1 or 0");
		int lo=sc.nextInt();
		sc.nextLine();
		
		while(lo!=0)
		{
			System.out.println(" which operation do you want");
		     
		    String log=sc.next();
		    switch(log)
		    {
		    case "delete":
		    	System.out.println("delete operation");
		    	Dataa.deleteData();
		    	break;
		    case "insert":
		    	System.out.println("insert operation");
		    	Dataa.insertData();
		    	break;
		    case "update":
		    	System.out.println("ubdate operation");
		    	Dataa.updateData();
		    	break;
		    case "show":
		    	System.out.println("insert operation");
		    	Dataa.showData();
		    	break;
		    default:
		    	System.out.println("enter the correct value to get operation");
		    		
		    }
		    System.out.println("if you continue press 1 or 0");
		    String logu=sc.next();
		    break;
		 }
		   System.out.println("you press 0 so no change  the datas");
		   Dataa.showData();
		   
	}

}

