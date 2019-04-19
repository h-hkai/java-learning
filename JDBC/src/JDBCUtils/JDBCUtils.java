package JDBCUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class JDBCUtils {
	private JDBCUtils() {}
	private static Connection con;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/javaDemo";
			String username = "root";
			String password = "028110";
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			throw new RuntimeException(e + "connect fail");
		}
	}
	
	public static Connection getConnection() {
		return con;
	}
	
	public static void close(Connection con, PreparedStatement stat) {
		if (stat != null) {
			try {
				stat.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void close(Connection con, PreparedStatement stat, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
		if (stat != null) {
			try {
				stat.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
	}
}
