

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 사람 수
        int[] arr = new int[N]; // 자신보다 큰 사람의 수
        int[] ans = new int[N]; // 최종 순서 결과

        // 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // arr[i]는 i번째 사람의 "자신보다 큰 사람의 수"
        }

        // ans 배열은 0으로 초기화 되어 있고, 각 자리에 해당하는 사람을 배치합니다.
        for (int i = 0; i < N; i++) {
            int count = arr[i]; // 자신보다 큰 사람의 수
            for (int j = 0; j < N; j++) {
                // 자리가 비어 있고, 자신보다 큰 사람이 count명인 경우
                if (count == 0 && ans[j] == 0) {
                    ans[j] = i + 1; // 사람 i+1을 해당 위치에 배치
                    break;
                }
                // 자리로 갈 때까지 count를 줄여가며 확인
                else if (ans[j] == 0) {
                    count--;
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
