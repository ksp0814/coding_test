

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] list = new int[n];

        for (int i =0; i<n; i++){
            list[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        int num = 1;
        int idx = 0;

        StringBuilder sb = new StringBuilder();

        while (idx < n) {
            if (!stack.isEmpty() && stack.peek() == list[idx]) {
                stack.pop();
                sb.append("-\n");
                idx++;
            } else if (num <= n) {
                stack.push(num++);
                sb.append("+\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);
    }
}
