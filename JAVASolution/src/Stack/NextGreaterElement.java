package Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] A = new int[n];//���� �迭 ����
		int[]ans = new int[n];//���� �迭 ����
		String[] str = bf.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(str[i]);
		}
		
		Stack<Integer> myStack = new Stack<>();
		myStack.push(0);//ó������ �׻� ������ ��������Ƿ� ���� ���� push�ؼ� �ʱ�ȭ
		
		for(int i =1; i < n; i++) {
			//������ ��� ���� �ʰ� ���� ������ ���� top �ε����� ����Ű�� �������� Ŭ ���
			while(!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
				ans[myStack.pop()] = A[i]; //���� �迭�� ���� ������ ��ū���� ����
			}
			myStack.push(i);//�� ������ push
		}
		
		//�ݺ����� �� ���� ���Դµ� ������ ������� �ʴٸ� �� ������
		while(!myStack.empty()) {
			ans[myStack.pop()] = -1;//���ÿ� ���� index�� ���� �� ���� �迭���� �ε����� �ش��ϴ� ��ū���� -1�� ����
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < n; i++) {
			bw.write(ans[i] + " ");//���� �迭�� ���
		}
		bw.write("\n");
		bw.flush();
	}

}