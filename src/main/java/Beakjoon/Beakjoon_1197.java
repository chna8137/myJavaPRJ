package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Beakjoon_1197 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken()); // 정점의 개수
        int E = Integer.parseInt(st.nextToken()); // 간선의 개수

        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            graph.get(A).add(new int[]{B, C});
            graph.get(B).add(new int[]{A, C});
        }

        boolean[] visited = new boolean[V + 1];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{1, 0}); // 임의의 시작 정점

        int sum = 0;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            if (visited[cur[0]]) continue;
            visited[cur[0]] = true;
            sum += cur[1];

            for (int[] next : graph.get(cur[0])) {
                if (!visited[next[0]]) {
                    pq.add(next);
                }
            }
        }

        System.out.println(sum);
    }
}
