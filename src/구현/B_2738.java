package 구현;
import java.util.Scanner;

public class B_2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] listA = new int[n][m];
        int [][] listB = new int[n][m];
        // listA 입력 받기
        for (int i = 0; i < listA.length; i++) {
            for (int j = 0; j< listA[i].length; j++) {
                listA[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < listB.length; i++) {
            for (int j = 0; j< listB[i].length; j++) {
                listB[i][j] = sc.nextInt();
            }
        }
        int arr[]=new int[n+1];
        for (int i = 0; i < listB.length; i++) {
            for (int j = 0; j< listB[i].length; j++) {
                arr[j]=listA[i][j] + listB[i][j];
            }
            for (int k = 0; k< arr.length-1; k++) {
                System.out.print(arr[k]+" ");
            }
            System.out.println();

        }

    }
}