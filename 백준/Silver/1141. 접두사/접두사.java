import java.io.*;
import java.util.*;

// 접두사X 집합이란 집합의 어떤 한 단어가, 다른 단어의 접두어가 되지 않는 집합이다.

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        
        Arrays.sort(arr, (a, b) -> a.length() - b.length()); // 단어 길이를 기준으로 짧은 순서대로 정렬
        
        List<String> selected = new ArrayList<>(); // 선택된 단어들을 넣을 공간
        
        for (int i = 0; i < n; i++) {
            boolean check = false;
            for (int j = i+1; j < n; j++) {
                if (arr[j].startsWith(arr[i])) {  // startWith() 해당하는 단어로 시작하면 true 아니면 false, endWith() 해당하는 단어로 끝나는지 체크
                                                // 여기서는 왜 startWith() 썻냐면 짧은 단어 순으로 정렬을 해놨기 때문에 사용했다.
                    check = true;
                    break;
                }
            }

            if (!check) selected.add(arr[i]);
        }
        
        System.out.println(selected.size());
    }
}
