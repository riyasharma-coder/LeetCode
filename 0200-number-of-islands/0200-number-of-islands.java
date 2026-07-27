class Solution {
    public void bfs(int i, int j, char[][] grid, boolean[][] vis){
        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> q = new LinkedList<>();    
        q.add(new int[]{i,j});

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int row = curr[0];
            int col = curr[1];

            for(int k=0; k<4; k++){
                int nr = row + dr[k];
                int nc = col + dc[k];

                if(nr>=0 && nc>=0 && nr<n && nc<m &&
                    grid[nr][nc]!='0' && !vis[nr][nc]){
                        q.add(new int[]{nr, nc});
                        vis[nr][nc]= true;
                    }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]!='0' && !vis[i][j]){
                    bfs(i,j,grid, vis);
                    cnt++;
                }
            }
        }
        return  cnt;
    }
}