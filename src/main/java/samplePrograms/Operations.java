package samplePrograms;

import java.util.Scanner;

public class Operations {

		  public static void main(String[] args) {
			   @SuppressWarnings("resource")
			Scanner Scan = new Scanner(System.in);
			   System.out.println("Enter Two Numbers");
			   //two variables to hold numbers
			   double Number1, Number2, Number3;
			   Number1 = Scan.nextDouble();
			   Number2 = Scan.nextDouble();
			   Number3 = Number1 + Number2;
			   System.out.println("Total = " + Number3);
			  }
			}