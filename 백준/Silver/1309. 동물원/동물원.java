import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc. nextInt();

        int[][] arr = new int[n][3];

        arr[0][0] =1;
        arr[0][1] = 1;
        arr[0][2] = 1;

        int ans = 0;

        for (int i = 1; i < n; i++) {
            arr[i][0] = (arr[i-1][0] + arr[i-1][1] + arr[i-1][2]) % 9901;
            arr[i][1] = (arr[i-1][0] + arr[i-1][2]) % 9901;
            arr[i][2] = (arr[i-1][0] + arr[i-1][1]) % 9901;
        }

        ans = (arr[n-1][0] + arr[n-1][1] + arr[n-1][2]) % 9901 ;

        System.out.println(ans);
    }
}
