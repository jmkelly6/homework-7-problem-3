import java.util.List;

public interface AutocompleteTrie {
    void insertWord(String word);

    boolean search(String word);

    List<String> autocomplete(String word);

}
