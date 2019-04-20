package Demo;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;



public class DataSoruceDemo {
	public static void main(String[] args) {
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/javaDemo");
		bds.setUsername("root");
		bds.setPassword("028110");
		
		try {
			Connection con = bds.getConnection();
			System.out.println(con);
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("Connect error!");
		}
		
	}
}
