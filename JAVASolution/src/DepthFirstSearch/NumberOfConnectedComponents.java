package DepthFirstSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class NumberOfConnectedComponents{
	
	static ArrayList<Integer>[] A;//�׷��� ���� ����Ʈ
	static boolean visited[];//�湮 Ȯ�� �迭

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		A = new ArrayList[n + 1];
		visited = new boolean[n + 1];
		//���� ����Ʈ �ʱ�ȭ
		for(int i = 1; i < n + 1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			//����� �����̹Ƿ� ���ʿ� ������ ���ϱ�
			A[s].add(e);
			A[e].add(s);
		}
		int count = 0;
		//�湮 Ȯ�� �迭�� üũ�ϴ� �� Ƚ�� : O(V+E)
		for(int i = 1; i< n + 1; i++) {//�湮���� ���� ��尡 ���� ������ �ݺ�
			if(!visited[i]) {//���� �湮���� ���� ��带 ó��(�湮 Ȯ�� �迭�� üũ 1)
				count++;
				DFS(i);//push
			}
		}
		System.out.println(count);
	}
	
	static void DFS(int v) {
		if(visited[v]) {//�̹� �湮���� ����(�湮 Ȯ�� �迭�� üũ 2)
			return;//pop
		}
		visited[v] = true;//�湮 ó��, O(V)
		for(int i : A[v]) {//���� ��� Ȯ��, O(E)
			if(visited[i] == false) {//���� ��� �� �湮���� �ʾҴ� ��常 Ž���ϱ�(�湮 Ȯ�� �迭�� üũ 3)
				DFS(i);//push
			}
		}
	}
}
