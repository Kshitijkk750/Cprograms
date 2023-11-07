package collections_Sets;

import java.util.Set;
import java.util.TreeSet;

public class Demo_TreeSet {
	public static void main(String[] args) {

		Set<Integer> s=  new TreeSet<>();
		s.add(10);
		s.add(20);
		s.add(70);
		s.add(50);
		s.add(30);
		System.out.println(s);
		System.out.println("\n");
		for(Integer i: s)
		{
			System.out.println(i);
		}
	}
}
