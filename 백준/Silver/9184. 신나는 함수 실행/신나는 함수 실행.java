
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int a;
    static int b;
    static int c;
    static int[][][] dp = new int[21][21][21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);

            if (st.countTokens() < 3) break;

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if (a == -1 && b == -1 && c == -1) {
                break;
            }

            System.out.println("w("+a+", "+b+", "+c+") = "+check(a, b, c));
        }
    }

    static int check(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) return 1;

        if (a > 20 || b > 20 || c > 20) return check(20, 20, 20);

        if (dp[a][b][c] != 0) return dp[a][b][c];

        if (a < b && b < c) {
            return dp[a][b][c] = check(a, b, c - 1) + check(a, b - 1, c - 1) - check(a, b - 1, c);
        } else return dp[a][b][c] =  check(a-1,b,c) + check(a-1,b-1,c) + check(a-1,b,c-1) - check(a-1,b-1, c-1);
    }
}
