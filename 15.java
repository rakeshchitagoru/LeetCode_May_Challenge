class Solution {
    public int maxSubarraySumCircular(int[] A) {
        // int max = A[0]+A[A.length-1];
        // int cursum=0,i=0;
        // while(i<=A.length-1){
        //     if(A[i] > cursum){
        //         cursum=A[i];
        //     } else{
        //         cursum+=A[i];
        //     }
        //     max=Math.max(max,cursum);
        //     i++;
        //     //System.out.println("cursum" + "" +cursum);
        //     //System.out.println("max" + "" +max);
        // }
        // return max;
        int curmax=A[0],max=A[0],curmin=A[0],min=A[0],sum=A[0];
        for(int i=1;i<A.length;i++){
            curmax=Math.max(curmax+A[i],A[i]);
            max=Math.max(curmax,max);
            
            curmin=Math.min(curmin+A[i],A[i]);
            min=Math.min(curmin,min);
            
            sum+=A[i];
        }
        if(sum==min) 
            return max; 
        else
            return Math.max(max,sum-min);
    }
}