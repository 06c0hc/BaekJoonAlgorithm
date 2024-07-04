package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheGeniusOfRecursion {

	public static int count = 0;//recursion함수 호출 횟수
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			String[] lines = br.readLine().split("\\s");
			int T = Integer.parseInt(lines[0]);//테스트 케이스 갯수
			
			String[] strList = new String[T];//문자열 리스트
			

			for(int i = 0; i < T; i++) {
				strList[i] = br.readLine().toString();
			}
			
			for(int i = 0; i < strList.length; i++) {
				System.out.println(isPalindrome(strList[i])+ " " + count);//팰린드롬 문자열 확인 결과, 재귀 함수 호출 횟수 출력
				count = 0;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//팰린드롬 문자열 검사
	public static int isPalindrome(String str) {
		return recursion(str, 0, str.length()-1);
	}
	
	//시작 인덱스와 끝 인덱스를 좁혀가며 두 인덱스가 가리키는 각 문자를 비교
	public static int recursion(String str, int start_idx, int end_idx) {
		count++;
		if(start_idx>=end_idx) {//두 인덱스가 교차되면 1을 반환
			return 1;
		}else if(str.charAt(start_idx) != str.charAt(end_idx)) {//문자가 서로 다른 경우 0을 반환
			return 0;
		}else {
			return recursion(str, start_idx+1, end_idx-1);//두 인덱스를 좁혀서 다시 검사
		}
	}
	
	

}