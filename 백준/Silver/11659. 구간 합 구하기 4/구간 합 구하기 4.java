import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력값을 공백 기준으로 나눠서 읽기
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);  // n: 리스트의 크기
        int m = Integer.parseInt(input[1]);  // m: 쿼리의 개수

        // n개의 숫자를 리스트로 입력받기
        String[] num = br.readLine().split(" ");
        int[] list = new int[n + 1]; // 1-based index로 사용하기 위해 n+1 크기의 배열

        // 구간 합 배열 만들기 (Prefix Sum Array)
        int[] prefixSum = new int[n + 1];  // 구간 합 배열
        for (int i = 1; i <= n; i++) {
            list[i] = Integer.parseInt(num[i - 1]);  // 1-based index로 맞춰서 리스트 채우기
            prefixSum[i] = prefixSum[i - 1] + list[i];  // 현재까지의 합을 저장
        }

        // m개의 쿼리 처리
        for (int i = 0; i < m; i++) {
            String[] query = br.readLine().split(" ");
            int a = Integer.parseInt(query[0]);
            int b = Integer.parseInt(query[1]);

            // 구간 [a, b]의 합은 prefixSum[b] - prefixSum[a-1]
            int sum = prefixSum[b] - prefixSum[a - 1];
            System.out.println(sum);
        }
    }
}
