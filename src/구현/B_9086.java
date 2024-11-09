package 구현;

import java.util.Scanner;

public class B_9086 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		for(int i=0; i<n; i++){
			String s = sc.next();  // 문자열 입력
			char first = s.charAt(0);  // 첫 번째 문자
			char last = s.charAt(s.length() - 1);  // 마지막 문자

			// 문자를 문자열로 변환하여 출력
			System.out.println(first + "" + last);
		}
	}
}
