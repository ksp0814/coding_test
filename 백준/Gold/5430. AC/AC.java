

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            String s = sc.next();
            int n = sc.nextInt();

            List<Integer> list = new ArrayList<>();
            String ss = sc.next();
            ss = ss.replaceAll("\\[|\\]", "");

            if (!ss.isEmpty()) {
                String[] parts = ss.split(",");
                for (String part : parts) {
                    list.add(Integer.parseInt(part));
                }
            }

            boolean reverse = false;
            boolean errorcheck = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'R') {
                    reverse = !reverse;
                } else if (s.charAt(i) == 'D') {
                    if (list.isEmpty()) {
                        errorcheck = true;
                        break;
                    }
                    if (reverse) {
                        list.remove(list.size() - 1);
                    } else {
                        list.remove(0);
                    }
                }
            }

            if(errorcheck){
                System.out.println("error");
            } else {

                if (reverse) {
                    Collections.reverse(list);
                }
                StringBuilder sb = new StringBuilder("[");
                if(!list.isEmpty()){
                    for (int i = 0; i < list.size(); i++) {
                        sb.append(list.get(i));
                        if(i < list.size()-1){
                            sb.append(",");
                        }
                    }
                }
                sb.append("]");
                System.out.println(sb);
            }
        }
    }
}
