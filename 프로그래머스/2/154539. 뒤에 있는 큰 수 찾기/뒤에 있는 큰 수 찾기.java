import java.io.*;
import java.util.*;

public class Solution {
    public static int[] solution(int[] numarr) {
        int n = numarr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);  // 기본적으로 -1로 채움
        
        Stack<Integer> stack = new Stack<>();  // 더 큰 값을 저장하는 스택

        // 오른쪽에서 왼쪽으로 탐색
        for (int i = n - 1; i >= 0; i--) {
            // 현재 값보다 작은 값은 의미가 없으므로 제거
            while (!stack.isEmpty() && stack.peek() <= numarr[i]) {
                stack.pop();
            }

            // 스택이 비어있지 않다면, 스택의 최상단이 현재 값보다 큰 값 중 가장 가까운 값
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }

            // 현재 값을 스택에 추가
            stack.push(numarr[i]);
        }

        return result;
    }
}