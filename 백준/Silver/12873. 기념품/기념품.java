import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 참가자 수 입력하고

        Queue<Integer> que = new LinkedList<>(); //큐 만들고

        for (int i = 1; i <= N; i++) { //큐에 n만큼 추가하고
            que.offer(i);
        }

        int level = 1; // 단계 1단계부터 시작하고

        while (que.size() > 1) {    //que의 사이즈가 1이 될만큼
            long cnt = (long) Math.pow(level, 3); //cnt t의 세제곱만큼
            cnt = (cnt - 1 ) % que.size(); // 필요한 이동 횟수 최적화

            for (int i = 0; i < cnt; i++) {
                que.offer(que.poll());
            }

            que.poll(); // 큐에서 제거
            level++;
        }

        System.out.println(que.poll()); // 최종 남은 참가자 출력
    }
}
