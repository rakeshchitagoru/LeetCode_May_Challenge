class Solution {
    public int minDistance(String word1, String word2) {
        int wlen1 = word1.length();
        int wlen2 = word2.length();
        
        int[][] ans = new int[wlen1+1][wlen2+2];
        for(int i=0;i<=wlen1;i++){
            ans[i][0] = i;
        }
        for(int i=0;i<=wlen2;i++){
            ans[0][i] = i;
        }
        for(int i=1;i <= wlen1;i++){
            for(int j=1;j <= wlen2;j++){
                if(word1.charAt(i-1) == word2.charAt(j-1))
                    ans[i][j] = ans[i-1][j-1];
                else
                    ans[i][j] = Math.min(ans[i-1][j-1], Math.min(ans[i-1][j], ans[i][j-1]))+1;
            }
        }
        return ans[wlen1][wlen2];
    }
}