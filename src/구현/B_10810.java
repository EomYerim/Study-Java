package 구현;

import java.util.Scanner;
public class Ball {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n,m;
		n=sc.nextInt();
		m=sc.nextInt();
		int[] balls = new int[n+1];  // 기본적으로 값이 0으로 초기화됨

		int a,b,c;
		for (int i=1; i<=m; i++){ //m번까지 입력 받기
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			for (int j=a; j<=b; j++){
				balls[j]=c;
			}

		}
		for (int i=1; i<=n; i++){
			System.out.print(balls[i]+" ");
		}
	}
}
