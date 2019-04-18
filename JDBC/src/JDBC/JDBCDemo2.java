package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/javaDemo";
		String username = "root";
		String password = "028110";
		Connection con = DriverManager.getConnection(url, username, password);

		Statement stat = con.createStatement();
		
		String sql = "select * from sort;";
		
		ResultSet rs = stat.executeQuery(sql);
		
		System.out.println(rs.next());
		
		while (rs.next()) {
			System.out.print(rs.getInt("sid") + " ");
			System.out.print(rs.getString("sname") + " ");
			System.out.print(rs.getDouble("sprice") + " ");
			System.out.println(rs.getString("sdesc") + " ");
		}
		
		rs.close();
		stat.close();
		con.close();
		
		
	}

}
