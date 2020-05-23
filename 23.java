class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> res = new ArrayList<>();
        int aLen = 0, bLen = 0;
        while(aLen < A.length && bLen < B.length){
            int posA = Math.max(A[aLen][0], B[bLen][0]);
            int posB = Math.min(A[aLen][1], B[bLen][1]);
            if(posA <= posB)
                res.add(new int[]{posA, posB});
            if(A[aLen][1] < B[bLen][1])
                aLen++;
            else
                bLen++;
        }
        return res.toArray(new int[res.size()][]);
    }
}