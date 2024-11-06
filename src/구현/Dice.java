package 구현;
import java.util.HashSet;
import java.util.Set;

import java.util.Scanner;
public class Dice {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		int c;
		int max;

		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		Set<Integer> set = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		// 중복되는 값 찾기
		if (!set.add(a)) {
			duplicates.add(a);
		}
		if (!set.add(b)) {
			duplicates.add(b);
		}
		if (!set.add(c)) {
			duplicates.add(c);
		}

		max = Math.max(Math.max(a, b), c);
		if(a == b && b == c){
			System.out.println(10000+(a*1000));
		} else if (duplicates.size()==1) {
			for (Integer element : duplicates) {
				System.out.println(1000+(element*100));
				break; // 첫 번째 요소만 가져오고 루프 종료
			}
		}
		else{
			System.out.println(max*100);
		}

	}
}
