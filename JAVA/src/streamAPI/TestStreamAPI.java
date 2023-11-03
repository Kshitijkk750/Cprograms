package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestStreamAPI {

	public static void main(String[] args) {

			List<String> lst= List.of("Ramesh","Suresh","Mahesh","Bhavesh");
			//by using for each..
			for(String s:lst) {
				System.out.println(s);
			}
			
			System.out.println("--------------------");
			
			
			// by using streamAPI....
			lst.stream().forEach(e->System.out.println(e));
			// e->(It is the lambda expression...)
			
			System.out.println("--------------------");
			
			
			// using for each method provided by StreamAPI.
			lst.stream().forEach(System.out::println);
			
			List<Integer> lst1= List.of(10, 11, 12, 9, 14, 5, 16, 7, 18, 19);
			
			System.out.println(lst1);
			
			List<Integer> evenList=lst1.stream().filter(i->i%2==0).collect(Collectors.toList());
			System.out.println(evenList);
			System.out.println("--------------------");

			//List<Integer> lst3=lst1.stream().filter(i->i%2==0).collect(Collectors.toList()).forEach(System.out::println);
			
			//using foreach method..
			lst1.stream().map(i->i+5).forEach(System.out::println);
			System.out.println("--------------------");

			//using Set......
			Set<Integer> st=lst1.stream().map(i->i+5).collect(Collectors.toSet());

			System.out.println(st);
			System.out.println("--------------------");
			
			lst1.stream().sorted().forEach(System.out::println);
			System.out.println("--------------------");
			
			//finding maximum number..
			Integer i=lst1.stream().max((x,y)->x.compareTo(y)).get();
			
			System.out.println(i);
			
			System.out.println("--------------------");
			 // Arrays using stream.
			String arr[]= {"Ramesh","Bhavesh","suresh","Naresh"};
			Arrays.stream(arr).forEach(System.out::println);
			System.out.println("");
			Arrays.stream(arr).filter(e->e.startsWith("R")).forEach(System.out::println);
			

	}

}
