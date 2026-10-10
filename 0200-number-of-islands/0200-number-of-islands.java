class Solution {
    public void dfs(int p, int q, char[][] grid, boolean[][] vis){
        int n = grid.length;
        int m = grid[0]. length;
        if (p < 0 || p >= n || q < 0 || q >= m || grid[p][q]=='0'|| vis[p][q]==true){
            return;
        }
        vis[p][q] = true;

        int i=p;
        int j=q;

        dfs(i+1, j, grid, vis);
        dfs(i, j-1, grid, vis);
        dfs(i, j+1, grid, vis);
        dfs(i-1, j, grid, vis);
        
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0]. length;

        boolean[][] vis = new boolean[n][m];

        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    dfs(i+1, j, grid, vis);
                    dfs(i, j-1, grid, vis);
                    dfs(i, j+1, grid, vis);
                    dfs(i-1, j, grid, vis);

                    count++;
                }
            }
        }
        return count;
    }
}