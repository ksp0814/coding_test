
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Long.sum;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int cnt = 0;
        int ans = 0;
        String input = br.readLine();
        String[] inputArr = input.split(" ");

        List<Integer> numberList = new ArrayList<>();
        List<Integer> sumList = new ArrayList<>();
        // 문자열 배열을 정수 리스트로 변환
        for (String s : inputArr) {
            numberList.add(Integer.parseInt(s));  // 문자열을 정수로 변환 후 리스트에 추가
        }


        numberList.sort(Integer::compareTo);


        for(int i = 0; i < tc; i++) {
            cnt = numberList.get(i)+cnt;
            sumList.add(cnt);
        }

        
        for (int i = 0; i < sumList.size(); i++) {
            ans += sumList.get(i);
        }

        System.out.println(ans);

    }
}
