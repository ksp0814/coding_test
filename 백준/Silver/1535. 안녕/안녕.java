
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 사람의 수

        int[] helloList = new int[N]; // 잃는 체력
        int[] happyList = new int[N]; // 얻는 기쁨

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) { // N만큼의 읽는 체력을 입력 받고 리스트에 저장
            helloList[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) { // N만큼의 얻는 기쁨을 입력 받고 리스트에 저장
            happyList[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[101];

        for (int i = 0; i < N; i++) {
            for (int j = 99; j >= helloList[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - helloList[i]] + happyList[i]);
            }
        }

        int maxHappy = 0;
        for (int i =1 ; i < 100; i++) {
            maxHappy = Math.max(maxHappy,dp[i]);
        }

        System.out.println(maxHappy);

    }
}
