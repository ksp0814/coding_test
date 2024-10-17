import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 입력: n과 m을 공백으로 분리하여 입력받기
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        // 숫자 리스트 입력 받기
        String[] num = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>(n + 1); // 리스트를 1-based로 사용할 예정
        list.add(0); // 인덱스 0은 사용하지 않음 (1-based로 사용하기 위해 0을 채움)

        // 구간 합 배열을 준비 (Prefix Sum Array)
        int[] prefixSum = new int[n + 1];

        // 리스트에 숫자 추가 및 구간 합 계산
        for (int i = 1; i <= n; i++) {
            int current = Integer.parseInt(num[i - 1]);
            list.add(current);
            prefixSum[i] = prefixSum[i - 1] + current; // 구간 합 저장
        }

        // m개의 쿼리 처리
        for (int i = 0; i < m; i++) {
            String[] temp = br.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);

            // 구간 [a, b]의 합 계산 및 출력
            int sum = prefixSum[b] - prefixSum[a - 1];
            System.out.println(sum);
        }
    }
}
