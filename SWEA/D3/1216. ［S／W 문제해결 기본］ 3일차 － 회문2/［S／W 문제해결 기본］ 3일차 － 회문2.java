
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);


		for(int test_case = 1; test_case <= 10; test_case++)
		{
		
			int N = sc.nextInt();
            String[][] list = new String[100][100];
            
            sc.nextLine();
            for(int i =0; i<100; i++) {
                String s = sc.nextLine();
            	for(int j =0; j<100;j++) {
                	list[i][j] = String.valueOf(s.charAt(j));
                }
            }
            
            int maxLen = 0;
            int count = 0;
            // 가로 회문 검사
            for (int i =0; i < 100; i++){
            	for(int j = 0; j< 100; j++){
                	String s = "";
                    s = list[i][j];
                    for(int k = j+1; k < 100; k++){
                    	s += list[i][k];
                        int len = s.length();
                        String left= "";
                        String right = "";
                        if ( len % 2 == 0) {
                        	left = s.substring(0,len/2);
                        	right = s.substring(len/2);
                        } else {
                        	left = s.substring(0,len/2);
                            right = s.substring((len/2)+1);
                        }
                        
                        String reverseRight = new StringBuilder(right).reverse().toString();
                        
                        if(left.equals(reverseRight)) {
                        	maxLen = Math.max(maxLen, len);
                        }
                    }
                }
            }

            for (int j = 0; j < 100; j++) {      // 각 열
                for (int i = 0; i < 100; i++) {  // 각 행 시작점
                    String s = "";
                    for (int k = i; k < 100; k++) {
                        s += list[k][j];  // 세로로 문자열 누적
                        int len = s.length();
                        String left = "", right = "";
                        if (len % 2 == 0) {
                            left = s.substring(0, len / 2);
                            right = s.substring(len / 2);
                        } else {
                            left = s.substring(0, len / 2);
                            right = s.substring((len / 2) + 1);
                        }
                        String reversedRight = new StringBuilder(right).reverse().toString();
                        if (left.equals(reversedRight)) {
                            maxLen = Math.max(maxLen, len);
                        }
                    }
                }
            }
            
            System.out.println("#" + N + " " + maxLen);
		}
	}
}