package DP;

import java.util.Scanner;

//백준 14916번
public class B_14916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coin = sc.nextInt();
        int[] dp = new int[coin + 1];
        for (int i = 1; i <= coin; i++) {
            dp[i] = Integer.MAX_VALUE; // 초기화: 최소 동전 개수를 알 수 없을 때는 매우 큰 값으로 설정
        }

        dp[0] = 0; // 0원을 만들기 위해선 동전이 필요 없음

        for(int i=1;i<=coin;i++){
            if (i>=2 && dp[i - 2] != Integer.MAX_VALUE){
                dp[i]=Math.min(dp[i],dp[i-2]+1);
            }
            if(i>=5 && dp[i - 5] != Integer.MAX_VALUE ){
                dp[i]=Math.min(dp[i],dp[i-5]+1);
            }
        }
        System.out.println (dp[coin] == Integer.MAX_VALUE ? -1 : dp[coin]);
    }
}
