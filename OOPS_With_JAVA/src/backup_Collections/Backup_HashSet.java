package backup_Collections;

import java.util.HashSet;
import java.util.Set;

public class Backup_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> originalset=  new HashSet<>();
		originalset.add(10);
		originalset.add(20);
		originalset.add(30);
		originalset.add(50);
		originalset.add(30);
		System.out.println(originalset);
		
		for(Integer i: originalset)
		{
			System.out.println(i);
		}
		
		Set<Integer> backupSet= new HashSet<>(originalset);
		System.out.println(originalset);
		System.out.println(backupSet);
		backupSet.add(80);
		System.out.println("After adding in BackupSet");
		System.out.println(originalset);
		System.out.println(backupSet);
	}

}
