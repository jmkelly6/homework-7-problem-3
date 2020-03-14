import org.junit.Test;

import static org.junit.Assert.*;

public class AutocompleteTests {
    Trie[] wordLists;
    String[][] tests = {
            {"hello", "high", "seattle", "seatac", "see", "hollow", "how"},
            {"animal", "alien", "ant", "alliGAtor", "Allison", "call", "sIleNt", "guile", "torment"},
            {"wash", "toner", "Hamptons", "haPpy", "Washington", "camping", "tonight"},
    };

    @Test
    public void testInsert() {
        wordLists = new Trie[tests.length];
        for(int i = 0; i < tests.length; i++) {
            wordLists[i] = new Trie();
            for(int j = 0; j < tests[i].length; j++) {
                wordLists[i].insertWord(tests[i][j]);
                System.out.println(wordLists[i].toString());
                ///assertEquals(tests[i][j], wordLists[i].root.w);
            }
        }
    }

    @Test
    public void testSearch() {
        String[][] terms = {
                {"h", "se", "sea", "ho", "xyz"},
                {"a", "Al", "en", "alL", "ing"},
                {"W", "amp", "ton", "ho", "was"},
        };

        for(int i = 0;  i< terms.length; i++) {
            for(int j = 0; j < terms[i].length; j++) {
                wordLists[i].search(terms[i][j]);
                //assertTrue();
            }
        }
    }

    @Test
    public void testAutocomplete() {

    }
}
