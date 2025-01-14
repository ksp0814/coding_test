

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int M = sc.nextInt(); // 건물의 층수
        int N = sc.nextInt(); // 각 층의 창문 개수
        sc.nextLine(); // 버퍼 비우기

        // 아파트 상태 저장
        char[][] grid = new char[5 * M + 1][5 * N + 1];
        for (int i = 0; i < 5 * M + 1; i++) {
            grid[i] = sc.nextLine().toCharArray();
        }

        // 결과를 저장할 배열 (블라인드 상태별 개수)
        int[] result = new int[5];

        // 각 창문 상태 분석
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                // 현재 창문의 좌상단 좌표
                int startX = 5 * i + 1;
                int startY = 5 * j + 1;

                // 블라인드 상태 확인
                int blinds = 0;
                for (int k = 0; k < 4; k++) {
                    if (grid[startX + k][startY] == '*') {
                        blinds++;
                    }
                }
                result[blinds]++;
            }
        }

        // 결과 출력
        for (int count : result) {
            System.out.print(count + " ");
        }

        sc.close();
    }
}
