package collections_Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q= new PriorityQueue<>();
		q.add("A");
		q.add("E");
		q.add("F");
		q.add("B");
		q.add("C");
		q.add("G");
		q.add("D");
		q.add("H");
		System.out.println(q);
		
		String s=q.poll();
		System.out.println(q);
		
	}

}
