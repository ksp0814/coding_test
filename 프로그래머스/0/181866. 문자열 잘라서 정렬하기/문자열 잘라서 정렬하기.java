import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for(String s : answer) {
            if(!s.isEmpty()){
                list.add(s);
            }
        }
        
        Collections.sort(list);
        
        
        // .split("x") 를 기준으로 문자열을 자르면 된다 그리고 그거를 하나 씩 배열안에 넣고 정렬
        
        
        return list.toArray(new String[0]);
    }
}