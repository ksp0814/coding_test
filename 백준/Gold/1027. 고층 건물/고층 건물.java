
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;

        for (int i = 0; i < n; i++) {
            int cnt = 0;

            // 왼쪽 탐색
            for (int j = i - 1; j >= 0; j--) {
                boolean visible = true;
                for (int k = j + 1; k < i; k++) {
                    // arr[j] ~ arr[i] 직선 위에 arr[k]가 걸리면 안됨
                    if ((long)(arr[k] - arr[j]) * (i - j) >= (long)(arr[i] - arr[j]) * (k - j)) {
                        visible = false;
                        break;
                    }
                }
                if (visible) cnt++;
            }

            // 오른쪽 탐색
            for (int j = i + 1; j < n; j++) {
                boolean visible = true;
                for (int k = i + 1; k < j; k++) {
                    if ((long)(arr[k] - arr[i]) * (j - i) >= (long)(arr[j] - arr[i]) * (k - i)) {
                        visible = false;
                        break;
                    }
                }
                if (visible) cnt++;
            }

            answer = Math.max(answer, cnt);
        }

        System.out.println(answer);
    }
}
