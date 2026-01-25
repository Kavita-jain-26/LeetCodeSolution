class Solution {
    List<String> result = new ArrayList<>();
        int r, c;

       int[][] directions = {
        {0, -1}, // left
        {0,  1}, // right
        {-1, 0}, // up
        {1,  0}  // down
        };

        static class TrieNode {
            boolean endOfWord;
            String word = "";
            TrieNode[] children = new TrieNode[26];
        }
        TrieNode getNode(){
            return new TrieNode();
        }

        void insert(TrieNode root, String str){
            TrieNode pcrawl = root;
            for(char ch: str.toCharArray()){
                int idx = ch-'a';
                if(pcrawl.children[idx] == null){
                    pcrawl.children[idx] = getNode();
                }
                pcrawl = pcrawl.children[idx];
            }
            pcrawl.endOfWord = true;
            pcrawl.word = str;
        }

        void DFS(char[][] board, int i, int j, TrieNode root){
            if( i < 0 || i >= r || j <0 || j >=c 
            || board[i][j] == '$' ||
            root.children[board[i][j] -'a'] == null){
                return;
            }

            root = root.children[board[i][j] - 'a'];
            if(root.endOfWord){
                result.add(root.word);
                root.endOfWord = false;
            }

            char temp = board[i][j];
            board[i][j] = '$';

            for(int[] d: directions){
                DFS(board, i+d[0], j+d[1], root);
            }
            board[i][j] = temp;

        }

    public List<String> findWords(char[][] board, String[] words) {
        r = board.length; 
        c = board[0].length;

        TrieNode root = getNode();
        for(String word: words){
            insert(root,word);
        }
        for(int i = 0; i < r ; i++){
            for(int j = 0; j <c ; j++){
                if(root.children[board[i][j]-'a'] != null){
                    DFS(board, i, j, root);
                }
            }
        }


        return result;
    }
}