package StringMethods;

public class CompareTo {
//	String str1="Kshitij";
//	String str2="kshitij";
	
	public static void main(String[] args) {
			CompareTo c=new CompareTo();
//			System.out.println(c.str1.compareTo(c.str2));
			String s1="Hello friends my name is kshitij, I am here to introduce the importance of life.";
			char[] s2=s1.toCharArray();
			System.out.println(s1.compareTo(s1));
			System.out.println(s1.contains("kshitij"));
	}

}
