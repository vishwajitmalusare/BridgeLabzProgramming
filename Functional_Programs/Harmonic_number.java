package Functional_program;

import java.util.Scanner;
public class Harmonic_number {

	private static Scanner sc;

	public static void main(String[] args) {
		

		float number=1f,result=1f;

		System.out.println("Enter number: ");
		sc = new Scanner(System.in);
		number=sc.nextInt();


		if(number>0) {
			for(int i=2;i<=number;i++) {
				result +=(float)1/i;
			}
			System.out.println(result);
		}
		else {
	
			System.out.println("Enter number greater than Zero");
		}
	}
}
