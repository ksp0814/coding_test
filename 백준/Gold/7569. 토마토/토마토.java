
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][][] box;
    static int M, N, H;
    static int[] dz = {-1,1,0,0,0,0};
    static int[] dx = {0,0,-1,1,0,0}; // 상하좌우 앞뒤 까지 포함
    static int[] dy = {0,0,0,0,-1,1};
    static Queue<Tomato> queue = new LinkedList<>();

    static class Tomato {
        int z,x,y;

        Tomato(int z,int x,int y){
            this.z = z;
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken()); // 상자의 가로
        N = Integer.parseInt(st.nextToken()); // 상자의 세로
        H = Integer.parseInt(st.nextToken()); // 상자의 수

        box = new int[H][N][M]; // 상자의 배열 선언

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                    if (box[i][j][k] == 1) { // 입력 받으면서 익은 토마토는 큐에 미리 넣기 위해
                        queue.add(new Tomato(i,j,k));
                    }
                }
            }
        }
        int day = -1; // 시작 전에 0으로 시작 마지막에 +1 된다. 

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Tomato tomato = queue.poll();

                for (int k = 0; k < 6; k++) {
                    int nz = tomato.z + dz[k];
                    int nx = tomato.x + dx[k];
                    int ny = tomato.y + dy[k];

                    if (nz >= 0 && nz < H && nx >= 0 && nx < N && ny >= 0 && ny < M) {
                        if (box[nz][nx][ny] == 0) {
                            box[nz][nx][ny] = 1;
                            queue.add(new Tomato(nz,nx,ny));
                        }
                    }
                }
            }
            day++;
        }

        for (int h = 0; h < H; h++) { // 익지 않은 토마토 있는지 확인
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (box[h][i][j] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }

        System.out.println(day);
    }
}
