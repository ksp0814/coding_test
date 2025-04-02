import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length() - 1; i++) {
            sb.append(s.charAt(i));

            if( s.charAt(i) == '(' && s.charAt(i+1) == ')'){
                sb.append('1');
            } else if (s.charAt(i) ==')' && s.charAt(i+1) == '('){
                sb.append('+');
            }
        }
        sb.append(s.charAt(s.length()-1));

        System.out.println(sb.toString());
        
    }
}
