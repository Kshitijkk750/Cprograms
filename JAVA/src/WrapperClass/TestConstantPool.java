package WrapperClass;

public class TestConstantPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For Integer Family -128 to 127
	// Int,Shor,Lont,Byte for Constant Pool Range..-128 to 127	
		byte b1= Byte.valueOf("-128" );
		byte b2=Byte.valueOf("-128");
		System.out.println(b1==b2);
		
		Short b3=Short.valueOf("128");
		Short b4=Short.valueOf("128");
		System.out.println(b3==b4);
	// Boolean for Constant Pool range..	true/false
		Boolean b5= Boolean.valueOf("true");
		Boolean b6= Boolean.valueOf("true");
		System.out.println(b5==b6);
	// Float and Double have no memory in Constant Pool
		Float b7= Float.valueOf("12.23");
		Float b8= Float.valueOf("12.23");
		System.out.println(b7==b8);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
	// 	Character for Constant Pool Range..U0000 to U007f
		Character b9= Character.valueOf('\u0950');
		Character b10= Character.valueOf('\u0906');
		System.out.println(b9);
		System.out.print("\u0906\u0908" );
		System.out.println(" \u231A \u1f32e");
	}

}
