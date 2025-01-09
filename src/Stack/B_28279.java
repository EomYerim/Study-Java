package Stack;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class B_28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(); // StringBuilder를 사용하여 출력을 한 번에 처리

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] tokens = line.split(" "); // 입력을 공백으로 나누기

            int c = Integer.parseInt(tokens[0]); // 첫 번째 값은 명령어 번호

            if (c == 1) {
                // 다음 값은 정수로 큐 앞에 삽입
                arrayDeque.addFirst(Integer.parseInt(tokens[1]));
            } else if (c == 2) {
                // 다음 값은 정수로 큐 뒤에 삽입
                arrayDeque.addLast(Integer.parseInt(tokens[1]));
            } else if (c == 3) {
                if (arrayDeque.isEmpty()) {
                    sb.append("-1\n");  // 줄 바꿈을 직접 추가
                } else {
                    sb.append(arrayDeque.removeFirst()).append("\n");  // 첫 번째 값을 빼고 출력
                }
            } else if (c == 4) {
                if (arrayDeque.isEmpty()) {
                    sb.append("-1\n");  // 줄 바꿈을 직접 추가
                } else {
                    sb.append(arrayDeque.removeLast()).append("\n");  // 맨 뒤 값을 빼고 출력
                }
            } else if (c == 5) {
                sb.append(arrayDeque.size()).append("\n");  // 큐의 크기 출력
            } else if (c == 6) {
                if (arrayDeque.isEmpty()) {
                    sb.append("1\n");  // 큐가 비어 있으면 "1"
                } else {
                    sb.append("0\n");  // 큐가 비어 있지 않으면 "0"
                }
            } else if (c == 7) {
                if (arrayDeque.isEmpty()) {
                    sb.append("-1\n");  // 큐가 비어 있으면 -1 출력
                } else {
                    sb.append(arrayDeque.getFirst()).append("\n");  // 첫 번째 값 출력
                }
            } else if (c == 8) {
                if (arrayDeque.isEmpty()) {
                    sb.append("-1\n");  // 큐가 비어 있으면 -1 출력
                } else {
                    sb.append(arrayDeque.getLast()).append("\n");  // 맨 뒤 값 출력
                }
            }
        }
        // 모든 출력 결과를 한 번에 출력
        System.out.print(sb.toString());
    }
}


//1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
//2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
//3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
//4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
//5: 덱에 들어있는 정수의 개수를 출력한다.
//6: 덱이 비어있으면 1, 아니면 0을 출력한다.
//7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
//8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.


