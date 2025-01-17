package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_24444 {
    static ArrayList<Integer> graph [];
    static int result [];
    static boolean visited[];
    static ArrayDeque<Integer> arrayDeque ;
    static int cnt=1; 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        arrayDeque=new ArrayDeque<>();
        visited=new boolean[n+1];
        result=new int[n+1];
        graph=new ArrayList[n+1];
        Arrays.fill(result,0);

        for(int i=1;i<=n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        for(int i=1;i<=n;i++){
            Collections.sort(graph[i]);
        }
        bfs(k);

        // 결과 출력
        for (int i = 1; i <= n; i++) {
            sb.append(result[i]).append("\n");
        }
        System.out.print(sb);
    }


    private static void bfs(int k) { //1
        visited[k]=true;
        result[k]=cnt++;
        arrayDeque.add(k);
        while(!arrayDeque.isEmpty()){
            int x= arrayDeque.removeFirst();
            for(int y : graph[x]){
                if(!visited[y]){
                    visited[y]=true; //방문했다고 처리
                    result[y]=cnt++;
                    arrayDeque.add(y); //queue에 방문했다고 표시
                }
            }

        }
    }
}
