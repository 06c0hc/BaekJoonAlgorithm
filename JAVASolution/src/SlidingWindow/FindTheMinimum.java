package SlidingWindow;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class FindTheMinimum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		Deque<Node> mydeque = new LinkedList<>();
		
		//�� ��� �߰� �� �ι�° �����ʹ� �� �ڿ������� ��
		for(int i = 0; i < N; i++) {
			int now = Integer.parseInt(st.nextToken());
			
			//�� ��庸�� ū ���� ���� ��带 ã���� �� ��带 �����ϰ� �� ��带 ����(= ����ȿ��)
			while(!mydeque.isEmpty() && mydeque.getLast().value > now) {
				mydeque.removeLast();
			}
			mydeque.addLast(new Node(now, i));
			
			//�ε��� ������ �����̵� ������ ������ ������� �˻�(�տ������� ��)
			if(mydeque.getFirst().index <= i -L) {
				mydeque.removeFirst();//���� ��Ҹ� ����
			}
			bw.write(mydeque.getFirst().value + " ");
		}
		bw.flush();
		bw.close();
	}
	
	static class Node{
		public int value;
		public int index;
		
		Node(int value, int index){
			this.value = value;
			this.index = index;
		}
	}

}
