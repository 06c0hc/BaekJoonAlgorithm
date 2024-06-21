package TwoPointer;

import java.util.Scanner;

public class SumOfNumbers5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] line = input.nextLine().split("\\s");
		int N = Integer.parseInt(line[0]);//
		
		//1~N까지의 수열 초기화
		int[] numList = new int[N];
		for(int i = 0; i < N; i++) {
			numList[i] = i + 1;
		}
		
		//투 포인터
		int start_idx = 0;
		int end_idx = 0;
		
		int sum = 1;//연속된 자연수들의 누적 합계
		int count = 1;//연속된 자연수의 합이 N인 가짓수(연속된 자연수가 N 하나로만 구성된 경우를 미리 고려함)
		
		
		//투 포인터 이동 원칙
		//1. sum > N이면 연속된 자연수의 범위를 좌측에서부터 한칸 축소
		//2. sum < N이면 연속된 자연수의 범위를 우측으로 한칸 확장
		//3. sum == N이면 가짓수를 1증가시키고 우측으로 한칸 확장
		
		//투 포인터 이동 원칙을 활용해서 연속된 자연수들의 합이 N인 가짓수를 구하기
		while(end_idx < N-1) {
			if(sum > N) {
				sum = sum - numList[start_idx];
				start_idx++;
			}else if(sum < N) {
				end_idx++;
				sum = sum + numList[end_idx];
			}else if(sum == N) {
				end_idx++;
				sum = sum + numList[end_idx];
				count++;
			}
		}
		System.out.println(count);
	}

}
