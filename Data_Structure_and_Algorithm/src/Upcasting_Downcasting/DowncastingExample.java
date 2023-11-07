package Upcasting_Downcasting;

//Parent class  
class Parents {   
  String name;   
  
  // A method which prints the data of the parent class   
  void showMessage()   
  {   
      System.out.println("Parent method is called");   
  }   
}   
  
//Child class   
class Childs extends Parents {   
  int age;   
  
  // Performing overriding  
  @Override  
  void showMessage()   
  {   
      System.out.println("Child method is called");   
  }   
}   
  
public class DowncastingExample{  
  
  public static void main(String[] args)   
  {   
      Parents p = new Childs();  
      p.name = "Shubham";  
        
      // Performing Downcasting Implicitly   
      //Child c = new Parent(); // it gives compile-time error   
        
      // Performing Downcasting Explicitly   
      Childs c = (Childs)p;   
  
      c.age = 18;   
      System.out.println(c.name);   
      System.out.println(c.age);   
      c.showMessage();   
  }   
}  