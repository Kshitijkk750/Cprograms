package collections_Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo_LInked_has_set {
	public static void main(String[] args) {

		Set<Integer> s=  new LinkedHashSet<>();
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
