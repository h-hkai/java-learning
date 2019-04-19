package QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;


public class QueryRunnerDemo2 {

	private static Connection con = JDBCUtilsConfig.getConnection();
	
	public static void main(String[] args) throws SQLException {
//		arrayHandler();
		arrayListHandler();
	}
	
	public static void arrayListHandler() throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from sort";
		List<Object[]> result = qr.query(con, sql, new ArrayListHandler());
//		System.out.println(result.getClass());
		for (Object[] objs : result) {
			for (Object obj : objs) {
				System.out.print(obj);
			}
			System.out.println();
		}
	}
	
	public static void arrayHandler() throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from sort";
		Object[] result = qr.query(con, sql, new ArrayHandler());
		for (Object obj : result) {
			System.out.println(obj);
		}
	}

}
