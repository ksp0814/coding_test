import java.util.Scanner;

class Solution {
    static int win, lose;
    static int[] gyu = new int[9];
    static int[] in = new int[9];
    static int[] picked = new int[9];
    static boolean[] visited = new boolean[9];

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            boolean[] check = new boolean[19];
            win = 0;
            lose = 0;

            for (int i = 0; i < 9; i++) {
                gyu[i] = sc.nextInt();
                check[gyu[i]] = true;
            }

            int idx = 0;
            for (int i = 1; i <= 18; i++) {
                if (!check[i]) {
                    in[idx++] = i;
                }
            }

            checking(0);

            System.out.println("#" + test_case + " " + win + " " + lose);
        }
    }

    static void checking(int depth) {
        if (depth == 9) {
            int gyuScore = 0;
            int inScore = 0;
            for (int i = 0; i < 9; i++) {
                if (gyu[i] > picked[i]) gyuScore += gyu[i] + picked[i];
                else inScore += gyu[i] + picked[i];
            }
            if (gyuScore > inScore) win++;
            else if (gyuScore < inScore) lose++;
            return;
        }

        for (int i = 0; i < 9; i++) {
            if (!visited[i]) {
                visited[i] = true;
                picked[depth] = in[i];
                checking(depth + 1);
                visited[i] = false;
            }
        }
    }
}
