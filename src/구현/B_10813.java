package 구현;

import java.util.Scanner;

public class B_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        int []arr=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=i;
        }
        for(int i=1;i<=m;i++){
            int x = sc.nextInt();
            int y= sc.nextInt();
            //교환
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
        }
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
