package 구현;

import java.util.Scanner;

public class B_2566 {
    public static void main(String[] args) {
        int a=9;
        int[][] arr=new int[a][a];
        int x = 0,y=0;
        Scanner sc=new Scanner(System.in);

        int tmp=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(tmp<arr[i][j]){
                    tmp=arr[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println(tmp);
        System.out.println((x+1)+" "+(y+1));
    }
}

