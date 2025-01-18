import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken()); // 직사각형 너비
        int H = Integer.parseInt(st.nextToken()); // 직사각형 높이
        int X = Integer.parseInt(st.nextToken()); // 직사각형의 왼쪽 위 X 좌표
        int Y = Integer.parseInt(st.nextToken()); // 직사각형의 왼쪽 위 Y 좌표
        int P = Integer.parseInt(st.nextToken()); // 점의 개수

        int R = H / 2; // 원의 반지름
        int ans = 0;

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            int px = Integer.parseInt(st.nextToken()); // 점의 X 좌표
            int py = Integer.parseInt(st.nextToken()); // 점의 Y 좌표

            // 직사각형 내부에 있는지 확인
            boolean insideRectangle = (px >= X && px <= X + W && py >= Y && py <= Y + H);

            // 왼쪽 원 내부에 있는지 확인
            boolean insideLeftCircle = Math.pow(px - X, 2) + Math.pow(py - (Y + R), 2) <= R * R;

            // 오른쪽 원 내부에 있는지 확인
            boolean insideRightCircle = Math.pow(px - (X + W), 2) + Math.pow(py - (Y + R), 2) <= R * R;

            // 조건 중 하나라도 만족하면 포함
            if (insideRectangle || insideLeftCircle || insideRightCircle) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
