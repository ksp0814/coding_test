

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int minusOne = 0, zero = 0, one = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 종이를 자르는 함수 호출
        divide(0, 0, N);

        // 결과 출력
        System.out.println(minusOne);
        System.out.println(zero);
        System.out.println(one);
    }

    // 종이를 자르는 함수
    public static void divide(int x, int y, int size) {
        if (isSame(x, y, size)) {
            // 해당 종이가 모두 같은 숫자로 이루어져 있는 경우
            if (arr[x][y] == -1) {
                minusOne++;
            } else if (arr[x][y] == 0) {
                zero++;
            } else {
                one++;
            }
            return;
        }

        // 9등분하여 재귀 호출
        int newSize = size / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                divide(x + i * newSize, y + j * newSize, newSize);
            }
        }
    }

    // 해당 영역이 같은 숫자로 이루어져 있는지 확인하는 함수
    public static boolean isSame(int x, int y, int size) {
        int first = arr[x][y]; // 첫 번째 숫자 저장
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != first) {
                    return false; // 다른 숫자가 있으면 false 반환
                }
            }
        }
        return true; // 모두 같은 숫자라면 true 반환
    }
}
