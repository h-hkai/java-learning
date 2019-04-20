package Demo;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

public class QueryRunnerDemo {
	public static void main(String[] args) throws SQLException {
//		insert();
		select();
	}
	
	private static QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	
	public static void select() throws SQLException {
		String sql = "select * from sort";
		List<Object[]> list = qr.query(sql, new ArrayListHandler());
		for (Object[] objs : list) {
			for (Object obj : objs) {
				System.out.println(obj);
			}
			System.out.println();
		}
	}
	
	public static void insert() {
		String sql = "insert into sort (sname, sprice, sdesc) values (?, ?, ?)";
		Object[] params = {"fruit", 13, "discount 90%"};
		try {
			int row = qr.update(sql, params);
			System.out.println(row);
		} catch (SQLException e) {
			throw new RuntimeException("data add error");
		}
	}
	
}
