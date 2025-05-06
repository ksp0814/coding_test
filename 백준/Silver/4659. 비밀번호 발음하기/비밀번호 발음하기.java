import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] mo = {'a','e','i','o','u'};
        while (true) {
            String s = br.readLine();

            if(s.equals("end")) break;

            boolean mocheck = false; // 모음을 포함하는지 확인


            // 모음을 하나라도 반드시 포함하여야 한다.
            // 모음이 3개 혹은 자음이 3개 연속으로 오면 안된다. -> substring(0,3) 이런 식으로 자르면 되자나
            // 같은 글자가 연속적으로 두번 오면 안된다.
            // ee와 oo는 허용된다.

            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < mo.length; j++) {
                    if(s.charAt(i) == mo[j]) { // 모음을 하나라도 가지고 있는지 확인 and 모음의 갯수를 추가하려고
                        mocheck = true;
                        break;
                    }
                }
            }

            if(mocheck) {
                for (int i = 0; i < s.length() - 2; i++) {
                    int moo = 0;
                    int ja = 0;
                    for (int j = 0; j < 3; j++) {
                        char ch = s.charAt(i + j);
                        boolean isMo = false;
                        for (int k = 0; k < mo.length; k++) {
                            if (ch == mo[k]) {
                                isMo = true;
                                break;
                            }
                        }
                        if (isMo) moo++;
                        else ja++;
                    }
                    if (moo == 3 || ja == 3) {
                        mocheck = false;
                        break;
                    }
                }
            }

            if (mocheck) {
                for (int i = 0; i < s.length() - 1; i++) {
                    String s1 = s.substring(i, i + 2);
                    if(s1.charAt(0) == s1.charAt(1) && !(s1.charAt(0) == 'e' || s1.charAt(0) == 'o')) {
                        mocheck = false;
                        break;
                    }

                }
            }

            if(mocheck) System.out.println("<" + s + ">" + " is acceptable.");
            if(!mocheck) System.out.println("<" + s + ">" + " is not acceptable.");

        }
    }
}
