

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String str = sc.next();

            if (str.equals("push")) {
                stack.push(sc.nextInt());
            } else if (str.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else System.out.println(stack.pop());
            } else if (str.equals("size")) {
                System.out.println(stack.size());
            } else if (str.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println("1");
                } else System.out.println("0");
            } else if (str.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else System.out.println(stack.peek());
            }
        }
    }
}
