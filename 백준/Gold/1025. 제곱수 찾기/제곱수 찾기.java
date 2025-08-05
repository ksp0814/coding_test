import java.util.Scanner;

public class Main {
    static int n,m;
    static int[][] list;
    static int ans = -1; // 정답을 담을 정수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        list = new int[n][m];

        for (int i = 0; i<n; i++) { // 2차원 배열을 만들었고
            String s = sc.next();
            for (int j =0; j < m; j++) {
                char c = s.charAt(j);
                list[i][j] = c - '0';
            }
        }

        for(int i =0; i < n; i++) {
            for (int j=0; j< m; j++) {
                for(int dx = -n; dx <= n; dx++) {
                    for (int dy = -m; dy <= m; dy++) {
                        if(dx == 0 && dy == 0) continue;
                        make(i,j,dx,dy);
                    }
                }
            }
        }

        System.out.println(ans);
    }

    static void make(int x, int y,int dx, int dy) {
        int num =0;

        while(x >= 0 && x < n && y >=0 && y < m) {
            num = num * 10 + list[x][y];

            if (check(num)) {
                ans = Math.max(ans, num);
            }

            x += dx;
            y += dy;
        }
    }

    static boolean check(int n) {
        if( n < 0) {
            return false;
        }

        int root = (int) Math.sqrt(n); // Math.sqrt() 제곱근의 정수 부분

        if(root * root == n) {
            return true;
        } else return false;
    }
}
