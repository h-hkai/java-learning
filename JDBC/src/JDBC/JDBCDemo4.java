package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class JDBCDemo4 {

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
		
		String sql = "select * from user where name=? and password=?";
		PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
		
		pst.setObject(1, user);
		pst.setObject(2, pass);
		
//		stat.executeQuery(sql);
		
		ResultSet rs = pst.executeQuery();
//		System.out.println(rs.next());
		
		while (rs.next()) {
			System.out.println(rs.getString("name") + " " + rs.getString("password"));
		}
		
		rs.close();
		pst.close();
		stat.close();
		con.close();
		sc.close();
	}

}
