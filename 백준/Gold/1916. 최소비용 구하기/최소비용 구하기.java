

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 도시 개수
        int m = sc.nextInt(); // 버스 개수

        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int cost = sc.nextInt();
            graph.get(start).add(new int[]{end, cost});
        }

        int startCity = sc.nextInt();
        int endCity = sc.nextInt();

        // 다익스트라 준비
        int[] dist = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[startCity] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{startCity, 0});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int now = cur[0];
            int costSoFar = cur[1];

            if (visited[now]) continue;
            visited[now] = true;

            for (int[] next : graph.get(now)) {
                int nextCity = next[0];
                int nextCost = next[1];

                if (dist[nextCity] > dist[now] + nextCost) {
                    dist[nextCity] = dist[now] + nextCost;
                    pq.offer(new int[]{nextCity, dist[nextCity]});
                }
            }
        }

        System.out.println(dist[endCity]);
    }
}
