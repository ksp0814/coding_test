
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 마을의 수
        int C = Integer.parseInt(st.nextToken()); // 트럭의 용량
        int M = Integer.parseInt(br.readLine()); // 보내는 박스 개수

        int[][] arr= new int[M][3];
        int count = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int box = Integer.parseInt(st.nextToken());

            arr[i][0] = start;
            arr[i][1] = end;
            arr[i][2] = box;
        }

        Arrays.sort(arr, ((x,y) -> { // 도착 마을 번호 기준 오름차순 정렬
            if (x[1] == y[1]) { // 도착지가 같으면 출발 마을 번호를 기준으로 오름차순
                return x[0] - y[0];
            }
            return x[1] - y[1];
        }));

        int[] boxes = new int[N + 1];
        for (int i = 0; i < N; i++) {
            boxes[i] = C;
        }

        for (int i =0; i< arr.length; i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            int box = arr[i][2];

            int w = Integer.MAX_VALUE;

            for (int j = start; j < end; j++) {
                w = Math.min(w, boxes[j]);
            }

            for (int j =start; j < end; j++) {
                boxes[j] -= Math.min(w,box);
            }

            count += Math.min(w,box);
        }
        System.out.println(count);
    }
}
