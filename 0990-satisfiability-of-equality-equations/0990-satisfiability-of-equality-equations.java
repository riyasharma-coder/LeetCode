class DSU{
    int[] parent;
    int[] rank;
    
    DSU(int V){
        parent = new int[V];
        rank = new int[V];
        
        for(int i=0; i<V; i++){
            parent[i] = i;
        }
    }
}

class Solution {

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
    
    public int find(int i, int[] parent){

        if(i == parent[i]){
            return i;
        }

        return parent[i] = find(parent[i], parent);
    }

    public boolean equationsPossible(String[] eq) {
        DSU dsu = new DSU(26);

        for(String s : eq){
            if(s.charAt(1)=='='){
                int x = s.charAt(0)-'a';
                int y = s.charAt(3)-'a';

                union(x, y, dsu.parent, dsu.rank);
            }
        }

        for(String s : eq){

            if(s.charAt(1) == '!'){

                int x = s.charAt(0) - 'a';
                int y = s.charAt(3) - 'a';

                if(find(x, dsu.parent) == find(y, dsu.parent)){
                    return false;
                }
            }
        }

        return true;
    }
}