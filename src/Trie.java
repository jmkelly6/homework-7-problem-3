import java.util.ArrayList;
import java.util.List;

public class Trie implements AutocompleteTrie{
    public TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insertWord(String word) {
        TrieNode p = root;
        word.toLowerCase();

        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';

            if(p.chars[index] == null) {
                p.chars[index] = new TrieNode();
            }

            p = p.chars[index];
        }
        p.w = word;
        //System.out.println("This is the word: " + p.w);
        p.end = true;
    }

    public boolean search(String word) {
        return search(root, word, 0);
    }

    public boolean search(TrieNode p, String word, int front) {
        if(p.end && front == word.length()) {
            return true;
        }

        if(front >= word.length()) {
            return false;
        }

        char c = word.charAt(front);
        int index = c - 'a';

        if(p.chars[index] != null) {
            return search(p.chars[index], word, front + 1);
        } else {
            return false;
        }
    }
    public boolean startsWith(String prefix) {
        TrieNode node = root;

        for(char c: prefix.toCharArray()) {
            if(node.chars[c-'a'] == null) {
                return false;
            }
            node = node.chars[c-'a'];
        }

        return true;
    }

    public List<String> autocomplete(String word) {
        List<String> auto = new ArrayList<>();
        TrieNode node = root;

        if(search(word)) {
            search(word);
        }
    }


    // toString method used for debugging tests
    @Override
    public String toString() {
        String ans = "";
        int i = 0;

        while(root.end) {
            ans += root.chars[i].w;
            i++;
        }

        return ans;
    }
}
