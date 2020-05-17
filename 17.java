class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       		
		List<Integer> list = new ArrayList<>();
        int[] freq = new int[256];
        int left = 0;
        int right = 0;
        int count = p.length();
        for(char c: p.toCharArray())
            freq[c] ++;
        
        while(right < s.length())
        {
            if(freq[s.charAt(right)] > 0){
                count--;
            }
            freq[s.charAt(right)]--;
            while(count==0){
                if(right - left+1 == p.length()){
				list.add(left);
            }
               freq[s.charAt(left)]++;
               if(freq[s.charAt(left)] > 0){
                    count ++;
            }
                left++;
            }
                right ++;
        }
     return list;
    }
}