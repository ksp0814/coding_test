

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();

        System.out.println(Solution(input));
    }

    static String Solution(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        if (input.length() == 2) {
            return "(1+1)";
        }

        for (int i = 0; i < input.length(); i++) {
            stack.offerLast(input.charAt(i));
        }

        boolean check = true;

        while (check) {
            if (stack.size()==2) {
                check = false;
            }

            char L = stack.pollFirst();
            char R = stack.pollFirst();

            if (L == ')' && R == '(') {
                sb.append(L);
                sb.append('+');
            }

            else if (L == '(' && R == ')') {
                sb.append(L);
                sb.append('1');
            } else {
                sb.append(L);
            }
            stack.offerFirst(R);
            if (check == false) sb.append(R);
        }
        String result = String.valueOf(sb);
        return result;
    }
}
