import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        String s;
        int count = 0;

        while ((s = br.readLine()) != null && !s.isEmpty()) {
            // 입력된 나무 이름을 해시맵에 저장
            map.put(s, map.getOrDefault(s, 0) + 1);
            count++;
        }

        // 키들을 사전순으로 정렬
        List<String> keys = new ArrayList<>(map.keySet());
        keys.sort(String::compareTo);

        // 비율을 계산하고 출력
        for (String key : keys) {
            double percentage = (map.get(key) * 100.0) / count;
            System.out.printf("%s %.4f\n", key, percentage);
        }
    }
}
