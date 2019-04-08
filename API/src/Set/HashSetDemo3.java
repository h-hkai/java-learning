package Set;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new String("bcd"));
		set.add(new String("bcd"));

		System.out.println(set);
		
		HashSet<Person> set2 = new HashSet<Person>();
		set2.add(new Person("Tom", 18));
		set2.add(new Person("Tom", 18));
		set2.add(new Person("Jerry", 20));
		set2.add(new Person("Mario", 10));
		
		System.out.println(set2);
	}

}
