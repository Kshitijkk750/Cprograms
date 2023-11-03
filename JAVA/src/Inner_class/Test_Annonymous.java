package Inner_class;
	class ParentOfAnnonymous{
	void greeting() {
		System.out.println("Say hello");
	}
	}
	class OuterofAnnonymous{
		ParentOfAnnonymous p= new ParentOfAnnonymous () {
			@Override
			void greeting() {
			System.out.println("Namaste ji..!!!");	
			}
		};
	}
public class Test_Annonymous {
	public static void main(String [] arg) {
		OuterofAnnonymous o= new OuterofAnnonymous();
		o.p.greeting();
		
	}
}
