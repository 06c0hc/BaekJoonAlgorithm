package Greedy;

import java.util.Scanner;

public class SugarDelivery {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		
		int minBag = 0;
		
		
		while(0<N) {
			if(N%3==0 && N%5==0) {// 3과 5의 공배수인 경우 5로 나누기(ex 15
				minBag += N/5;
				N %= 5;
			}else if(N%5==0) {//5의 배수인 경우 5로 나누기
				minBag += N/5;
				N %= 5;
			}else if(N%3==0) {//3의 배수인 경우 3을 빼기
				N -= 3;
			}else {//그 외의 경우 5를 빼기(ex 1, 2, 4, 7, 8, 11, ...
				if(N<5) {//이때 N < 5이면, 즉 1,2,4 일땐 배달 불가이므로 -1
					minBag = -1;
					break;
				}
				N-=5;
				minBag += 1;
			}
		}
		System.out.println(minBag);
		input.close();
	}

}
