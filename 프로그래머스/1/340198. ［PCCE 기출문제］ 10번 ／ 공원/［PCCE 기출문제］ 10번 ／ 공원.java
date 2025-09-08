class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        
        for(int i = 0; i < mats.length; i++) {
            int temp = mats[i];
            
            for(int j = 0; j<= park.length - temp; j++) {
                for(int k = 0; k <= park[0].length - temp; k++) {
                    if(park[j][k].equals("-1")) {
                        boolean check = true;
                        for(int x = 0; x < temp; x++) {
                            for(int y = 0; y < temp; y++) {
                                if(!park[j+x][k+y].equals("-1")) {
                                    check = false;
                                    break;
                                }
                            }
                            if(!check) break;
                        }
                        if(check) {
                            answer = Math.max(answer,temp);
                        }
                    }
                }
            }
        }
        if(answer == 0){
            return -1;
        }
        
        return answer;
    }
}