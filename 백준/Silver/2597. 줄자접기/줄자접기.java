

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double n = Integer.parseInt(br.readLine()); // 줄자의 전체 길이
        double left = 0; // 줄자의 왼쪽 끝점
        double right = n; // 줄자의 오른쪽 끝점

        double[][] dots = new double[3][2]; // 색깔별 점 위치 저장

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dots[i][0] = Integer.parseInt(st.nextToken());
            dots[i][1] = Integer.parseInt(st.nextToken());
        }

        // 각 색상별로 접기 시도
        for (int i = 0; i < 3; i++) {
            // 두 점이 이미 겹치면 접을 필요가 없음
            if (dots[i][0] == dots[i][1]) continue;

            // 접는 위치 계산
            double foldPoint = (dots[i][0] + dots[i][1]) / 2.0;

            // 접는 위치가 현재 줄자 범위 내에 있는지 확인
            if (foldPoint < left || foldPoint > right) continue;

            // 접는 방향 결정 (왼쪽 부분이 더 길면 오른쪽으로 접고, 오른쪽 부분이 더 길면 왼쪽으로 접음)
            if (foldPoint - left <= right - foldPoint) {
                // 왼쪽 부분을 오른쪽으로 접음
                double newLeft = foldPoint;

                // 남은 점들의 위치 업데이트
                for (int j = i + 1; j < 3; j++) {
                    for (int k = 0; k < 2; k++) {
                        if (dots[j][k] < foldPoint) {
                            // 접히는 부분 왼쪽의 점은 대칭이동
                            dots[j][k] = 2 * foldPoint - dots[j][k];
                        }
                    }
                }

                left = newLeft;
            } else {
                // 오른쪽 부분을 왼쪽으로 접음
                double newRight = foldPoint;

                // 남은 점들의 위치 업데이트
                for (int j = i + 1; j < 3; j++) {
                    for (int k = 0; k < 2; k++) {
                        if (dots[j][k] > foldPoint) {
                            // 접히는 부분 오른쪽의 점은 대칭이동
                            dots[j][k] = 2 * foldPoint - dots[j][k];
                        }
                    }
                }

                right = newRight;
            }
        }

        // 최종 줄자 길이 출력 (절대값으로 계산)
        System.out.println(right - left);
    }
}