package Inner_class;
	 class Outer{
		int x=10;
		static class InnerStatic{
			int y=20;
			void show() {
				Outer ob=new Outer();
				System.out.println("I ma from Static inner class..."+(y+ob.x));
				
				
			}
		}
	}
public class Test_StaticInner {
		public static void main(String arg[]) {
			//creating object of inner class using outer class.
			Outer.InnerStatic obj= new Outer.InnerStatic();
			obj.show();
		}
}
