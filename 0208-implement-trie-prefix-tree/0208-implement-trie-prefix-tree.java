class Trie {
    Trie root;
    boolean endOfWord;
    String word = "";
    Trie[] children = new Trie[26];

    public Trie() {
        root = this;
        children = new Trie[26];
        endOfWord = false;
    }

    public void insert(String word) {
        Trie cral = root;

        for(char c : word.toCharArray()){
             int idx = c - 'a';
            if(cral.children[idx] == null){
                cral.children[idx] = new Trie();
            }
            cral = cral.children[c-'a'];
        }
        cral.endOfWord = true;
        cral.word = word;
    }
    
    public boolean search(String word) {
         Trie cral = root;

        for(char c : word.toCharArray()){
             int idx = c - 'a';
            if(cral.children[idx] == null){
               return false;
            }
            cral = cral.children[idx];
        }
    
        if(cral.endOfWord)
          return true;
        else
         return false;
    }
    
    public boolean startsWith(String word) {
         Trie cral = root;

        for(char c : word.toCharArray()){
             int idx = c - 'a';
            if(cral.children[idx] == null){
               return false;
            }
            cral = cral.children[idx];
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