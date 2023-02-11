package samplePrograms;

public class sumofnumberarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Number = { 4, 6, 8, 9, 10 };
		int sum = 0;
		
		for (int i = 0; i<5;i++)
		{
			sum  = sum + Number[i] ;
						
		}
		System.out.println("The sum of the nubmer is =" + sum);
	}

}
