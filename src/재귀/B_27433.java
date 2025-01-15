package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//팩토리얼 2
public class B_27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        System.out.println(recursion(n));
    }
    public static long recursion(int n) {
        if (n == 0) {
            return 1;  // n == 0일 때 팩토리얼은 1
        }
        return n * recursion(n - 1);  // n! = n * (n-1)!
    }
}
