import java.util.*;
class Solution {
    public int solution(int N, int number) {
        int answer = 0;
        // 숫자 N과 사칙연산을 사용해서 number를 만들면 되는거잔아
        // N을 최소로 쓰는 방법을 찾는거니까 
        // N을 겹쳐서 사용할 수도 있네 55가 나올수도 있으니까 그럼 총5개의 반복을 돌아야겟네
        
        if(N == number) {
            return 1;
        }
        
        List<Set<Integer>> dp = new ArrayList<>();
        
        for (int i =0; i <= 8; i++) {
            dp.add(new HashSet<>());
        }
        
        for(int i =1; i <= 8; i++) {
            int tmp = Integer.parseInt(String.valueOf(N).repeat(i));
            dp.get(i).add(tmp);
        
        
        for(int j =1; j <i; j++) {
            Set<Integer> set1 = dp.get(j);
            Set<Integer> set2 = dp.get(i - j);
            
            for(int a : set1) {
                for (int b : set2) {
                    dp.get(i).add(a+b);
                    dp.get(i).add(a-b);
                    dp.get(i).add(b-a);
                    dp.get(i).add(a*b);
                    
                    if( b!= 0) dp.get(i).add(a/b);
                    if( a != 0) dp.get(i).add(b/a);
                }
            }
        }
        if(dp.get(i).contains(number)) {
            return i;
        }
    }
        return -1;
    }
}