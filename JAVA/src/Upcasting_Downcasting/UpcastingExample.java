package Upcasting_Downcasting;

class  Parent{  
	   void PrintData() {  
	      System.out.println("method of parent class");  
	   }  
	}  
	  
	class Child extends Parent {  
	   void PrintData() {  
	      System.out.println("method of child class");  
	   }  
	}  
	class UpcastingExample{  
	   public static void main(String args[]) {  
	        
	      Parent obj1 = (Parent) new Child();  
	      Parent obj2 = (Parent) new Child(); 
	      Parent obj3 = (Parent) new Child();
	      obj3.PrintData();
	      obj1.PrintData();  
	      obj2.PrintData();  
	   }  
	}  