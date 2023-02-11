package samplePrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the nubmer");
		@SuppressWarnings("resource")
		Scanner Scan = new Scanner(System.in);
		int number = Scan.nextInt();
		long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}