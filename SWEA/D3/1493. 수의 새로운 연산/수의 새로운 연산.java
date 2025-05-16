import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int p = sc.nextInt();
            int q = sc.nextInt();

            int[] posP = getCoordinate(p);
            int[] posQ = getCoordinate(q);

            int x = posP[0] + posQ[0];
            int y = posP[1] + posQ[1];

            int result = getValue(x, y);
            System.out.printf("#%d %d\n", test_case, result);
        }
    }

    // 좌표에서 숫자로
    static int getValue(int x, int y) {
        int sum = x + y - 1;
        return (sum * (sum - 1)) / 2 + x;
    }

    // 숫자에서 좌표로
    static int[] getCoordinate(int value) {
        int sum = 1;
        int line = 1;

        while (sum < value) {
            line++;
            sum += line;
        }

        int diff = sum - value;
        int x = line - diff;
        int y = 1 + diff;

        return new int[]{x, y};
    }
}
