package JDBCUtils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.PreparedStatement;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
		InputStream in = PropertiesDemo.class.getClassLoader().getResourceAsStream("database.properties");
		Properties pro = new Properties();
		pro.load(in);
		
		String driverClass = pro.getProperty("dirverClass");
		String url = pro.getProperty("url");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, username, password);
		
		PreparedStatement pst = (PreparedStatement) con.prepareStatement("select sname from  sort");
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString("sname"));
		}
		
		JDBCUtils.close(con, pst, rs);
		
	}

}
