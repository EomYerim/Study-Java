package DP;

import java.util.Scanner;


public class B_1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		// dp 배열 크기를 충분히 크게 잡음 (최소 x까지의 연산이 필요하므로 x+1 크기)
		int[] dp = new int[x + 1];

		// 기본 값 설정
		dp[0] = 0;
		dp[1] = 0;

		// 2부터 x까지 dp 배열을 채움
		for (int i = 2; i <= x; i++) {
			// dp[i]는 i를 만드는 최소 연산 횟수
			dp[i] = dp[i - 1] + 1;

			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 2] + 1);  // 2로 나누는 경우
			}

			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);  // 3으로 나누는 경우
			}
		}

		// 최종 결과
		System.out.println(dp[x]);
	}
}

