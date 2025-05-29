

import java.util.*;

public class Main {
    static int n, m;
    static List<int[]> homes = new ArrayList<>();
    static List<int[]> chickens = new ArrayList<>();
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 1) homes.add(new int[]{i, j});
                if (map[i][j] == 2) chickens.add(new int[]{i, j});
            }
        }

        combination(new ArrayList<>(), 0);
        System.out.println(min);
    }

    // 치킨집 중 m개 선택
    static void combination(List<int[]> selected, int start) {
        if (selected.size() == m) {
            int total = 0;
            for (int[] home : homes) {
                int dist = Integer.MAX_VALUE;
                for (int[] chicken : selected) {
                    int d = Math.abs(home[0] - chicken[0]) + Math.abs(home[1] - chicken[1]);
                    dist = Math.min(dist, d);
                }
                total += dist;
            }
            min = Math.min(min, total);
            return;
        }

        for (int i = start; i < chickens.size(); i++) {
            selected.add(chickens.get(i));
            combination(selected, i + 1);
            selected.remove(selected.size() - 1);
        }
    }
}
