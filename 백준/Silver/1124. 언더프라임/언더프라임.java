import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // 1. 에라토스테네스의 체로 소수 체크
        boolean[] isPrime = new boolean[100001];
        for (int i = 2; i <= 100000; i++) isPrime[i] = true;

        for (int i = 2; i * i <= 100000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 100000; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 2. 각 수의 소인수 개수 저장
        int[] primeCount = new int[100001];

        for (int i = 2; i <= 100000; i++) {
            int n = i;
            int cnt = 0;
            int p = 2;
            while (n > 1) {
                if (n % p == 0) {
                    cnt++;
                    n /= p;
                } else {
                    p++;
                }
            }
            primeCount[i] = cnt;
        }

        // 3. 소인수 개수가 소수이면 언더프라임으로 간주
        int ans = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime[primeCount[i]]) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
