import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String s = "";
        
        for(int i = 0; i < a; i++) {
            s+= "*";
        }
        
        for(int i =0; i < b; i++) {
            System.out.println(s);
        }
    }
}