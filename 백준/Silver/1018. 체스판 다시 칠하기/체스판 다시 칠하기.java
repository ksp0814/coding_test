import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int min = Integer.MAX_VALUE;

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                min = Math.min(min,check(arr, i, j));
            }
        }
        System.out.println(min);
    }


        public static int check(String[] arr, int x, int y) {
            int Black = 0;
            int White = 0;

            char[] BW = {'B', 'W'};

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    char checkblack = BW[(i+j) % 2];
                    char checkwhite = BW[(i+j+1) % 2];
                    char cur = arr[x+i].charAt(y+j);

                    if (cur != checkblack) Black++;
                    if (cur != checkwhite) White++;
                }
            }
            return Math.min(Black,White);
        }

}
