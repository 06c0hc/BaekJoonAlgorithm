package BruteForce;

import java.util.Scanner;

public class Blackjack {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String[] firstLine = input.nextLine().split("\\s");
		int N = Integer.parseInt(firstLine[0]);//ī�� �� ��
		int M = Integer.parseInt(firstLine[1]);//��ģ ����
		int max = 0;// ī�� 3������ ���յ� �ִ�
		
		//ī�� ����Ʈ �ʱ�ȭ
		String[] secondLine = input.nextLine().split("\\s");
		int[] cards = new int[N];
		
		for(int i=0; i< cards.length; i++) {
			cards[i] = Integer.parseInt(secondLine[i]);
		}
		
		
		for(int i = 0; i < cards.length; i++) {//ù��° ī�� ����
			for(int j = 0; j < cards.length; j++) {//�ι�° ī�� ����
				if(i==j) {//�ߺ� ���� ����
					continue;
				}
				for(int k = 0; k < cards.length; k++) {//����° ī�� ����
					if(i==k||j==k) {//�ߺ� ���� ����
						continue;
					}
					//���� ������ ���� M�����̰� ������ ���յ� �ִ� �̻��̸�
					if(cards[i]+cards[j]+cards[k] <= M && max <= cards[i]+cards[j]+cards[k]) {
						max = cards[i]+cards[j]+cards[k];//���ο� ���հ��� �ִ����� ����
					}
				}
			}	
		}
		System.out.println(max);
		input.close();
	}

}
