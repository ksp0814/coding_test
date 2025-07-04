import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n ; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a); // 양방향
        }

        int minKevin = Integer.MAX_VALUE;
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            int kevin = bfs(graph, i, n);
            if (kevin < minKevin) {
                minKevin = kevin;
                answer = i;
            }
        }
        
        System.out.println(answer);
    }
    
    static int bfs(List<List<Integer>> graph, int start, int n) {
        Queue<Integer> queue = new LinkedList<>();
        int[] dist = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        
        queue.offer(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            for (int next : graph.get(current)) {
                if (!visited[next]) {
                    visited[next] = true;
                    dist[next] = dist[current] + 1;
                    queue.offer(next);
                }
            }
        }
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += dist[i];
        }
        return sum;
    }
}
