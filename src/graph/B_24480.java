package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B_24480 {
    static boolean visited[];
    static int result [];
    static int cnt = 1;
    static ArrayList<Integer>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //정점의 수
        int M = Integer.parseInt(st.nextToken()); //간선의 수
        int K = Integer.parseInt(st.nextToken()); //시작 정점 , 시작 정점에서 출발할 수 없는 경우 0 출력
        StringBuilder sb = new StringBuilder();
        visited = new boolean[N+1];
        graph= new ArrayList[N+1];
        result= new int[N+1];
        Arrays.fill(result,0); // 결과 담을 배열 0으로 초기화

        for (int i = 1; i <= N; i++) {
            graph[i]= new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        for(int i=1;i<=N;i++){
            Collections.sort(graph[i],Collections.reverseOrder()); // 내림차순 정렬
        }

        dfs(K);
        for(int i=1;i<=N;i++){
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int k){
        visited[k]=true; //방문 처리
        result[k]=cnt++;

        for(int i : graph[k]){
            if(!visited[i]){
                dfs(i);
            }
        }
    }
}
