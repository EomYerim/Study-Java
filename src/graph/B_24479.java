package graph;

import java.util.*;
import java.io.*;

public class B_24479 {
    static boolean visited[];  // 방문 여부 배열
    static ArrayList<Integer>[] graph;  // 그래프 (인접 리스트)
    static int result[];  // 각 정점의 방문 순서를 저장할 배열
    static int cnt = 1;  // 방문 순서 카운터

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정점의 수, 간선의 수, 시작 정점 R
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        // 그래프 초기화
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        result = new int[n + 1];

        // 결과를 담을 배열 초기화
        Arrays.fill(result, 0);

        // 각 정점에 대해 인접 리스트 초기화
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력 받기
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        // 각 정점의 인접 리스트를 오름차순으로 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }

        // DFS 호출
        dfs(r);

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);
    }

    // DFS 함수 구현
    public static void dfs(int node) {
        visited[node] = true;  // 해당 노드 방문 처리
        result[node] = cnt++;  // 방문 순서 기록

        // 연결된 노드들 방문
        for (int next : graph[node]) {
            if (!visited[next]) {  // 아직 방문하지 않은 노드라면
                dfs(next);  // 재귀 호출
            }
        }
    }
}
