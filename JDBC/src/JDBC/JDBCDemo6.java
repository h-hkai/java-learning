package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class JDBCDemo6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/javaDemo";
		String username = "root";
		String password = "028110";
		Connection con = DriverManager.getConnection(url, username, password);
		
		String sql = "select * from sort";
		
		PreparedStatement pst = (PreparedStatement) con.prepareCall(sql);
		
		ResultSet rs = pst.executeQuery();
		
		while (rs.next()) {
			System.out.println(rs.getInt("sid") + " " + rs.getString("sname") + " " +
							   rs.getString("sprice") + " " + rs.getString("sdesc"));
		}
		
		rs.close();
		pst.close();
		con.close();

	}

}
