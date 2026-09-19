class DSU{
    int[] parent;
    int[] rank;

    DSU(int n){
        parent = new int[n];
        rank = new int[n];
        
        for(int i=0; i<n; i++){
            parent[i] = i;
        }
    }
}
class Solution {
    public int find(int i, int[] parent){
        if(i==parent[i]){
            return i;
        }

        return parent[i] = find(parent[i], parent);
    }
    public void union(int x, int y, int[] parent, int[] rank){

        int xparent = find(x, parent);
        int yparent = find(y, parent);
        
        if(xparent == yparent){
            return;
        }
        
        if(rank[xparent] > rank[yparent]){
            parent[yparent] = xparent;
        }
        else if(rank[xparent] < rank[yparent]){
            parent[xparent] = yparent;
        }
        else{
            parent[xparent] = yparent;
            rank[yparent]++;
        }
    }

    public int makeConnected(int n, int[][] connections) {
        
        if(connections.length < n-1){
            return -1;
        }

        DSU dsu = new DSU(n);

        int component = n;

        for(int[] connection : connections){
            int x = connection[0];
            int y = connection[1];

            int xparent = find(x, dsu.parent);
            int yparent = find(y, dsu.parent);

            if(xparent != yparent){
                union(x, y, dsu.parent, dsu.rank);
                component--;
            }
        }
        return component-1;
    }
}