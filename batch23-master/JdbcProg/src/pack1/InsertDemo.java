package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InsertDemo {

	public static void main(String[] args) {
		//step-1
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//step-2
			Connection connection = 
					DriverManager.getConnection
		   ("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			
			System.out.println(connection.getClass());
			//step-3
			Statement stmt = connection.createStatement();
			
			//step-4
			//stmt.executeUpdate
	//("create table test(id number(10),name varchar2(20))");
			
			int count = stmt.executeUpdate
					("drop table test");
			
			System.out.println(count+" rows effected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
