import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for ( int i = 1 ; i<=input; i++){
            queue.offer(i);
        }
        int temp = 0;
        int ans = 0;

        while (queue.size()!=1) {
            queue.poll();
            temp = queue.poll();
            queue.offer(temp);
        }
        System.out.println(queue.peek());
    }
}
