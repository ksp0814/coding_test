
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 끊어진 줄의 개수
        int m = Integer.parseInt(st.nextToken()); // 브랜드 개수

        List<Integer> six = new ArrayList<>();
        List<Integer> one = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            six.add(Integer.parseInt(st.nextToken())); // 6줄 가격
            one.add(Integer.parseInt(st.nextToken())); // 1줄 가격
        }

        // 패키지와 낱개 가격 정렬 (가장 싼 가격이 먼저 오도록)
        Collections.sort(six);
        Collections.sort(one);

        // 1. 패키지만 사는 경우
        int cost1 = ((n + 5) / 6) * six.get(0); // 올림 처리

        // 2. 낱개로만 사는 경우
        int cost2 = n * one.get(0);

        // 3. 패키지를 최대한 사고, 부족한 개수를 낱개로 사는 경우
        int cost3 = (n / 6) * six.get(0) + (n % 6) * one.get(0);

        // 가장 저렴한 비용 선택
        int ans = Math.min(cost1, Math.min(cost2, cost3));

        System.out.println(ans);
    }
}
