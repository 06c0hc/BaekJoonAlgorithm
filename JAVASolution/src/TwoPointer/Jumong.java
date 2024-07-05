package TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class Jumong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int N = Integer.parseInt(input.nextLine());//��� ��
		int M = Integer.parseInt(input.nextLine());//���� �հ�
		
		int count = 0;//������
		
		//�� ������
		int start_idx = 0;
		int end_idx = N-1;
		
		
		//��� �Է� �� �ʱ�ȭ
		String[] materials = input.nextLine().split("\\s");
		int[] materialList = new int[N];
		
		for(int i = 0; i < materialList.length; i++) {
			materialList[i] = Integer.parseInt(materials[i]);
		}
		
		Arrays.sort(materialList);//����
		
		//�� ����� ���� ���� �հ�� ������ ������ ���ϱ� 
		while(start_idx < end_idx) {
			if(materialList[start_idx]+materialList[end_idx] < M) {
				start_idx++;
			}else if(materialList[start_idx]+materialList[end_idx] > M) {
				end_idx--;
			}else if(materialList[start_idx]+materialList[end_idx] == M) {
				count++;
				start_idx++;
				end_idx--;
			}
		}
		System.out.println(count);
	}

}