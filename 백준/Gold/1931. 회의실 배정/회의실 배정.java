
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int ans;
    static int[][] list;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        list = new int[n][2];

        for (int i = 0; i < n; i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }

        Arrays.sort(list, (a,b) -> {
            if(a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });

        ans = 0;
        int end = 0;

        for(int i = 0; i < n; i++) {
            if(list[i][0] >= end) {
                end = list[i][1];
                ans++;
            }

        }

        System.out.println(ans);
    }
}
