
public class TrieNode {
    public String w;
    TrieNode[] chars;
    boolean end;

    public TrieNode() {
        chars = new TrieNode[26];
        w = "testing";
        end = false;
    }

    public boolean startsWith(String prefix) {

        for(char c: prefix.toCharArray()) {
            if(chars[c-'a'] == null) {
                return false;
            }
            return startsWith(prefix.substring(1));
        }

        return true;
    }
}
