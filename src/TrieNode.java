//import java.util.HashMap;
//import java.util.Set;

public class TrieNode {
    public String w;
    TrieNode[] chars;
    boolean end;

    public TrieNode() {
        chars = new TrieNode[26];
        w = "testing";
        end = false;
    }
    //public String getWord() {return word;}
    //public void setWord(String w) {word = w;}

}
