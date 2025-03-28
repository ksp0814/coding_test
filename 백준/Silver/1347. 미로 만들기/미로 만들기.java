

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();
        // F는 한칸 앞으로 이동
        // L 왼쪽으로 방향 전환 (위치는 그대로)
        // R 오른쪽으로 방향 전환 (위치는 그대로)

        // 시작을 남쪽으로 시작하니까 아래를 보고 있다는 것이다. 방향을 지정해 줘야하는데(시작방향 아래쪽)

        int[] dx = {0,1,0,-1};
        int[] dy = {-1,0,1,0};

        int x = 0, y = 0, dir = 2;
        List<int[]> path = new ArrayList<>();
        path.add(new int[]{x,y});

        for (char c : s.toCharArray()) {
            if (c == 'L') {
                dir = (dir + 3) % 4; // 왼쪽으로 회전
            } else if (c == 'R') {
                dir = (dir + 1) % 4; // 오른쪽으로 회전
            } else if (c == 'F') {
                x += dx[dir];
                y += dy[dir];
                path.add(new int[]{x,y});
            }
        }

        int minX = 0, maxX = 0, minY = 0, maxY = 0;
        for (int[] p : path) {
            minX = Math.min(minX, p[0]);
            maxX = Math.max(maxX, p[0]);
            minY = Math.min(minY, p[1]);
            maxY = Math.max(maxY, p[1]);
        }

        int h = maxY - minY + 1;
        int w = maxX - minX + 1;
        char[][] map = new char[h][w];

        for (char[] row : map) {
            Arrays.fill(row, '#');
        }

        for (int[] p : path) {
            map[p[1] - minY][p[0] - minX] = '.';
        }

        for (char[] row : map) {
            System.out.println(row);
        }
    }
}
