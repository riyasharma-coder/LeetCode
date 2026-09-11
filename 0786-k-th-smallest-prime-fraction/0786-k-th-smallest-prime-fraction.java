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

        PriorityQueue<Pair> pq =
            new PriorityQueue<>((a,b) -> Double.compare(a.frac, b.frac));

        int n = arr.length;

        // Put the smallest fraction for every denominator
        for(int j=1; j<n; j++){
            pq.add(new Pair(
                (double)arr[0] / arr[j],
                0,
                j
            ));
        }

        // Get kth smallest
        for(int count=0; count<k; count++){

            Pair curr = pq.poll();

            if(count == k-1){
                return new int[]{arr[curr.i], arr[curr.j]};
            }

            // Move to next numerator for same denominator
            if(curr.i + 1 < curr.j){
                int i = curr.i + 1;
                int j = curr.j;

                pq.add(new Pair(
                    (double)arr[i] / arr[j],
                    i,
                    j
                ));
            }
        }

        return new int[]{};
    }
}