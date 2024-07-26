package com.tnsif.jdbcmini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

import com.mysql.cj.xdevapi.Result;

public class Dataa 
{
private static final String url="jdbc:mysql://localhost:3306/jdbc";
private static final String username="root";
private static final String password="Logasri15#";

public static void showData()throws SQLException
{
	Connection cn=DriverManager.getConnection(url,username,password);
	Statement st=cn.createStatement();
	String query="select*from employee";
	ResultSet rs=st.executeQuery(query);

	while(rs.next())
	{

		System.out.println("id:"+rs.getInt(1));
		System.out.println("name:"+rs.getString(2));
		System.out.println("salary:"+rs.getInt(3));
		System.out.println("location:"+rs.getString(4));
		System.out.println("designation:"+rs.getString(5));
	}
	cn.close();
	
}
     public static void deleteData()throws SQLException
     {
    	 Scanner s=new Scanner(System.in);
    	 System.out.println("enter the employee id to delete:");
    	 int det=s.nextInt();
    	 String query="delete from employee where id="+det;
    	 Connection cn=DriverManager.getConnection(url,username,password);
         Statement st=cn.createStatement();
         int rows=st.executeUpdate(query);
         System.out.println("Number of rows to afected:"+rows);
         cn.close();
     }
     public static void insertData()throws SQLException
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter the employee id to insert");
    	 int empid=sc.nextInt();
    	 sc.nextLine();
    	 System.out.println("enter the employee name to insert:");
    	 String empname=sc.next();
    	 System.out.println("enter the salary to insert");
    	 int empsalary=sc.nextInt();
    	 sc.nextLine();
    	 System.out.println("enter the location of employee to insert");
    	 String emplocation=sc.next();
    	 System.out.println("enter the designation of the employee to insert");
    	 String empdesignation=sc.next();
    	 String query="insert into employee values("+empid+",'"+empname+"',"+empsalary+",'"+emplocation+"','"+empdesignation+"');";         
    	 Connection cn=DriverManager.getConnection(url,username,password);
         Statement st=cn.createStatement();
         int rows=st.executeUpdate(query);
         System.out.println("Number of rows to afected:"+rows);
         cn.close();
     }
         public static void updateData() throws SQLException
         {
        	int id,value;
        	Scanner sc=new Scanner(System.in);
        	System.out.println("enter the employee id to update");
        	id=sc.nextInt();
            Connection cn=DriverManager.getConnection(url,username,password);
            Statement st=cn.createStatement();
            while(id!=0)
            {
            	System.out.println("updation in all columns then enter 1or 0");
            	value=sc.nextInt();
            	if(value==1)
            	{
            		System.out.println("enter the employee name for updation");
            		String name=sc.next();
            		System.out.println("enter the employee salary for updation");
            		int salary=sc.nextInt();
            		System.out.println("enter the employee location for updation");
            		String loc=sc.next();
            		System.out.println("enter the employee designation for updation");
            		String designation=sc.next();
            		String query="update employee set salary='"+salary+"'where id="+id;
            		String qa="update employee set designation='"+designation+"'where id="+id;
            		String qu="update employee set name='"+name+"'where id="+id;
            		String q="update employee set location='"+loc+"'where id="+id;
            		
            	}
            	
            	else
            	{
            		String column;
            		System.out.println("which column to be updated");
            		column=sc.next();
            		switch(column) 
            		{
            		case "name":
            			System.out.println("enter the employee name for updattion");
            			String name=sc.next();
            			String qu="update employee set name='"+name+"'where id="+id;
                		int r=st.executeUpdate(qu);
                		break;
            		case "salary":
            			System.out.println("enter the employee salary for updattion");
            			int salary=sc.nextInt();
            			String query="update employee set salary='"+salary+"'where id="+id;
            			int rows=st.executeUpdate(query);
                		break;
                		
            		case "location":
            			System.out.println("enter the employee location for updattion");
            			String loc=sc.next();
            			String q="update employee set location='"+loc+"'where id="+id;
                		int ro=st.executeUpdate(q);
                		break;
            		case "designation":
            			System.out.println("enter the employee salary for updattion");
            			String designation=sc.next();
            			String qa="update employee set designation='"+designation+"'where id="+id;
            			int rowss=st.executeUpdate(qa);
                		break;
            			
            		}
            	}
            	break;
            	
}
            }
     }
      

