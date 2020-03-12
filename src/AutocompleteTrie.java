public interface AutocompleteTrie {
    void insertWord(String word);

    boolean search(String word);

    boolean startsWith(String prefix);

    //TrieNode searchNode(String s);

}
