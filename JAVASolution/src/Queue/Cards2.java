package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cards2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<Integer> myQueue = new LinkedList<>();
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {//ī�带 ť�� ����
			myQueue.add(i);
		}
		while(myQueue.size() > 1) {//ī�尡 1�� ����������
			myQueue.poll();//�� ���� ī�� ������
			myQueue.add(myQueue.poll());//�� ���� ī�� �Ʒ��� �ű��
		}
		System.out.println(myQueue.poll());//������ ���� ī�� ���
	}

}