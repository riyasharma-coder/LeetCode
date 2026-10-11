class Solution {
    
    public void dfs(int i, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        if(vis[i]) return;

        vis[i] = true;

        for(int nei : adj.get(i)){
            dfs(nei, vis, adj);
        }
    }
    public int findCircleNum(int[][] grid) {
        int n = grid.length;
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && grid[i][j] == 1) {
                    adj.get(i).add(j);
                }
             }
        }

        boolean[] vis = new boolean[n];

        int count = 0;
        for(int i=0; i<n; i++){
            if(!vis[i]){
                dfs(i, vis, adj);
                count++;
            }
        }
        
        return count;
    }
}