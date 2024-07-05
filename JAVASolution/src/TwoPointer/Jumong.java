package TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class Jumong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int N = Integer.parseInt(input.nextLine());//재료 수
		int M = Integer.parseInt(input.nextLine());//기준 합계
		
		int count = 0;//가짓수
		
		//투 포인터
		int start_idx = 0;
		int end_idx = N-1;
		
		
		//재료 입력 및 초기화
		String[] materials = input.nextLine().split("\\s");
		int[] materialList = new int[N];
		
		for(int i = 0; i < materialList.length; i++) {
			materialList[i] = Integer.parseInt(materials[i]);
		}
		
		Arrays.sort(materialList);//정렬
		
		//두 재료의 합이 기준 합계와 동일한 가짓수 구하기 
		while(start_idx < end_idx) {
			if(materialList[start_idx]+materialList[end_idx] < M) {
				start_idx++;
			}else if(materialList[start_idx]+materialList[end_idx] > M) {
				end_idx--;
			}else if(materialList[start_idx]+materialList[end_idx] == M) {
				count++;
				start_idx++;
				end_idx--;
			}
		}
		System.out.println(count);
	}

}