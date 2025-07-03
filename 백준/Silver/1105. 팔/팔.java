import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();

        int ans = 0;
        String l_str = String.valueOf(l);
        String r_str = String.valueOf(r);
        
        // 길이가 같고 앞자리부터 같은 경우에만 처리
        if (l_str.length() == r_str.length()) {
            int len = l_str.length();
            
            for (int i = 0; i < len; i++) {
                char l_c = l_str.charAt(i);
                char r_c = r_str.charAt(i);
                
                if (l_c == r_c && l_c == '8') {
                    ans++;
                } else if (l_c != r_c) {
                    break; // 다른 자리가 나오면 더 이상 확인할 필요 없음
                }
            }
        }
        
        System.out.println(ans);
    }
}
