package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_7562 {

    // 나이트의 8가지 이동 방향
    static int[] dx = {2, 2, -2, -2, 1, 1, -1, -1};
    static int[] dy = {1, -1, 1, -1, 2, -2, 2, -2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();  // StringBuilder 생성
        int t = Integer.parseInt(br.readLine());  // 테스트 케이스 개수

        for (int test = 0; test < t; test++) {
            int n = Integer.parseInt(br.readLine());  // 체스판의 크기 (n x n)
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());  // 시작 위치 x
            int startY = Integer.parseInt(st.nextToken());  // 시작 위치 y
            st = new StringTokenizer(br.readLine());  // 목표 위치를 읽어오기
            int endX = Integer.parseInt(st.nextToken());  // 목표 위치 x
            int endY = Integer.parseInt(st.nextToken());  // 목표 위치 y

            // BFS를 위한 큐와 방문 체크 배열
            Queue<int[]> queue = new LinkedList<>();
            boolean[][] visited = new boolean[n][n];

            // 시작 위치 큐에 넣기
            queue.add(new int[] {startX, startY, 0});  // x, y, 이동 횟수
            visited[startX][startY] = true;

            // BFS 탐색
            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];
                int cnt = current[2];

                // 목표 지점에 도달하면 이동 횟수 출력
                if (x == endX && y == endY) {
                    sb.append(cnt).append("\n");  // 결과를 StringBuilder에 추가
                    break;
                }

                // 8방향으로 이동
                for (int i = 0; i < 8; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    // 범위 체크 및 방문하지 않은 곳만 큐에 추가
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.add(new int[] {nx, ny, cnt + 1});
                    }
                }
            }
        }

        // 모든 테스트 케이스의 결과를 한 번에 출력
        System.out.print(sb.toString());
    }
}

