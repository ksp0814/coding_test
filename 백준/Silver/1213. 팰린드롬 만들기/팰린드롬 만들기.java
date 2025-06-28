import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }
        
        int oddCount = 0;
        char oddChar = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 == 1) {
                oddCount++;
                oddChar = (char)('A' + i);
            }
        }
        
        if (oddCount > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < count[i] / 2; j++) {
                sb.append((char)('A' + i));
            }
        }
        
        StringBuilder result = new StringBuilder(sb);
        if (oddCount == 1) result.append(oddChar);
        result.append(sb.reverse());
        
        System.out.println(result);
    }
}
