package collections_Sets;

import java.util.HashSet;
import java.util.Set;

public class Demo_Hash_set {

	public static void main(String[] args) {

		Set<Integer> s=  new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(50);
		s.add(30);
		System.out.println(s);
		
		for(Integer i: s)
		{
			System.out.println(i);
		}
	}

}
