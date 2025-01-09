class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int plen = p.length();
        long pval = Long.parseLong(p);
        
        for (int i =0; i <= t.length() - plen; i++) {
            String sub = t.substring(i,i + plen);
            long subval = Long.parseLong(sub);
            if (subval <= pval) {
                answer++;
            }
        }
        
        return answer;
    }
}