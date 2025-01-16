package BackTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class B_15651 {

    public static int[] arr;   // 순열을 저장할 배열
    public static int N, M;    // N: 1부터 N까지, M: 고를 숫자의 개수
    public static StringBuilder sb = new StringBuilder(); // 결과를 저장할 StringBuilder

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 값 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());  // 1부터 N까지의 숫자
        M = Integer.parseInt(st.nextToken());  // 고를 숫자의 개수

        arr = new int[M];  // 길이가 M인 배열 생성
        dfs(0);  // 깊이 우선 탐색 시작
        System.out.println(sb);  // 결과 출력
    }

    // 깊이 우선 탐색 (DFS)
    public static void dfs(int depth) {
        // 깊이가 M에 도달하면 결과를 출력
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(' ');  // 배열의 각 요소를 공백으로 구분하여 추가
            }
            sb.append('\n');  // 한 줄 출력 후 개행
            return;
        }

        // 1부터 N까지의 숫자 중에서 선택 (중복 허용)
        for (int i = 1; i <= N; i++) {
            arr[depth] = i;  // 현재 자리(depth)에 숫자 i를 넣음
            dfs(depth + 1);  // 다음 자리로 이동
        }
    }
}
