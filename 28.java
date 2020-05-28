class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        res[0] = 0;
        
        for(int i=1;i<=num;i++){
            res[i] = res[i/2] + i%2; //if i is even same bits as i/2 and if it's odd 1+no.of bits at i/2
        }
        return res;
    }
}