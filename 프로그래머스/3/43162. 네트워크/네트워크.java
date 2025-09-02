class Solution {
    static boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(i,computers);
                answer++;
            }
        }      
        return answer;
    }
    
    public void dfs(int temp, int[][] computers) {
        visited[temp] = true;
        
        for(int i = 0; i < computers[temp].length; i++) {
            if(computers[temp][i] == 1 && !visited[i]) {
                dfs(i,computers);
            }
        }
    }
}