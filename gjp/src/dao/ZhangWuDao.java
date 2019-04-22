package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.ZhangWu;
import tools.JDBCUtils;

public class ZhangWuDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	
	public void addAccount(ZhangWu zw) {
		String sql = "insert into gjp_zhangwu (flname, money, method, createtime, description) values (?, ?, ?, ?, ?)";
		Object[] params = {zw.getFlname(), zw.getMoney(), zw.getMethod(), zw.getCreatetime(), zw.getDescription()};
		try {
			qr.update(sql, params);
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("update fail!");
		}
		
	}
	
	public List<ZhangWu> queryPart(String startDate, String endDate) {
		try {
			String sql = "select * from gjp_zhangwu where createtime between ? and ?";
			Object[] params = {startDate, endDate};
			return qr.query(sql, new BeanListHandler<>(ZhangWu.class), params);
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("query part error!");
		}
	}
	
	public List<ZhangWu> queryAll() {
		try {
			String sql = "select * from gjp_zhangwu";
			List<ZhangWu> list = qr.query(sql, new BeanListHandler<>(ZhangWu.class));
			return list;
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("query all fail!");
		}
		
	}

	public void editAccount(ZhangWu zw) {
		String sql = "update gjp_zhangwu set flname=?, money=?, method=?, createtime=?, description=? where zwid=?";
		Object[] params = {zw.getFlname(), zw.getMoney(), zw.getMethod(), zw.getCreatetime(), zw.getDescription(), zw.getZwid()};
		
		try {
			qr.update(sql, params);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
			throw new RuntimeException("Edit account failed!");
		}
		
	}

	public void deleteAccount(int zwid) {
		// TODO Auto-generated method stub
		String sql = "delete from gjp_zhangwu where zwid=?";
		try {
			qr.update(sql, zwid);
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("delete account failed.");
		}
		
	}
}
