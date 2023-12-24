package Greedy;

import java.util.Scanner;

public class SugarDelivery {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		
		int minBag = 0;
		
		
		while(0<N) {
			if(N%3==0 && N%5==0) {// 3�� 5�� ������� ��� 5�� ������(ex 15
				minBag += N/5;
				N %= 5;
			}else if(N%5==0) {//5�� ����� ��� 5�� ������
				minBag += N/5;
				N %= 5;
			}else if(N%3==0) {//3�� ����� ��� 3�� ����
				N -= 3;
			}else {//�� ���� ��� 5�� ����(ex 1, 2, 4, 7, 8, 11, ...
				if(N<5) {//�̶� N < 5�̸�, �� 1,2,4 �϶� ��� �Ұ��̹Ƿ� -1
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
