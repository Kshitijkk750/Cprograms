package Lab7;
/*
 * 2.Write a Java program to create an abstract class Person with abstract methods
eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the
Person class and implement the respective methods to describe how each
person eats and exercises.
 */

abstract class Person{
	abstract void eat();
	abstract void exercise();
}
class Athlete extends Person{
	@Override
	void eat() {
		System.out.println("Athlete have a proper diet plan");
	}
	@Override
	void exercise() {
		System.out.println("Athlete do daily exercise..  ");
	}
	
}
class LazyPerson extends Person{
	@Override
	void eat() {
		System.out.println("Lazyperson can eat at any time.");
	}
	@Override
	void exercise() {
		System.out.println("Lazyperson never do exercise..");
	}
	
}
public class Que2 {

	public static void main(String[] args) {
			Person p;
			System.out.println("Athlete:-");
			p= new Athlete();
			p.eat();
			p.exercise();
			System.out.println("Lazyperson:-");
			p= new LazyPerson();
			p.eat();
			p.exercise();
	}

}
