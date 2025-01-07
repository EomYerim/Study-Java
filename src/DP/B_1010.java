package DP;

import java.util.Scanner;

//백준 1010번
import java.math.BigInteger;

public class B_1010 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스 개수
        sc.nextLine();  // 개행 문자 처리
        for (int i = 0; i < t; i++) {
            String text = sc.nextLine();
            int n = Integer.parseInt(text.split(" ")[0]);
            int m = Integer.parseInt(text.split(" ")[1]);

            // 팩토리얼 계산
            BigInteger fn = factorial(n);
            BigInteger fm = factorial(m);
            BigInteger fmn = factorial(m - n);

            // 조합 계산: fm / (fn * fmn)
            System.out.println(fm.divide(fn.multiply(fmn))); // BigInteger는 divide()와 multiply() 메소드 사용
        }
    }

    // 팩토리얼을 계산하는 함수 (BigInteger 사용)
    public static BigInteger factorial(int n) {
        if (n == 0) return BigInteger.ONE;  // 0!은 1로 정의
        BigInteger result = BigInteger.ONE;  // 결과를 저장할 변수
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));  // BigInteger 곱셈
        }
        return result;
    }
}


/** 강 주변에서 다리를 짓기에 적합한 곳을 사이트라고 함
 * 강의 서쪽에는 n개의 사이트, 동쪽에는 m개의 사이트 (n<=m)
 * 서쪽과 동쪽의 사이트를 다리로 연결 (1:1 관계)
 * 서쪽의 사이트 수 만큼 다리를 지으려고 함
 * 다리끼리는 서로 겹쳐질 수 없음
 * 서쪽의 n개 사이트중에서 동쪽 m개의 사이트 중 n개를 순서대로 연결
 * nCr = =C(M,N) = M!/N!(M-N)!
 * 2!/2!(0!)
 * 2 2 ->1
 * 1 5 -> 5
 * 5!/1!*(5-1)! -> 120/24
 * 13 29 -> 67863915
 * * */