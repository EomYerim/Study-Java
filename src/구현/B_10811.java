package 구현;
import java.util.Scanner;

public class B_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        for (int i = 1; i <= m; i++) {
            int x = sc.nextInt(); //1
            int y = sc.nextInt(); //2
            for (int j = x; j <=y; j++) { // 1,2,3,4
                int temp=arr[j]; //2
                arr[j] = arr[y]; //arr[2] = 1
                arr[y] = temp; // arr[1]=2
                y-=1;
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
