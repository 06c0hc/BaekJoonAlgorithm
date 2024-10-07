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
		int[] A = new int[n];//수열 배열 생성
		int[]ans = new int[n];//정답 배열 생성
		String[] str = bf.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(str[i]);
		}
		
		Stack<Integer> myStack = new Stack<>();
		myStack.push(0);//처음에는 항상 스택이 비어있으므로 최초 값을 push해서 초기화
		
		for(int i =1; i < n; i++) {
			//스택이 비어 있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우
			while(!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
				ans[myStack.pop()] = A[i]; //정답 배열에 현재 수열을 오큰수로 저장
			}
			myStack.push(i);//새 데이터 push
		}
		
		//반복문을 다 돌고 나왔는데 스택이 비어있지 않다면 빌 때까지
		while(!myStack.empty()) {
			ans[myStack.pop()] = -1;//스택에 쌓인 index를 꺼낸 후 정답 배열에서 인덱스에 해당하는 오큰수는 -1을 저장
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < n; i++) {
			bw.write(ans[i] + " ");//정답 배열을 출력
		}
		bw.write("\n");
		bw.flush();
	}

}
