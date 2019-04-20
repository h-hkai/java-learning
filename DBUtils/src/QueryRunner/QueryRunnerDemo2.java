package QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;


public class QueryRunnerDemo2 {

	private static Connection con = JDBCUtilsConfig.getConnection();
	
	public static void main(String[] args) throws SQLException {
//		arrayHandler();
//		arrayListHandler();
//		beanHandler();
//		beanListHandler();
//		columnListHander();
//		scalarHandler();
//		mapHandler();
		mapListHandler();
	}
	
	public static void mapListHandler() throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from sort";
		List<Map<String, Object>> list = qr.query(con, sql, new MapListHandler());
		for (Map<String, Object> map : list) {
			for (String key : map.keySet()) {
				System.out.println(key + " " + map.get(key));
			}
			System.out.println();
		}
	}
	
	public static void mapHandler() throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from sort";
		Map<String, Object> map = qr.query(con, sql, new MapHandler());
		for (String key : map.keySet())
			System.out.println(key + " " + map.get(key));
			
	}
	
	public static void scalarHandler() throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "select count(*) from sort";
		Long count = qr.query(con, sql, new ScalarHandler<Long>());
		System.out.println(count);
	}
	
	public static void columnListHander() throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from sort";
		List<Object> list = qr.query(con, sql, new ColumnListHandler<Object>("sname"));
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
	
	public static void beanListHandler() throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from sort";
		List<Sort> list = qr.query(con, sql, new BeanListHandler<Sort>(Sort.class));
		for (Sort s : list) {
			System.out.println(s);
		}
	}
	
	public static void beanHandler() throws SQLException {
		QueryRunner qr = new QueryRunner();
		String sql = "select * from sort";
		Sort s = qr.query(con, sql, new BeanHandler<Sort>(Sort.class));
		System.out.println(s);
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
