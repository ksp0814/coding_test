

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        // 분모와 분자의 계산
        int numerator = (x1 * y2) + (x2 * y1); // 분자
        int denominator = y1 * y2; // 분모

        // 최대공약수(GCD) 계산
        int gcd = gcd(numerator, denominator);

        // 기약분수 형태로 출력
        System.out.println((numerator / gcd) + " " + (denominator / gcd));
    }

    // 유클리드 호제법을 이용한 최대공약수(GCD) 계산
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
