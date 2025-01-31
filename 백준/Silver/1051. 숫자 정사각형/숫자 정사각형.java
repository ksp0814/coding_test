import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        int ans = Math.min(N, M);

        // ans가 1일 때도 검사하는 부분을 추가
        for (int size = ans; size >= 1; size--) {
            for (int i = 0; i <= N - size; i++) {
                for (int j = 0; j <= M - size; j++) {
                    int num = arr[i][j];

                    if (num == arr[i][j + size - 1] && num == arr[i + size - 1][j] && num == arr[i + size - 1][j + size - 1]) {
                        System.out.println(size * size);  // 정사각형이 발견되면 면적을 출력
                        return;
                    }
                }
            }
        }

        // 만약 가장 작은 1x1 크기 정사각형도 없다면 (상황에 따라 필요하지 않을 수 있음)
        System.out.println(1);
    }
}
