package Recursion;

import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long N = Long.parseLong(input.nextLine());
		System.out.println(factorial(N));
		
	}
	
	
	//N! = N x (N-1)!
	public static long factorial(long N) {
		if(N == 1 || N == 0) {//1! or 0! = 1
			return 1;
		}
		return N * factorial(N -1);
	}

}
