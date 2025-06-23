import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int n,m;
    static int[][] arr1;
    static int[][] arr2;
    static int ans;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr1 = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                arr1[i][j] = s.charAt(j) - '0';
            }
        }

        arr2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                arr2[i][j] = s.charAt(j) - '0';
            }
        }

        ans = 0;

        for (int i = 0; i <= n-3; i++) {
            for (int j = 0; j <= m-3; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    flip(i,j);
                    ans++;
                }
            }
        }

        if (check()) {
            System.out.println(ans);
        } else  {
            System.out.println("-1");
        }




    }

    static void flip(int x,int y){
        for (int i = x; i<x+3; i++) {
            for (int j = y; j<y+3; j++) {
                if (arr1[i][j] == 1) {
                    arr1[i][j] = 0;
                } else  arr1[i][j] = 1;
            }
        }
    }

    static boolean check() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


}
