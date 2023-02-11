package samplePrograms;

public class StudentforEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] studentList = { "Rohith", "Thiyagu", "Nithi", "Vinoth", "Ravi" };
		int[] ageList = { 26, 26, 24, 25, 23 };
		
		for ( String Name : studentList )
		{
			
			System.out.println(Name + "=" + Name.length());
		}
		for (int age : ageList )
		{
			System.out.println(age);
		}

	}

}
