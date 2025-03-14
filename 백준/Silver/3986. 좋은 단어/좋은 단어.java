

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (char ch : word.toCharArray()) { // .toCㅁharArray String 문자열을 char형 배열로 바꿔서 반환해주는 메서드
                if (!stack.isEmpty() && stack.peek() == ch) { // stack.peek() <- 스택의 마지막 요소를 반환
                    stack.pop(); // stack.pop() <- 스택의 마지막 값을 제거와 해당 값을 반환.
                } else {
                    stack.push(ch);
                }
            }

            if (stack.isEmpty()) {
                count++;
            }

        }
        System.out.println(count);
    }
}
