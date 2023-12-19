package Greedy;

import java.util.Scanner;

public class SugarDelivery {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		
		int sugar1 = 3;
		int sugar2 = 5;
		
		int minBag = 0;
		
		
		while(0<N) {
			if(N%3==0 && N%5==0) {//1. 3�� 5�� ������� ��� 5�� ����(ex 15
				N -= sugar2;
			}else if(N%5==0) {//2. 5�� ����� ��� 5�� ����
				N -= sugar2;
			}else if(N%3==0) {//3. 3�� ����� ��� 3�� ����
				N -= sugar1;
			}else {//4. �� ���� ��� 5�� ����(ex 1, 2, 4, 7, 8, 11, ...
				N -= sugar2;
				if(N<5) {//�̶� N < 5�̸�, �� 1,2,4 �϶� ��� �Ұ��̹Ƿ� -1
					minBag = -1;
					break;
				}
			}
			minBag += 1;
		}
		System.out.println(minBag);
		input.close();
	}

}
