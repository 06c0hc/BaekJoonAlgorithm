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
		for(int i = 1; i <= N; i++) {//카드를 큐에 저장
			myQueue.add(i);
		}
		while(myQueue.size() > 1) {//카드가 1장 남을때까지
			myQueue.poll();//맨 위의 카드 버리기
			myQueue.add(myQueue.poll());//맨 위의 카드 아래로 옮기기
		}
		System.out.println(myQueue.poll());//마지막 남은 카드 출력
	}

}