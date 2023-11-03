package PackageDemo.pack2;
public class SecondDemo extends PackageDemo.pack1.FirstDemo {
    int y=100;
   
   public void show1(){
       System.out.println("From Pak2 "+(y+x));
   }
}