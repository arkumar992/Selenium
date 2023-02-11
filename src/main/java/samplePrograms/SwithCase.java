package samplePrograms;

import java.util.Scanner;

public class SwithCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] TestCase = { "Pass", "Fail", "Block", "Vinoth", "Ravi" };
		@SuppressWarnings("resource")
		Scanner Scan = new Scanner(System.in);
		String Choose = Scan.nextLine();
		
		switch(Choose)
		
		{
		case "Pass":
			System.out.println("This Test Case is Passed");
			break;
		case "Fail":
			System.out.println("This Test Case is Fail");
			break;
		case "Blocked":
			System.out.println("This Test Case is Blocked");
			break;
		
		
		}
		
		

	}

}
