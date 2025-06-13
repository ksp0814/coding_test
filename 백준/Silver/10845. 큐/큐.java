

import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Deque<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals("push")) {
                q.add(sc.nextInt());
            } else if (s.equals("pop")) {
                if (q.isEmpty()) {
                    System.out.println("-1");
                } else System.out.println(q.poll());
            } else if (s.equals("size")) {
                System.out.println(q.size());
            } else if (s.equals("empty")) {
                if (q.isEmpty()) {
                    System.out.println("1");
                } else System.out.println("0");
            } else if (s.equals("front")) {
                if (q.isEmpty()) {
                    System.out.println("-1");
                } else System.out.println(q.peekFirst());
            } else if (s.equals("back")) {
                if (q.isEmpty()) {
                    System.out.println("-1");
                } else System.out.println(q.peekLast());
            }
        }
    }
}
