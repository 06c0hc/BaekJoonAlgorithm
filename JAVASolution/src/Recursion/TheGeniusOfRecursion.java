package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheGeniusOfRecursion {

	public static int count = 0;//recursion�Լ� ȣ�� Ƚ��
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			String[] lines = br.readLine().split("\\s");
			int T = Integer.parseInt(lines[0]);//�׽�Ʈ ���̽� ����
			
			String[] strList = new String[T];//���ڿ� ����Ʈ
			

			for(int i = 0; i < T; i++) {
				strList[i] = br.readLine().toString();
			}
			
			for(int i = 0; i < strList.length; i++) {
				System.out.println(isPalindrome(strList[i])+ " " + count);//�Ӹ���� ���ڿ� Ȯ�� ���, ��� �Լ� ȣ�� Ƚ�� ���
				count = 0;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//�Ӹ���� ���ڿ� �˻�
	public static int isPalindrome(String str) {
		return recursion(str, 0, str.length()-1);
	}
	
	//���� �ε����� �� �ε����� �������� �� �ε����� ����Ű�� �� ���ڸ� ��
	public static int recursion(String str, int start_idx, int end_idx) {
		count++;
		if(start_idx>=end_idx) {//�� �ε����� �����Ǹ� 1�� ��ȯ
			return 1;
		}else if(str.charAt(start_idx) != str.charAt(end_idx)) {//���ڰ� ���� �ٸ� ��� 0�� ��ȯ
			return 0;
		}else {
			return recursion(str, start_idx+1, end_idx-1);//�� �ε����� ������ �ٽ� �˻�
		}
	}
	
	

}