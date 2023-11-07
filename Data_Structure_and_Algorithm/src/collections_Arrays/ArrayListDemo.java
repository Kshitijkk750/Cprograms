package collections_Arrays;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List lst= new ArrayList();
			lst.add('D');
			lst.add('A');
			lst.add('B');
			lst.add('C');
			lst.add('D');
			System.out.println(lst);
			System.out.println("-----------------");

			lst.add(3, 'K');
			System.out.println(lst);
			System.out.println("-----------------");

			lst.remove(0);
			System.out.println(lst);
			System.out.println("-----------------");

			List lst1= new ArrayList();
			lst1.add(1);
			lst1.add(2);
			lst1.add(4);
			System.out.println(lst1);
			System.out.println("-----------------");


			lst.addAll(lst1);
			System.out.println(lst);
			System.out.println("-----------------");
			
			System.out.println(lst.contains('B'));
			System.out.println("-----------------");
			System.out.println(lst.get(5));
			
			System.out.println("-----------------");

			List lst2= new ArrayList();
			lst2.add(23);
			lst2.add(12.24);
			lst2.add("Kshitij");
			lst2.add(new Date());
			System.out.println(lst2);
			System.out.println("\n as premitive data cannot pass in arraylist ,\n but because of AutoBoxing \n we can do this.");
			System.out.println("-----------------");
			
			// For object.....
			for(Object o:lst) {
				System.out.println(o);

			}
			System.out.println("-----------------");
			
			// Using Iterator.........
			
			Iterator it=lst.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("-----------------");

	}

}
