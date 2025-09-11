class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        int hour = Integer.parseInt(pos.substring(0,2));
        int min = Integer.parseInt(pos.substring(3));
        
        int last_hour = Integer.parseInt(video_len.substring(0,2));
        int last_min = Integer.parseInt(video_len.substring(3));
        
        int op_start_hour = Integer.parseInt(op_start.substring(0,2));
        int op_end_hour = Integer.parseInt(op_end.substring(0,2));
        int op_start_min = Integer.parseInt(op_start.substring(3));
        int op_end_min = Integer.parseInt(op_end.substring(3));
        
        // 초기 위치가 오프닝 구간에 있는지 체크 (추가됨)
        int cur = hour * 60 + min;
        int start = op_start_hour * 60 + op_start_min;
        int end = op_end_hour * 60 + op_end_min;
        
        if(cur >= start && cur <= end) {
            cur = end;
            hour = cur / 60;
            min = cur % 60;
        }
        
        for(int i = 0; i < commands.length; i++) {
            
            if(commands[i].equals("next")) {
                int temp_hour = hour;
                int temp_min = min + 10;
                
                if(temp_min >= 60) {
                    temp_hour +=1;
                    temp_min -= 60;
                }
                
                if(temp_hour > last_hour || (temp_hour == last_hour && temp_min > last_min)) {
                    hour = last_hour;
                    min = last_min;
                } else {
                    hour = temp_hour;
                    min = temp_min;
                }
            } else if( commands[i].equals("prev")) {
               if(hour == 0 && min - 10 < 0) {
                   hour = 0;
                   min = 0;
               } else if(min >= 10) {
                   min -= 10;
               } else {
                   hour -= 1;
                   min = min + 50;
               }
            }
            
            // 오프닝 구간 체크 로직 단순화
            cur = hour * 60 + min;
            
            if(cur >= start && cur <= end) {
                cur = end;
                hour = cur / 60;
                min = cur % 60;
            }
        }
        
        answer = String.format("%02d:%02d", hour, min);
        return answer;
    }
}