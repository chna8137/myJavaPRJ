package Beakjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Beakjoon_2213 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Map<Integer,List<Integer>> graph = new HashMap<Integer,List<Integer>>();
        for (int i = 0; i < N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            makeGraph(graph,a,b);
            makeGraph(graph,b,a);
        }
        int[][] dp = new int[2][N+1];
        boolean[] v = new boolean[N+1];
        DFS(1,0,graph,v,arr,dp);
        StringBuilder sb = new StringBuilder();
        sb.append(Math.max(dp[0][1], dp[1][1]));
        sb.append("\n");

        boolean[] v2 = new boolean[N+1];
        List<Integer> independentSet = new ArrayList<Integer>();
        BackT(graph,dp,1,v2,false,independentSet);
        Collections.sort(independentSet); // 트리에서 DFS로 선택한 노드는 오름차순으로 정렬되어 있지 않기 때문에 직접 정렬을 해 줍니다.
        for (Integer val : independentSet) {
            sb.append(val);
            sb.append(" ");
        }

        System.out.println(sb.toString());
//		for (int i = 0; i < 2; i++) {
//			System.out.println(Arrays.toString(dp[i]));
//		}

    }

    public static void BackT(Map<Integer,List<Integer>> graph, int[][] dp, int now, boolean[] v, boolean parentContainedInSet, List<Integer> independentSet) {
        v[now] = true;
        //부모노드의 포함여부(parentContainedInSet)가 없으면 리프노드는 항상 dp[0][now] > dp[1][now]이기 때문에 반드시 선택되는 오류가 발생합니다.

        if(!parentContainedInSet && dp[0][now] > dp[1][now]) {
            independentSet.add(now);
            parentContainedInSet = true;
        }else {
            parentContainedInSet = false;
        }
        if(!graph.containsKey(now)) return;
        for(int next: graph.get(now)) {
            if(v[next]) continue;
            v[next] = true;
            BackT(graph,dp,next,v,parentContainedInSet,independentSet);
        }
    }

    public static void DFS(int now, int prev, Map<Integer, List<Integer>> graph, boolean[] v, int[] arr, int[][] dp) {
        v[now] = true;
        dp[0][now] = arr[now];

        if(graph.containsKey(now)) {
            for (int next : graph.get(now)) {
                if(v[next])continue;
                DFS(next,now,graph,v,arr,dp);
                // now를 선택하면 인접한 next들을 선택하지 않았을 때의 누적값을 모두 더한다.
                dp[0][now] += dp[1][next];
                // now를 선택하지 않으면 인접한 next에 대해 선택하거나 선택하지 않거나 상관없다.
                dp[1][now] += Math.max(dp[0][next], dp[1][next]);
            }
        }
    }

    public static void makeGraph(Map<Integer,List<Integer>> graph, int from, int to) {
        if(graph.containsKey(from)) {
            graph.get(from).add(to);
        }else {
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(to);
            graph.put(from, temp);
        }
    }
}
