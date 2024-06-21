package TwoPointer;

import java.util.Scanner;

public class SumOfNumbers5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] line = input.nextLine().split("\\s");
		int N = Integer.parseInt(line[0]);//
		
		//1~N������ ���� �ʱ�ȭ
		int[] numList = new int[N];
		for(int i = 0; i < N; i++) {
			numList[i] = i + 1;
		}
		
		//�� ������
		int start_idx = 0;
		int end_idx = 0;
		
		int sum = 1;//���ӵ� �ڿ������� ���� �հ�
		int count = 1;//���ӵ� �ڿ����� ���� N�� ������(���ӵ� �ڿ����� N �ϳ��θ� ������ ��츦 �̸� �����)
		
		
		//�� ������ �̵� ��Ģ
		//1. sum > N�̸� ���ӵ� �ڿ����� ������ ������������ ��ĭ ���
		//2. sum < N�̸� ���ӵ� �ڿ����� ������ �������� ��ĭ Ȯ��
		//3. sum == N�̸� �������� 1������Ű�� �������� ��ĭ Ȯ��
		
		//�� ������ �̵� ��Ģ�� Ȱ���ؼ� ���ӵ� �ڿ������� ���� N�� �������� ���ϱ�
		while(end_idx < N-1) {
			if(sum > N) {
				sum = sum - numList[start_idx];
				start_idx++;
			}else if(sum < N) {
				end_idx++;
				sum = sum + numList[end_idx];
			}else if(sum == N) {
				end_idx++;
				sum = sum + numList[end_idx];
				count++;
			}
		}
		System.out.println(count);
	}

}
