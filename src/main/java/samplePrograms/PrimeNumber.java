package samplePrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Nubmer");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int Prime = 2;


		for(int i = 0; i <= N; i++)
		{
			int Num = 0;

			for(int j = 1; j <= Prime; j++)
				if(Prime%j == 0)
					Num++;

			if(Num == 2)
				System.out.print(Prime + " ");

			Prime++;
		}
	}
}

