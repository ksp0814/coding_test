import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int st = Integer.parseInt(br.readLine());

        // 리스트 생성
        List<Integer> vote = new ArrayList<>();

        // n명의 국회의원 투표수 리스트
        for(int i = 0; i < st; i++) {
            vote.add(Integer.parseInt(br.readLine()));
        }

        // 다솜이는 무조건 리스트[0]번째
        int dasom = vote.get(0);
        int count = 0;

        while (true) {
            // 가장 많은 특표 수
            int maxvote = 0;
            // 가장 많은 득표 수를 가진 인덱스 순서
            int maxvoteindex = 0;

            for (int i =1; i < vote.size(); i++) {
                if (vote.get(i) > maxvote) {
                    maxvote = vote.get(i);
                    maxvoteindex = i;
                }
            }

            if (dasom > maxvote) {
                break;
            }

            vote.set(maxvoteindex, vote.get(maxvoteindex) - 1);
            dasom++;
            count++;
        }

        System.out.println(count);

    }
}
