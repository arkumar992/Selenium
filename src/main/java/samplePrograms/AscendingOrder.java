package samplePrograms;
import java.util.Scanner;
public class AscendingOrder {
	
public static void main(String[] args) 
	    {
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	int n, temp;
    System.out.print("Enter no. of elements you want in array:");
    n = s.nextInt();
    int a[] = new int[n];
    System.out.println("Enter all the elements:");
    for (int i = 0; i < n; i++) 
    {
        a[i] = s.nextInt();
    }
    for (int i = 0; i < n; i++) 
    {
        for (int j = i + 1; j < n; j++) 
        {
            if (a[i] < a[j]) 
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    System.out.print("Descending Order:");
    for (int i = 0; i < n - 1; i++) 
    {
        System.out.print(a[i] + ",");
    }
    System.out.print(a[n - 1]);
}
}

/*package codingChallange;

import java.util.Arrays;


public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
		int number[] = {13,25,9,56,54,89,17};
		
		Arrays.sort(number);
		
		System.out.println("The Ascending Order is :" + Arrays.toString(number));

	}

}*/