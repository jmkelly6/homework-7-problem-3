import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
                assertEquals(tests[i][j], wordLists[i].root.w);
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

        for(int i = 0;  i < terms.length; i++) {
            for(int j = 0; j < terms[i].length; j++) {
                assertTrue(wordLists[i].search(terms[i][j]));
            }
        }
    }

    @Test
    public void testAutocomplete() {
        List<List<String>> answers = new ArrayList<>();

        String[] terms = {"h", "se", "sea", "ho", "xyz"};

        List<String> first = new ArrayList<>();
        first.add("hello");
        first.add("high");
        first.add("hollow");
        first.add("how");

        List<String> second = new ArrayList<>();
        second.add("seattle");
        second.add("seatac");
        second.add("see");

        List<String> third = new ArrayList<>();
        third.add("seattle");
        third.add("seatac");

        List<String> fourth = new ArrayList<>();
        fourth.add("hollow");
        fourth.add("how");

        List<String> fifth = new ArrayList<>();

        for(int i = 0; i < terms.length; i++) {
            for(int j = 0; j < wordLists[i].autocomplete(terms[i]).size(); j++) {
                assertEquals(wordLists[i].autocomplete(terms[i]).get(j), answers.get(i).get(j));
            }
        }
    }
}
