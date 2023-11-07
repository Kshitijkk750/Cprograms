package collections_Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo_hash_set02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst=  Arrays.asList(10,20,30,30,50,47);
		
		Set<Integer> st = new HashSet<Integer>();
		st.addAll(lst);
		System.out.println(lst);
		System.out.println(st);
		lst= new ArrayList<Integer>();
		lst.addAll(st);
		System.out.println(st);
		
	}

}
