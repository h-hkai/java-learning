package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class JDBCDemo5 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/javaDemo";
		String username = "root";
		String password = "028110";
		Connection con = DriverManager.getConnection(url, username, password);
		
		String sql = "update sort set sname = ?, sprice = ? where sid = ?";
		
		PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
		pst.setObject(1, "Cup");
		pst.setObject(2, "60");
		pst.setObject(3, "4");
		pst.executeUpdate();
		
		pst.close();
		con.close();
		
	}

}
