package Abstraction;
abstract class LivingThing{
	void eyes() {
		System.out.println("Two eyes..");
	}
	void mouth() {
		System.out.println("One Mouth..");
	}
	abstract void legs();
}
class Human extends LivingThing{
	@Override
	void legs() {
		System.out.println("Two legs..");
	}
}
class Animal extends LivingThing{
	@Override
	void legs() {
		System.out.println("Four legs..");
	}
	}


public class TestAbstraction {
	public static void main( String arg []) {
		LivingThing lt;
		System.out.println("Property of Human :");
		lt= new Human();
		lt.eyes();
		lt.mouth();
		lt.legs();
		System.out.println("-=-=-=-=-=-=-=--=-=-=-=-=-=-=-");
		System.out.println("Property of Animal :");
		lt= new Animal();
		lt.eyes();
		lt.mouth();
		lt.legs();
		
		
		
	}

}
