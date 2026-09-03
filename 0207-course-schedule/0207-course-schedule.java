class Solution {
    public boolean dfs(int node, boolean[] vis,boolean[] path, ArrayList<ArrayList<Integer>> adj){
        vis[node] = true;
        path[node] = true;
        
        for(int nei : adj.get(node)){
            if(!vis[nei]){
                if(dfs(nei, vis, path, adj)){
                    return true;
                }
            }else if(vis[nei] && path[nei]){
                return true;
            }
        }
        path[node] = false;
        
        return false;
    }
    public boolean canFinish(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int p = edge[0];
            int q = edge[1];

            adj.get(p).add(q);
        }
        
        boolean[] vis = new boolean[V];
        boolean[] path = new boolean[V];
        
        for(int i=0; i<V; i++){
            if(!vis[i]){
                if(dfs(i, vis, path, adj)){
                    return false;
                }
            }
        }
        return true;
    }
}