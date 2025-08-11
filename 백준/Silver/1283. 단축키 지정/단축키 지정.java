import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Set<Character> used = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            boolean assigned = false;

            // 1) 각 단어의 첫 글자 검사 (문자열을 직접 스캔해서 단어 시작 인덱스 찾기)
            for (int j = 0; j < line.length(); j++) {
                if (j == 0 || line.charAt(j - 1) == ' ') {
                    char ch = line.charAt(j);
                    if (ch == ' ') continue; // 혹시 연속 공백이면 건너뛰기
                    char lower = Character.toLowerCase(ch);
                    if (!used.contains(lower)) {
                        used.add(lower);
                        line = line.substring(0, j) + "[" + ch + "]" + line.substring(j + 1);
                        assigned = true;
                        break;
                    }
                }
            }

            // 2) 아직 지정 안 됐으면 문자열 전체에서 왼쪽부터 가능한 문자 찾기
            if (!assigned) {
                for (int j = 0; j < line.length(); j++) {
                    char ch = line.charAt(j);
                    if (ch == ' ') continue;
                    // 대괄호가 이미 삽입된 경우 '[]' 때문에 ch가 '['일 수 있으므로
                    // 원래 문자를 검사하려면 먼저 대괄호가 없는 원본을 검사해야 함.
                    // 지금은 대괄호가 없는 상태에서만 진입하므로 안전.
                    char lower = Character.toLowerCase(ch);
                    if (!used.contains(lower)) {
                        used.add(lower);
                        line = line.substring(0, j) + "[" + ch + "]" + line.substring(j + 1);
                        assigned = true;
                        break;
                    }
                }
            }

            System.out.println(line);
        }
    }
}
