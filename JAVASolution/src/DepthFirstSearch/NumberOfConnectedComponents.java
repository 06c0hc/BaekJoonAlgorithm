package DepthFirstSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class NumberOfConnectedComponents{
	
	static ArrayList<Integer>[] A;//그래프 인접 리스트
	static boolean visited[];//방문 확인 배열

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		A = new ArrayList[n + 1];
		visited = new boolean[n + 1];
		//인접 리스트 초기화
		for(int i = 1; i < n + 1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			//양방향 에지이므로 양쪽에 에지를 더하기
			A[s].add(e);
			A[e].add(s);
		}
		int count = 0;
		//방문 확인 배열을 체크하는 총 횟수 : O(V+E)
		for(int i = 1; i< n + 1; i++) {//방문하지 않은 노드가 없을 때까지 반복
			if(!visited[i]) {//아직 방문하지 않은 노드를 처리(방문 확인 배열을 체크 1)
				count++;
				DFS(i);//push
			}
		}
		System.out.println(count);
	}
	
	static void DFS(int v) {
		if(visited[v]) {//이미 방문으면 리턴(방문 확인 배열을 체크 2)
			return;//pop
		}
		visited[v] = true;//방문 처리, O(V)
		for(int i : A[v]) {//인접 노드 확인, O(E)
			if(visited[i] == false) {//인접 노드 중 방문하지 않았던 노드만 탐색하기(방문 확인 배열을 체크 3)
				DFS(i);//push
			}
		}
	}
}
