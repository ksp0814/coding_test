import java.util.Scanner;

public class Main {
    static int T;
    static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        sc.nextLine();

        for (int t = 0; t < T; t++) {
            arr = new char[3][3];
            for (int i = 0; i < 3; i++) {
                String[] s = sc.nextLine().split(" ");
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = s[j].charAt(0);
                }
            }

            System.out.println(minFlipCount());
        }
    }

    static int minFlipCount() {
        int minFlip = Integer.MAX_VALUE;

        // 8개의 동작(3행 + 3열 + 2대각선)
        for (int mask = 0; mask < (1 << 8); mask++) {
            char[][] temp = new char[3][3];
            for (int i = 0; i < 3; i++) {
                System.arraycopy(arr[i], 0, temp[i], 0, 3);
            }

            int flipCount = Integer.bitCount(mask);

            // 행 뒤집기 (0~2)
            for (int i = 0; i < 3; i++) {
                if ((mask & (1 << i)) != 0) flipRow(temp, i);
            }

            // 열 뒤집기 (3~5)
            for (int i = 0; i < 3; i++) {
                if ((mask & (1 << (i + 3))) != 0) flipCol(temp, i);
            }

            // 대각선 뒤집기
            if ((mask & (1 << 6)) != 0) flipDiag1(temp);
            if ((mask & (1 << 7)) != 0) flipDiag2(temp);

            if (allSame(temp)) {
                minFlip = Math.min(minFlip, flipCount);
            }
        }

        return (minFlip == Integer.MAX_VALUE) ? -1 : minFlip;
    }

    static void flipRow(char[][] arr, int r) {
        for (int c = 0; c < 3; c++) {
            arr[r][c] = (arr[r][c] == 'H') ? 'T' : 'H';
        }
    }

    static void flipCol(char[][] arr, int c) {
        for (int r = 0; r < 3; r++) {
            arr[r][c] = (arr[r][c] == 'H') ? 'T' : 'H';
        }
    }

    static void flipDiag1(char[][] arr) {
        for (int i = 0; i < 3; i++) {
            arr[i][i] = (arr[i][i] == 'H') ? 'T' : 'H';
        }
    }

    static void flipDiag2(char[][] arr) {
        for (int i = 0; i < 3; i++) {
            arr[i][2 - i] = (arr[i][2 - i] == 'H') ? 'T' : 'H';
        }
    }

    static boolean allSame(char[][] arr) {
        char first = arr[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] != first) return false;
            }
        }
        return true;
    }
}
