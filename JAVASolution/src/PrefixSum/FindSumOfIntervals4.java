package PrefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindSumOfIntervals4 {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			String[] Lines = br.readLine().split("\\s");
			int N = Integer.parseInt(Lines[0]);
			int M = Integer.parseInt(Lines[1]);
			
			int sum = 0;//�հ�
			
			int[] sumList = new int[N+1];//�� �迭
			
			//�� �迭 �ʱ�ȭ
			Lines = br.readLine().split("\\s");
			sumList[0] = sum;//�ʱ� �հ谪 0�� �� �迭�� ù ��° ��ҷ� �ʱ�ȭ
			for(int idx = 1; idx < sumList.length; idx++) {
				sum+= Integer.parseInt(Lines[idx-1]);
				sumList[idx] = sum;
			}
			
			//���� �� M�� ���ϱ�
			for(int count = 0; count < M; count++) {
				Lines = br.readLine().split("\\s");
				int i = Integer.parseInt(Lines[0]);
				int j = Integer.parseInt(Lines[1]);
				System.out.println(sumList[j]-sumList[i-1]);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}