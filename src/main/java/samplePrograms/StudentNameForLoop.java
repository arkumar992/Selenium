package samplePrograms;

public class StudentNameForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] studentList = { "Rohith", "Thiyagu", "Nithi", "Vinoth", "Ravi" };
		int[] ageList = { 26, 26, 24, 25, 23 };
		char[][] grade = { { 'A', 'B', 'C', 'D', 'E' }, { 'A', 'A', 'C', 'A', 'E' }, { 'A', 'A', 'A', 'A', 'A' },
				{ 'A', 'A', 'C', 'A', 'E' }, { 'A', 'A', 'C', 'A', 'E' } };
		
		for (int i = 0; i<=4; i ++)

		{
			System.out.println(studentList[i] + "  " + ageList[i] +"  " + grade[i][0] + "," +"  " + grade[i][1]  + "," +"  " + grade[i][2]  + "," + "  " + grade[i][3] 
					 + "," +"  " + grade[i][4]);
		}
		
	}

}
