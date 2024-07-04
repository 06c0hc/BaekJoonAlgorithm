package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheGeniusOfRecursion {

	public static int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			String[] lines = br.readLine().split("\\s");
			int T = Integer.parseInt(lines[0]);
			
			String[] strList = new String[T];
			
			
			for(int i = 0; i < T; i++) {
				strList[i] = br.readLine().toString();
			}
			
			for(int i = 0; i < strList.length; i++) {
				System.out.println(isPalindrome(strList[i])+ " " + count);
				count = 0;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int isPalindrome(String str) {
		return recursion(str, 0, str.length()-1);
	}
	
	public static int recursion(String str, int start_idx, int end_idx) {
		count++;
		if(start_idx>=end_idx) {
			return 1;
		}else if(str.charAt(start_idx) != str.charAt(end_idx)) {
			return 0;
		}else {
			return recursion(str, start_idx+1, end_idx-1);
		}
	}
	
	

}