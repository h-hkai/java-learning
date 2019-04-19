package JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Sort;

public class JDBCDemo {

	public static void main(String[] args) throws SQLException {
		Connection con = JDBCUtils.getConnection();
		PreparedStatement pst = con.prepareStatement("select * from sort");
		ResultSet rs = pst.executeQuery();
		
		List<Sort> list = new ArrayList<Sort>();
		
		while (rs.next()) {
			Sort s = new Sort(rs.getInt("sid"), rs.getString("sname"), rs.getDouble("sprice"), rs.getString("sdesc"));
			
			list.add(s);
			
		}
		
		for (Sort s : list) {
			System.out.println(s);
		}
		
		JDBCUtils.close(con, pst, rs);
		
	}

}
