import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < N; i++) { // 리스트에 채널 리스트 추가
            list.add(br.readLine());
        }

        // KBS1 찾기
        int kbs1 = list.indexOf("KBS1");

        // KBS1으로 화살표 이동
        for (int i = 0; i < kbs1; i++) {
            ans.add(1);
        }

        // KBS1을 맨 위로 이동
        for (int i = 0; i < kbs1; i++) {
            ans.add(4);
        }

        // KBS1을 맨 위로 이동한 후의 리스트 상태 반영
        String temp = list.get(kbs1);
        for (int i = kbs1; i > 0; i--) {
            list.set(i, list.get(i - 1));
        }
        list.set(0, temp);

        // KBS2 찾기 (리스트가 업데이트된 후)
        int kbs2 = list.indexOf("KBS2");

        // 화살표를 KBS2로 이동 (화살표는 현재 KBS1이 있는 0번 위치에 있음)
        for (int i = 0; i < kbs2; i++) {
            ans.add(1);
        }

        // KBS2를 두 번째 위치로 이동
        for (int i = 0; i < kbs2 - 1; i++) {
            ans.add(4);
        }

        // 최종 결과 출력
        for (int s : ans) System.out.print(s);
    }
}