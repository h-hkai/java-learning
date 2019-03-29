
package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; ++i) array2.add(i);
		
		array2.add(7, 33);
		array2.add(11, 20);
		
		array2.remove(0);
		
		array2.clear();
		
		int size = array2.size();
		System.out.println(size);
		
		for (int i = 0; i < array2.size(); ++i) System.out.print(array2.get(i));
		
//		ArrayList<Phone> p = new ArrayList<Phone>();
		
		return ;
	}
}
