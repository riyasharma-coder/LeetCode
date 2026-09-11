class Pair{
    double frac;
    int i; 
    int j;
    Pair(double frac, int i, int j){
        this.frac = frac;
        this.i = i;
        this.j = j;
    }
}
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Double.compare(a.frac, b.frac));

        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n; j++){
                pq.add(new Pair((double) arr[i] / arr[j], arr[i], arr[j]));
            }
        }
        
        for(int i=0; i<k; i++){
            Pair curr = pq.poll();

            if(i == k - 1) {
                return new int[]{curr.i, curr.j};
            }
        }
        return new int[]{};
    }
}