package samplePrograms;

import java.util.Scanner;

public class Studentdataarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//List of students Details
		String[] studentList = { "Rohith", "Thiyagu", "Nithi", "Vinoth", "Ravi" };
		int[] ageList = { 26, 26, 24, 25, 23 };
		char[][] grade = { { 'A', 'B', 'C', 'D', 'E' }, { 'A', 'A', 'C', 'A', 'E' }, { 'A', 'A', 'A', 'A', 'A' },
				{ 'A', 'A', 'C', 'A', 'E' }, { 'A', 'A', 'C', 'A', 'E' } };

		@SuppressWarnings("resource")
		//Creating Objects
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the index of the Student ");
		//Calling the Objects
		int Index = scan.nextInt();
		//Index = Index -1 ;
		System.out.println(studentList[Index] + " Whose is " + ageList[Index] + " years old scored " + grade[Index][0]
				+ "," + grade[Index][1] + "," + grade[Index][2] + "," + grade[Index][3] + "," + grade[Index][4]);

	}

}
