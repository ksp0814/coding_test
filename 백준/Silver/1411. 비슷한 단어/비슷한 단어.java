import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] words = new String[n];
        
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isSame(words[i], words[j])) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
    
    static boolean isSame(String a, String b) {
        
        int[] A = new int[26];
        int[] B = new int[26];
        
        for (int i = 0; i < a.length(); i++) {
            char chA = a.charAt(i);
            char chB = b.charAt(i);
            
            if (A[chA - 'a'] == 0 && B[chB - 'a'] == 0) {
                A[chA - 'a'] = chB;
                B[chB - 'a'] = chA;
            } else if (A[chA - 'a'] != chB || B[chB - 'a'] != chA) { // 규칙이 이미 존재하고 규칙이 맞다면 여기 
                // 규칙이 존재하고 맞다면 여기 else if 문을 거치지 않고 그대로 통과
                return false;
            }
        }
        
        return true;
    }
}
