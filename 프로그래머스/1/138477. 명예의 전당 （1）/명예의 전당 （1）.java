import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        int[] res = new int[score.length];
        for (int i = 0; i < score.length; i++){ // score의 배열 길이 만큼 반복을 한다.
            que.offer(score[i]);
            
            if(que.size() > k) {
                que.poll();
            }
            res[i] = que.peek();
        }
        return res;
    }
}