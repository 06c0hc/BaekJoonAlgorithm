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
		
		//새 노드 추가 시 두번째 노드부터는 덱 뒤에서부터 비교
		for(int i = 0; i < N; i++) {
			int now = Integer.parseInt(st.nextToken());
			
			//새 노드보다 큰 값을 갖는 노드를 찾으면 그 노드를 제거하고 새 노드를 저장(= 정렬효과)
			while(!mydeque.isEmpty() && mydeque.getLast().value > now) {
				mydeque.removeLast();
			}
			mydeque.addLast(new Node(now, i));
			
			//인덱스 범위가 슬라이딩 윈도우 범위를 벗어났는지 검사(앞에서부터 비교)
			if(mydeque.getFirst().index <= i -L) {
				mydeque.removeFirst();//앞의 요소를 제거
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
