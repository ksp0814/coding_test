
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n;
    static int[] target;
    static List<Integer>[] graph;
    static int m;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine()); // 전체 사람의 수

        target = new int[2]; // 촌수를 계산해야 하는 서로 다른 두 사람의 번호

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2; i++) {
            target[i] = Integer.parseInt(st.nextToken());
        }

        m = Integer.parseInt(br.readLine()); // 부모 자식들 간의 관계의 개수

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            graph[parent].add(child);
            graph[child].add(parent);
        }

        visited = new boolean[n + 1];

        System.out.println(bfs(target[0],target[1]));
    }

    static int bfs(int start, int end) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start, 0});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int person = cur[0];
            int distance = cur[1];

            if (person == end) {
                return distance;
            }

            for (int next : graph[person]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(new int[]{next, distance + 1});
                }
            }
        }

        return -1;
    }
}
