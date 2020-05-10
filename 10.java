class Solution {
    public int findJudge(int N, int[][] trust) {
        if(trust.length==0 && N==1)
            return 1;
       // int[] judgecount = new int[N+1];
        //for(int[] i: trust){
          //  judgecount[i[1]]++;
          //  judgecount[i[0]]--;
        //}
        //for(int i=0;i<judgecount.length;i++){
          //  if(judgecount[i]==N-1)
            //    return i;
        //}
        int[] judgecount = new int[N+1];
        int[] judgecount1 = new int[N+1];
        for(int i=0;i<trust.length;i++){
            judgecount[trust[i][0]]++;
            judgecount1[trust[i][1]]++;
        }
        for(int i=0;i<=N;i++){
            if( judgecount1[i] == N-1 && judgecount[i] == 0)
                return i;
        }
        return -1;
    }
}