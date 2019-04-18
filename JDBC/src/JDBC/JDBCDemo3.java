package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/javaDemo";
		String username = "root";
		String password = "028110";
		Connection con = DriverManager.getConnection(url, username, password);

		Statement stat = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		String pass = sc.nextLine();
		
		String sql = "select * from user where name = '"+user+"' and password = '"+pass+"'";
		
		stat.executeQuery(sql);
		
		ResultSet rs = stat.executeQuery(sql);
//		System.out.println(rs.next());
		
		while (rs.next()) {
			System.out.println(rs.getString("name") + " " + rs.getString("password"));
		}
		
		rs.close();
		stat.close();
		con.close();
		sc.close();
	}

}
