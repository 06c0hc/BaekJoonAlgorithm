package Recursion;

import java.util.Scanner;

public class FibonacciNumber5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = Integer.parseInt(input.nextLine());//N��°
		
		System.out.println(fibonacci(n));
		
	}
	
	//N��° �Ǻ���ġ ������ ���ϴ� �Լ�
	//fibo(n) = fibo(n-2) + fibo(n-1)
	public static int fibonacci(int n) {
		if(n==0||n==1) {
			return n;
		}
		return fibonacci(n-2)+fibonacci(n-1);
	}
}