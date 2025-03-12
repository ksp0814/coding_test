

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // N 크기 입력
        int T = Integer.parseInt(br.readLine()); // 찾고자 하는 숫자 입력

        int[][] arr = new int[N][N]; // N x N 배열 생성

        int x = N / 2, y = N / 2; // 시작 좌표 (중앙)
        int num = 1; // 시작 숫자 (1부터 시작)

        int dir = 1; // 이동할 횟수 (1번, 2번, 3번, 4번 순으로 늘어남)

        // 달팽이 배열 채우기
        while (num <= N * N) {
            for (int i = 0; i < dir; i++) { // 위쪽으로
                arr[x--][y] = num++;
            }
            if (num-1 == N*N) break;
            for (int i = 0; i < dir; i++) { // 오른쪽으로
                arr[x][y++] = num++;
            }
            dir++; // 방향 전환 후 횟수 증가
            for (int i = 0; i < dir; i++) { // 아래쪽으로
                arr[x++][y] = num++;
            }
            for (int i = 0; i < dir; i++) { // 왼쪽으로
                arr[x][y--] = num++;
            }
            dir++; // 방향 전환 후 횟수 증가
        }

        // 배열 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // T가 몇 번째 숫자였는지 찾기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == T) {
                    System.out.println((i + 1) + " " + (j + 1)); // 좌표는 1-based
                }
            }
        }
    }
}
