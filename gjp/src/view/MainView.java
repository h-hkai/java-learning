package view;

import java.util.List;
import java.util.Scanner;

import controller.ZhangWuController;
import domain.ZhangWu;

public class MainView {
	private ZhangWuController controller = new ZhangWuController();
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----------Guanjianpo family account record App----------");
			System.out.println("1. add account  2. edit account  3. delete account  4. query account  5. exit");
			System.out.println("Please input the number of [1-5]:");
			int opt = sc.nextInt();
			switch (opt) {
			case 1:
				addAccount();
				break;
			case 2:
				editAccount();
				break;
			case 3:
				deleteAccount();
				break;
			case 4:
				queryAccount();
				break;
			case 5:
				System.exit(0);
				break;

			default:
				break;
			}
			
//			sc.close();
		}
	}
	
	private void addAccount() {
		System.out.println("Select add aaccount, please input below content:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the name of flname:");
		String flname = sc.nextLine();
		System.out.println("Please input the count of money:");
		double money = sc.nextDouble();
		sc.nextLine();
		System.out.println("Please input the name of method:");
		String method = sc.nextLine();
		System.out.println("Please input the createtime(yyyy-mm-dd):");
		String createtime = sc.nextLine();
		System.out.println("Please input the description:");
		String description = sc.nextLine();
		
		ZhangWu zw = new ZhangWu(0, flname, money, method, createtime, description);
		controller.addAccount(zw);
		
		System.out.println("Congritulations! add account successfully.");
		
	}

	private void editAccount() {
		queryAll();
		System.out.println("Please select which account you want to edit:");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input ID:");
		int zwid = sc.nextInt();
		sc.nextLine();
		System.out.println("Please input the name of flname:");
		String flname = sc.nextLine();
		System.out.println("Please input the count of money:");
		double money = sc.nextDouble();
		sc.nextLine();
		System.out.println("Please input the name of method:");
		String method = sc.nextLine();
		System.out.println("Please input the createtime(yyyy-mm-dd):");
		String createtime = sc.nextLine();
		System.out.println("Please input the description:");
		String description = sc.nextLine();
		
		ZhangWu zw = new ZhangWu(zwid, flname, money, method, createtime, description);
		
		controller.editAccount(zw);
		System.out.println("Edit account successfully.");
	
	}

	private void deleteAccount() {
		queryAll();
		System.out.println("Please select which account you want to delete:");
		int zwid = new Scanner(System.in).nextInt();
		controller.deleteAccout(zwid);
		System.out.println("delete account successfully.");
	}

	private void queryAccount() {
		selectAccount();
	}

	public void selectAccount() {
		System.out.println("1. query all  2. query part:");
		Scanner sc = new Scanner(System.in);
		int selectOpt = sc.nextInt();
		switch (selectOpt) {
		case 1:
			queryAll();
			break;
			
		case 2:
			queryPart();
			break;

		default:
			break;
		}
//		sc.close();
	}
	
	private void queryAll() {
		List<ZhangWu> list = controller.queryAll();
		print(list);
	}

	private void print(List<ZhangWu> list) {
		System.out.println("ID\t\t flname\t\t method\t\t money\t\t time\t\t desc");
		for (ZhangWu zw : list) {
			System.out.println(zw.getZwid() + "  \t\t" + zw.getFlname() + "  \t\t" + zw.getMethod() + "\t\t" + 
							   zw.getMoney() + "\t\t" + zw.getCreatetime() + "\t\t" + zw.getDescription());
			
		}
	}
	
	private void queryPart() {
		System.out.println("Query part, the format of time is XXXX-XX-XX");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the strat date:");
		String startDate = sc.nextLine();
		System.out.println("Please input the end date:");
		String endDate = sc.nextLine();
		
		List<ZhangWu> list = controller.queryPart(startDate, endDate);
		
		if (list.size() != 0)
			print(list);
		else 
			System.out.println("There isn't date which you want, please try again!");
		
//		sc.close();
	}
}
