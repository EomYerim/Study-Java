package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1012 {
    // 배추 4가지 이동 방향 (상, 하, 좌, 우)
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int M, N, K;  // 배추밭의 크기 (M x N)과 배추의 개수 K
    static int[][] farm;  // 배추밭
    static boolean[][] visited;  // 방문 여부

    // DFS로 연결된 배추를 탐색
    public static void dfs(int x, int y) {
        visited[x][y] = true;

        // 4방향으로 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 배추밭의 범위를 벗어나지 않고, 아직 방문하지 않았고, 배추가 있는 곳이면 DFS 재귀 호출
            if (nx >= 0 && nx < M && ny >= 0 && ny < N && !visited[nx][ny] && farm[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());  // 테스트 케이스 개수

        StringBuilder sb = new StringBuilder();

        // 각 테스트 케이스마다 처리
        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());  // 세로 크기
            N = Integer.parseInt(st.nextToken());  // 가로 크기
            K = Integer.parseInt(st.nextToken());  // 배추의 개수

            // 배추밭 초기화
            farm = new int[M][N];
            visited = new boolean[M][N];

            // 배추가 심어진 위치를 입력받고, 배추밭에 표시
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                farm[x][y] = 1;  // 배추가 심어져 있음
            }

            // 배추흰지렁이의 수
            int wormCount = 0;

            // 배추밭을 순차적으로 탐색
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (farm[i][j] == 1 && !visited[i][j]) {
                        // 배추가 있고 아직 방문하지 않았다면, 군집을 찾기 위해 DFS 실행
                        dfs(i, j);
                        wormCount++;  // 군집 하나를 찾으면 배추흰지렁이가 하나 필요하므로 개수 증가
                    }
                }
            }
            // 결과 저장
            sb.append(wormCount).append("\n");
        }

        // 결과 출력
        System.out.print(sb.toString());
    }
}
