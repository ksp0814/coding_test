

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        int i = 0;

        while (i < input.length()) {
            char c = input.charAt(i);

            if (c == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }

                while (i < input.length() && input.charAt(i) != '>') {
                    sb.append(input.charAt(i));
                    i++;
                }
                sb.append('>');
                i++;
            }

            else if (c == ' ') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(' ');
                i++;
            }

            else {
                stack.push(c);
                i++;
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb.toString());
    }
}
