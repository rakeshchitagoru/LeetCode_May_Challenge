class Solution {
    public int numJewelsInStones(String J, String S) {
        int count=0;
        //int[] freq = new int[60];
        //if(S.length()==0 || J.length()==0 || S==null || J==null)
          //  return 0;
        //for(int i=0;i<J.length();i++){
          //  freq[J.charAt(i)-'A']++;
        //}
        //for(int i=0;i<S.length();i++){
          //  if(freq[S.charAt(i)-'A']>0)
            //    count++;
        //}
        Set<Character> set = new HashSet<>();
        for(char ch: J.toCharArray()){
            set.add(ch);
        }
        for(char c: S.toCharArray()){
            if(set.contains(c))
                count++;
        }
        return count;
    }
    
}