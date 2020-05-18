class Solution {
    public boolean checkInclusion(String s1, String s2) {
         int[] freq = new int[256];
        int left = 0;
        int right = 0;
        int count = s1.length();
        for(char c: s1.toCharArray())
            freq[c] ++;
        
        while(right < s2.length())
        {
            if(freq[s2.charAt(right)] > 0){
                count--;
            }
            freq[s2.charAt(right)]--;
            while(count==0){
                if(right - left+1 == s1.length()){
				return true;
            }
               freq[s2.charAt(left)]++;
               if(freq[s2.charAt(left)] > 0){
                    count ++;
            }
                left++;
            }
                right ++;
        }
     return false;
    }
}