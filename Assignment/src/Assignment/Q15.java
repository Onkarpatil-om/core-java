package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		System.out.println("Enter city name");
		Scanner sc=new Scanner(System.in);
		String city=sc.nextLine();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","Onkar@1495");
			//PreparedStatement p=con.prepareStatement("select employee.name from employee,employeeAdd where ");
			
			//ResultSet r=p.executeQuery();
			//while(r.next()) {
				//System.out.println("city ="+r.getString(1)+"  country ="+r.getString(2));
			//}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
