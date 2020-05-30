class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(K,(p1,p2) -> (p2[0] * p2[0] + p2[1] * p2[1]) - (p1[0] * p1[0] + p1[1] * p1[1]));
        
        for(int[] p: points){
            pq.offer(p);
            if(pq.size() > K)
                pq.poll();
        }
        
        // int[][] ans = new int[K][2];
        // while(K > 0){
        //     K--;
        //     ans[K] = pq.poll();
        // }
        return pq.toArray(new int[K][2]);
    }
}