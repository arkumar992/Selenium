package samplePrograms;
import java.util.Scanner;

public class DescendingOrder {
	
public static void main(String[] args) 
	    {
	        int number, X;
	        @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        number = scan.nextInt();
	        int a[] = new int[number];
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < number; i++) 
	        {
	            a[i] = scan.nextInt();
	        }
	        for (int i = 0; i < number; i++) 
	        {
	            for (int j = i + 1; j < number; j++) 
	            {
	                if (a[i] > a[j]) 
	                {
	                    X = a[i];
	                    a[i] = a[j];
	                    a[j] = X;
	                }
	            }
	        }
	        System.out.print("Ascending Order:");
	        for (int i = 0; i < number - 1; i++) 
	        {
	            System.out.print(a[i] + ",");
	        }
	        System.out.print(a[number - 1]);
	    }
	
	}


/*package codingChallange;

import java.util.Arrays;
import java.util.Collections;


public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
		Integer[] number = {13,25,9,56,54,89,17};
		
		Arrays.sort(number, Collections.reverseOrder());
		
		System.out.println("The Ascending Order is :" + Arrays.toString(number));

	}

}
*/
