//import java.util.HashMap;
//import java.util.Set;

public class TrieNode {
    public String w;
    //HashMap<Character, TrieNode> children;
    TrieNode[] chars;
    boolean end;

    public TrieNode() {
        chars = new TrieNode[26];
        w = "testing";
        end = false;
        //for(int i = 0; i < 26; i++) {
            //chars[i] = null;
        //}
    }
    //public String getWord() {return word;}
    //public void setWord(String w) {word = w;}

//    public TrieNode() {
//        children = new HashMap<Character, TrieNode>();
//        end = false;
//    }
//
//    public TrieNode(String root) {
//        children = new HashMap<Character, TrieNode>();
//        end = false;
//        word = root;
//    }
//
//    public TrieNode getChild(char c) {
//        return children.get(c);
//    }
//
//    public TrieNode input(Character c) {
//        if(children.containsKey(c)) {
//            return null;
//        }
//
//        TrieNode nextChar = new TrieNode(word + c.toString());
//        children.put(c, nextChar);
//        return nextChar;
//    }
//
//    public String getWord() {
//        return word;
//    }
//
//    public void setEnd(boolean ew) {
//        end = ew;
//    }
//
//    public boolean endWord() {
//        return end;
//    }
//
//    public Set<Character> getNext() {
//        return children.keySet();
//    }
}
