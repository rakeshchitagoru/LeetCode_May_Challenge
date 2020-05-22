class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hmap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            hmap.put(ch, hmap.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->(hmap.get(b) - hmap.get(a)));
        pq.addAll(hmap.keySet());
        while(!pq.isEmpty()){
            char ch = pq.poll();
            for(int i=0;i<hmap.get(ch);i++)
            sb.append(ch);
        }
        return sb.toString();
    }
}