package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class JDBCDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		DriverManager.registerDriver(new Driver());
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/javaDemo";
		String username = "root";
		String password = "028110";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println(con);
		
		Statement stat = (Statement) con.createStatement();
		System.out.println(stat);
		
		int row = stat.executeUpdate
				("insert into sort (sname, sprice, sdesc) values ('Bag', 200, 'discount 80%')");
		System.out.println(row);
		
		stat.close();
	}
}
