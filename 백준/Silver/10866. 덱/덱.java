

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals("push_back")) {
                stack.addLast(sc.nextInt());
            } else if (s.equals("push_front")) {
                stack.addFirst(sc.nextInt());
            } else if (s.equals("pop_front")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else System.out.println(stack.removeFirst());
            } else if (s.equals("pop_back")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else System.out.println(stack.removeLast());
            } else if (s.equals("size")) {
                System.out.println(stack.size());
            } else if (s.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (s.equals("front")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.peekFirst());
                }
            } else if (s.equals("back")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.peekLast());
                }
            }
        }
    }
}
