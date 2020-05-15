class TrieNode {
    public char val;
    public boolean isWord; 
    public TrieNode[] children = new TrieNode[26];
    public TrieNode() {}
    TrieNode(char c){
        TrieNode node = new TrieNode();
        node.val = c;
    }
}
public class Trie {

    /** Initialize your data structure here. */
    private TrieNode curr;
    public Trie() {
        curr = new TrieNode();
        curr.val = ' ';
    }
    
    /** Inserts a word into the trie. */
    public void insert(String string) {
        TrieNode data = curr;
        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if(data.children[ch - 'a'] == null){
                data.children[ch - 'a'] = new TrieNode(ch);
            }
            data = data.children[ch - 'a'];
        }
        data.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String string) {
        TrieNode data = curr; 
        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if(data.children[ch - 'a'] == null) return false;
            data = data.children[ch - 'a'];
        }
        return data.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode data = curr; 
        for(int i = 0; i < prefix.length(); i++){
            char ch = prefix.charAt(i);
            if(data.children[ch - 'a'] == null) return false;
            data = data.children[ch - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */