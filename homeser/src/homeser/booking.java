package homeser;

import java.sql.*;
import java.util.Scanner;

public class booking {
	public Connection getconn()
	{
	Connection con = null;
	try
	{
	String url= "jdbc:mysql://localhost:3308/HomeService";
	String username="root";
	String pass="1234567";
	con = DriverManager.getConnection(url,username,pass);
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	return con;
	}


	Scanner sc1 = new Scanner(System.in);
	

	public void Ac_repair()  throws SQLException {
		
		 
		 System.out.println("******Please enter  details********");
		 Connection con = getconn();
		 
		 String s1 = "insert into Ac_repair(name,address,date) values(?,?,?)";
		 PreparedStatement stmt = con.prepareStatement(s1);

		             System.out.println("Enter ur Name:");
		             String name =sc1.nextLine();
		             System.out.println("Enter ur address:");
		             String address =sc1.nextLine();
		             System.out.println("Enter ur date");
		             String date = sc1.nextLine();
		            
		       stmt.setString(1,name);
		       stmt.setString(2,address);
		       stmt.setString(3,date);
		       int a = stmt.executeUpdate();
		       System.out.println("your slot has been booked  for ");
		      System.out.println(name+ " "+ address+" on "+ date);
		       
		       
		       }  
		 

		
		
	

	public void Cleaning() throws SQLException {
		System.out.println("******Please enter your details********");
		 Connection con = getconn();
		 String s1 = "insert into cleaning(name,address,date) values(?,?,?)";
		 PreparedStatement stmt = con.prepareStatement(s1);

		             System.out.println("Enter ur Name:");
		             String name =sc1.nextLine();
		             System.out.println("Enter ur address:");
		             String address =sc1.nextLine();
		             System.out.println("Enter ur date");
		             String date = sc1.nextLine();
		            
		       stmt.setString(1,name);
		       stmt.setString(2,address);
		       stmt.setString(3,date);
		       int a = stmt.executeUpdate();
			   
		       System.out.println("your slot has been booked  for ");
		      System.out.println(name+ " "+ address+" on "+ date);
		      ResultSet rs=stmt.executeQuery("select * from  cleaning ");    
		      //   boolean b=rs.next();
		        // System.out.println(b);
		     
		       
		       
		// TODO Auto-generated method stub
		
	}

	public void Plumber() 
			throws SQLException {
			System.out.println("******Please enter your details********");
			 Connection con = getconn();
			 String s1 = "insert into plumber(name,address,date) values(?,?,?)";
			 PreparedStatement stmt = con.prepareStatement(s1);

			             System.out.println("Enter ur Name:");
			             String name =sc1.nextLine();
			             System.out.println("Enter ur address:");
			             String address =sc1.nextLine();
			             System.out.println("Enter ur date");
			             String date = sc1.nextLine();
			            
			       stmt.setString(1,name);
			       stmt.setString(2,address);
			       stmt.setString(3,date);
			       int a = stmt.executeUpdate();
				   
			       System.out.println("your slot has been booked  for ");
			      System.out.println(name+ " "+ address+" on "+ date);
			       
		// TODO Auto-generated method stub
		
	}

}
