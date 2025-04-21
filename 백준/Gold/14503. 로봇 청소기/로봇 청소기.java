

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N,M;
    static int[][] room;
    static int count =0;
    static int r,c,d;
    static int[] dx = {-1,0,1,0}; // 북,동,남,서
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        room = new int[N][M];

        st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken()); // x좌표
        c = Integer.parseInt(st.nextToken()); // y좌표
        d = Integer.parseInt(st.nextToken()); // 로봇 청소기가 바라보는 방향

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(check(r,c,d));
    }

    static int check(int r, int c, int d){
        while (true) {
            if (room[r][c] == 0) {
                room[r][c] =2;
                count++;
            }

            boolean moved = false;

            for (int i = 0; i < 4; i++) {
                d = (d+3) % 4;
                int nx = r + dx[d];
                int ny = c + dy[d];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M && room[nx][ny] == 0) {
                    r = nx;
                    c = ny;
                    moved = true;
                    break;
                }
            }

            if (!moved) {
                int back = (d + 2) % 4;
                int bx = r + dx[back];
                int by = c + dy[back];

                if (bx >= 0 && by >= 0 && bx < N && by < M && room[bx][by] != 1) {
                    r = bx;
                    c = by;
                } else {
                    break;
                }
            }
        }
        return count;

    }
}
