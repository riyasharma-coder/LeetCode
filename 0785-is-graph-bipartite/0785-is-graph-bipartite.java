class Solution {
    public boolean isBipartite(int[][] graph) {

        int[] vis = new int[graph.length];
        Arrays.fill(vis, -1);

        for(int i=0; i<graph.length; i++){
           
            if(vis[i]==-1){// not colored yet
                Queue<Integer> q = new LinkedList<>();

                vis[i] = 0;
                q.offer(i);

                while(!q.isEmpty()){
                    int node = q.poll();

                    for(int nei : graph[node]){
                        if(vis[nei]==-1){
                            vis[nei] = 1-vis[node];
                            q.offer(nei);
                        }else{
                            if(vis[nei]==vis[node]){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}