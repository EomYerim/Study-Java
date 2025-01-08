package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class B_28278 {
    public static void main(String[] args) throws IOException {
        // BufferedReader로 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // 첫 번째 입력: 명령의 개수 n
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            // 명령어를 한 줄씩 받기
            String command = br.readLine().trim();
            String[] parts = command.split(" ");  // 공백을 기준으로 명령어 분리

            int c = Integer.parseInt(parts[0]);

            if (c == 1) {  // "1 x" 형태일 때
                int x = Integer.parseInt(parts[1]);
                arrayDeque.addLast(x);
            } else if (c == 2) {  // "2"일 때
                if (!arrayDeque.isEmpty()) {
                    System.out.println(arrayDeque.removeLast());  // 마지막 요소 제거
                } else {
                    System.out.println(-1);
                }
            } else if (c == 3) {  // "3"일 때
                System.out.println(arrayDeque.size());
            } else if (c == 4) {  // "4"일 때
                if (arrayDeque.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (c == 5) {  // "5"일 때
                if (!arrayDeque.isEmpty()) {
                    System.out.println(arrayDeque.peekLast());  // 마지막 요소 조회
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}

