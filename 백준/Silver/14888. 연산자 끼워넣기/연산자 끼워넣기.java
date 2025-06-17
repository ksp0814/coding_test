

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int[] number;
    static int[] math;
    static int max_ans;
    static int min_ans;
    static int n;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        number = new int[n]; // 정수들

        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        math = new int[4]; // 연산자 개수 + - * / 순서

        for (int i = 0; i < 4; i++) {
            math[i] = sc.nextInt();
        }

        max_ans = Integer.MIN_VALUE;
        min_ans = Integer.MAX_VALUE;


        dfs(number[0],1);

        System.out.println(max_ans);
        System.out.println(min_ans);


    }

    static void dfs(int num, int start) {
        if (start == n) {
            max_ans = Math.max(max_ans, num);
            min_ans = Math.min(min_ans, num);
        }

        for (int i = 0; i < 4; i++) {
            if (math[i] > 0) {

                math[i]--;

                switch (i) {
                    case 0: dfs(num + number[start], start+1); break;
                    case 1: dfs(num - number[start], start+1); break;
                    case 2: dfs(num * number[start], start+1); break;
                    case 3: dfs(num / number[start], start+1); break;
                }

                math[i]++;
            }
        }
    }
}

