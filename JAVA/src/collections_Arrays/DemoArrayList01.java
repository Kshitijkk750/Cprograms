package collections_Arrays;
//******************Collections class uses .....
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoArrayList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(12);
		lst.add(22);
		lst.add(43);
		lst.add(23);
		lst.add(26);
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println("\nAfter sorting array :-\n");
		System.out.println(lst);
		int position = Collections.binarySearch(lst, 23);
		System.out.println("Position is :" + position);
		// Easy way to generate list...
		System.err.println("Easy way to generate array list :");
		List <Integer> lst1 = Arrays.asList(100,200,300);
		System.out.println(lst1);
		//Comparing two arrays for duplicate element or value
		boolean b= Collections.disjoint(lst, lst1);
		System.out.println("Comparing 2 list for duplicate value :");
		System.out.println("\nif duplicate returns false else true\n:-"+b);

//		for(Integer i : lst) {
//			System.out.println(i);
//
//		}
	}

}
