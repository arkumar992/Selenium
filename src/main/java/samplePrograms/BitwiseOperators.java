package samplePrograms;

public class BitwiseOperators {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOne = 123;
		int numberTwo = 122;
		
		System.out.println("numberOne & numberTwo =" + (numberOne & numberTwo));
		System.out.println("numberOne | numberTwo =" + (numberOne | numberTwo));
		System.out.println("numberOne ^ numberTwo =" + (numberOne ^ numberTwo));
		System.out.println("~ numberOne  =" + (~numberOne ));
		System.out.println("~ numberOne  =" + (numberOne << 3));
		System.out.println("~ numberOne  =" + (numberOne >> 4));
		System.out.println("~ numberOne  =" + (numberOne >>> 1 ));
		
}
}

