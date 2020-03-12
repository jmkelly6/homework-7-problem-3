public class Trie implements AutocompleteTrie{
    public TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insertWord(String word) {
        TrieNode p = root;
        word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            int index = c - 'a';
            if(p.chars[index] == null){
                p.chars[index] = new TrieNode();
            }
            p = p.chars[index];
        }
        p.w = word;
        p.end = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for(char c: word.toCharArray()) {
            if(node.chars[c-'a'] == null)
                return false;
            node = node.chars[c-'a'];
        }
        if(node.w.equals(word)) {
            return true;
        } else {
            return false;
        }
//        TrieNode p = searchNode(word);
//        if(p == null){
//            return false;
//        } else {
//            if(p.end)
//                return true;
//        }
//        return false;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char c: prefix.toCharArray()){
            if(node.chars[c-'a']==null)
                return false;
            node = node.chars[c-'a'];
        }
        return true;


//        TrieNode p = searchNode(prefix);
//        if(p == null) {
//            return false;
//        } else {
//            return true;
//        }
    }

//    public boolean searchNode(String s){
//        TrieNode node = root;
//        for(char c: s.toCharArray()){
//            if(node.chars[c-'a']==null)
//                return false;
//            node = node.chars[c-'a'];
//        }
//        return true;
//        TrieNode p = root;
//        for(int i = 0; i < s.length(); i++){
//            char c = s.charAt(i);
//            int index = c-'a';
//            if(p.chars[index]!=null){
//                p = p.chars[index];
//            } else {
//                return null;
//            }
//        }
//        if(p == root) {
//            return null;
//        }
//        return p;
//    }

    @Override
    public String toString() {
        String ans = "";
        int i = 0;
        while(root.end) {
            ans += root.chars[i];
            i++;
        }
        return ans;
    }
}
