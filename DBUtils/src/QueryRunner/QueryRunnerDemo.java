package QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

public class QueryRunnerDemo {
	private static Connection con = JDBCUtilsConfig.getConnection();
	
	public static void main(String[] args) throws SQLException {
//		insert();
//		update();
		delete();
	}
	
	public static void delete() throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "delete from sort where sid = ?";
		int row = qr.update(con, sql, 7);
		System.out.println(row);
		DbUtils.closeQuietly(con);
	}
	
	public static void update() throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "update sort set sname = ?, sprice = ?, sdesc = ? where sid = ?";
		Object[] params = {"flowers", 100, "discount 80%", 6};
		int row = qr.update(con, sql, params);
		System.out.println(row);
		DbUtils.closeQuietly(con);
	}
	
	public static void insert() throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "insert into sort (sname, sprice, sdesc) values (?, ?, ?)";
		Object[] params = {"Sports", 289, "discount 30%"};
		int row = qr.update(con, sql, params);
		System.out.println(row);
		DbUtils.closeQuietly(con);
	}
}
