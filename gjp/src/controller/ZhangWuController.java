package controller;

import java.util.List;

import domain.ZhangWu;
import service.ZhangWuService;

public class ZhangWuController {
	private ZhangWuService service = new ZhangWuService();
	
	public void editAccount(ZhangWu zw) {
		service.editAccount(zw);
	}
	
	public void addAccount(ZhangWu zw) {
		service.addAccount(zw);
	}
	
	public List<ZhangWu> queryPart(String startDate, String endDate) {
		return service.queryPart(startDate, endDate);

	}
	
	public List<ZhangWu> queryAll() {
		return service.queryAll();
	}

	public void deleteAccout(int zwid) {
		service.deleteAccount(zwid);
		
	}
}
