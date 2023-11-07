package maps_;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo_maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Map<Integer, String> mp= new HashMap<Integer, String>();
			
			mp.put(101, "Ramesh");
			mp.put(102, "Bhvesh");
			mp.put(105, "Suresh");
			mp.put(104, "Mahesh");
			mp.put(103, "Dinesh");
			
			System.out.println("*****HashMap***** ");
			for(Integer i: mp.keySet()) {
			String st = mp.get(i);
			
				System.out.println("Key :"+i +" Name :" + st);
			}
			Map<Integer, String> mps = new LinkedHashMap<Integer, String>();
			mps.put(101, "Ramesh");
			mps.put(102, "Bhvesh");
			mps.put(105, "Suresh");
			mps.put(104, "Mahesh");
			mps.put(103, "Dinesh");
			
			System.out.println("***********************\n");
			System.out.println("*****LinkedHashMap***** ");

			for(Integer i: mps.keySet()) {
			String st = mps.get(i);
			
				System.out.println("Key :"+i +" Name :" + st);
			}
			
			Map<Integer, String> m= new TreeMap<Integer, String>();
			m.put(101, "Ramesh");
			m.put(102, "Bhvesh");
			m.put(105, "Suresh");
			m.put(104, "Mahesh");
			m.put(103, "Dinesh");
			
			System.out.println("***********************\n");
			System.out.println("*****TreeSet***** ");

			for(Integer i: mps.keySet()) {
			String st = m.get(i);
			
				System.out.println("Key :"+i +" Name :" + st);
			}
			

	}

}
