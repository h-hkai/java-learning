package service;

import java.util.List;

import dao.ZhangWuDao;
import domain.ZhangWu;

public class ZhangWuService {
	private ZhangWuDao dao = new ZhangWuDao();
	
	public void editAccount(ZhangWu zw) {
		dao.editAccount(zw);
	}
	
	public void addAccount(ZhangWu zw) {
		dao.addAccount(zw);
	}
	
	public List<ZhangWu> queryPart(String startDate, String endDate) {
		return dao.queryPart(startDate, endDate);
	}
	
	public List<ZhangWu> queryAll() {
		return dao.queryAll();
	}

	public void deleteAccount(int zwid) {
		// TODO Auto-generated method stub
		dao.deleteAccount(zwid);
	}
}
