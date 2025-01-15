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
    public static int recursion(int n){
        return n==0?1:recursion(n-1)*n;

    }
}
