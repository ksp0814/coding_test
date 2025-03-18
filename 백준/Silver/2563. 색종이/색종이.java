import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] paper = new int[100][100];
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // x좌표 (가로)
            int b = Integer.parseInt(st.nextToken()); // y좌표 (세로)

            for (int j = a; j < a + 10; j++) {
                for (int k = b; k < b + 10; k++) {
                    paper[k][j] = 1; // 색종이 영역에 1 표시
                }
            }
        }

        int res = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                res += paper[i][j];
            }
        }

        System.out.println(res);
    }
}
