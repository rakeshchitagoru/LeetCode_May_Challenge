class Solution {
    public int firstUniqChar(String s) {
        //HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        //int n = s.length();
        //for (int i = 0; i < n; i++) {
            //char c = s.charAt(i);
          //  count.put(c, count.getOrDefault(c, 0) + 1);
        //}
        
        //for (int i = 0; i < n; i++) {
            //if (count.get(s.charAt(i)) == 1) 
          //      return i;
        //}
        //return -1;
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
        
        
        //int[] count = new int[26];
        //int n = s.length();
        
        // build char count bucket : <charIndex, count>
        //for (int i = 0; i < n; i++) {            
          //  count[s.charAt(i) - 'a']++;
        //}
        
        // find the index
        //for (int i = 0; i < n; i++) {
          //  int index = s.charAt(i) - 'a';
            //if (count[index] == 1) {
              //  return i;
            //}
                
        //}
       // return -1;
    }
}