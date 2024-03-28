package BruteForce;

import java.util.Scanner;

public class Blackjack {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String[] firstLine = input.nextLine().split("\\s");
		int N = Integer.parseInt(firstLine[0]);//카드 장 수
		int M = Integer.parseInt(firstLine[1]);//외친 숫자
		int max = 0;// 카드 3장으로 조합된 최댓값
		
		//카드 리스트 초기화
		String[] secondLine = input.nextLine().split("\\s");
		int[] cards = new int[N];
		
		for(int i=0; i< cards.length; i++) {
			cards[i] = Integer.parseInt(secondLine[i]);
		}
		
		
		for(int i = 0; i < cards.length; i++) {//첫번째 카드 선택
			for(int j = 0; j < cards.length; j++) {//두번째 카드 선택
				if(i==j) {//중복 선택 방지
					continue;
				}
				for(int k = 0; k < cards.length; k++) {//세번째 카드 선택
					if(i==k||j==k) {//중복 선택 방지
						continue;
					}
					//새로 조합한 값이 M이하이고 이전에 조합된 최댓값 이상이면
					if(cards[i]+cards[j]+cards[k] <= M && max <= cards[i]+cards[j]+cards[k]) {
						max = cards[i]+cards[j]+cards[k];//새로운 조합값을 최댓값으로 설정
					}
				}
			}	
		}
		System.out.println(max);
		input.close();
	}

}
