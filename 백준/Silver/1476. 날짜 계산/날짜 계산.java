import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 처리
        String[] num = br.readLine().split(" ");
        int e = Integer.parseInt(num[0]);
        int s = Integer.parseInt(num[1]);
        int m = Integer.parseInt(num[2]);

        // 현재 값을 1로 초기화
        int year = 1;

        // 반복하여 연도를 계산
        while (true) {
            // 조건이 모두 맞으면 종료
            if ((year - e) % 15 == 0 && (year - s) % 28 == 0 && (year - m) % 19 == 0) {
                break;
            }
            year++;
        }

        // 결과 출력
        System.out.println(year);
    }
}
