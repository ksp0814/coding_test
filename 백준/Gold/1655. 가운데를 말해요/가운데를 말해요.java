import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        PriorityQueue<Integer> right = new PriorityQueue<>();
        PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();
            if (left.isEmpty() || left.peek() >= num) {
                left.add(num);
            } else {
                right.add(num);
            }

            if(left.size() > right.size() + 1) {
                right.add(left.poll());
            }
            else if ( right.size() > left.size()) {
                left.add(right.poll());
            }

            sb.append(left.peek()).append("\n");
        }
        System.out.print(sb);
    }


}

