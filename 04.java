class Solution {
    public int findComplement(int num) {
        int[] compl = new int[32];
        int i=0, j=0, count=0;
        while(num>0){
            if(num%2==0)
                compl[i++]=1;
            else
                compl[i++]=0;
            num/=2;
            count++;
        }
       int[] bin = new int[count]; 
        for(int k=0;k<count;k++){
            bin[k]=compl[k];
            j+=bin[k]*Math.pow(2,k);
        }
        return j;
    }
}