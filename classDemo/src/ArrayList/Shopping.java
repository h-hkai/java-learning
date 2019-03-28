package ArrayList;

import java.util.*;

public class Shopping {
	public static void main(String[] arg0) {
		ArrayList<Goods> array = new ArrayList<Goods>();
		
		while (true) {
			int num = chooseFunction();
			switch(num) {
			case 1: 
				printStore(array);
				break;
			case 2:
				addGoods(array);
				break;
			case 3:
				System.out.println("Good Bey!!");
				return;
				
			default:
				System.out.println("Please try again.5");
				break;
			}
		}
	}
	
	public static void addGoods(ArrayList<Goods> array) {
		Goods g1 = new Goods();
		Goods g2 = new Goods();
		g1.brand = "MacBook";
		g1.size = 13.2;
		g1.price = 67.2;
		g1.count = 3;
		
		g2.brand = "xiaomi";
		g2.size = 19.2;
		g2.price = 27.2;
		g2.count = 30;
		
		array.add(g1);
		array.add(g2);
	}
	
	public static void printStore(ArrayList<Goods> array) {
		int totalCount = 0;
		int totalMoney = 0;
		for (int i = 0; i < array.size(); ++i) {
			Goods g = array.get(i);
			System.out.println(g.brand + " " + g.size + " " + g.price + " " + g.count);
			totalCount += g.count;
			totalMoney += g.price * g.count;
		}
		
		System.out.println(totalCount + " " + totalMoney);
	}
	
	
	public static void update(ArrayList<Goods> array) {
//		System.out.println("array.size() = " + array.size());
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.size(); ++i) {
			Goods g = array.get(i);
			System.out.println("Please input a number of count: ");
			g.count = sc.nextInt();
		}
		sc.close();
	}
	
	public static int chooseFunction() {
		System.out.println("---------The management system of goods---------");
		System.out.println("1. view the list");
		System.out.println("2. modify the number of count");
		System.out.println("3. exit");
		System.out.println("Please input the number of your choose: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	
}

















