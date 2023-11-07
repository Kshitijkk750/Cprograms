package backup_Collections;

import java.util.ArrayList;
import java.util.List;

public class Demo_Backup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> originallst= new ArrayList<Integer>();
		originallst.add(100);
		originallst.add(200);
		originallst.add(300);
		System.out.println("Original List.....\n");

		for(Integer i: originallst) {
			System.out.println(i);
		}
		System.out.println("------------------\n");

		
		List<Integer> backuplst= originallst.subList(0,originallst.size());
		System.out.println("Original List.....");

		System.out.println(originallst);
		System.out.println("Backup List.....\n");

		System.out.println(backuplst);
		System.out.println("------------------\n");
		
		backuplst.add(500);
		System.out.println("After adding 500 into Backup list");
		System.out.println("Original List.....");

		System.out.println(originallst);
		System.out.println("\nOriginal List.....");

		System.out.println(backuplst);
		
	}

}
