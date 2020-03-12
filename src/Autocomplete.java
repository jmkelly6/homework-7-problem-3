//import javax.print.DocFlavor;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;

public class Autocomplete {
    private TrieNode root;
    private int size;

    public Autocomplete() {
        root = new TrieNode();
        size = 0;
    }

//    public boolean insertWord(String word) {
//        String wordToAdd = word.toLowerCase();
//        if(endWord(word)) {
//            return false;
//        }
//        HashMap<Character, TrieNode> children = root.children();
//        for(int i = 0; i < wordToAdd.length(); i++) {
//            char c = wordToAdd.charAt(i);
//            TrieNode t;
//            if(children.containsKey(c)) {
//                t = children.get(c);
//            } else {
//                t = new TrieNode(""+c);
//                children.put(c, t);
//            }
//
//            children = t.children;
//            if(i == wordToAdd.length()-1){
//                t.setEnd(true);     //POSSIBLE ERROR
//                size++;
//            }
//        }
//        return true;
//    }

//    public TrieNode searchNode(String str) {
//        HashMap<Character, TrieNode> children = root.children;
//        TrieNode t = null;
//        for(int i=0; i < str.length(); i++){
//            char c = str.charAt(i);
//            if(children.containsKey(c)){
//                t = children.get(c);
//                children = t.children;
//            }else{
//                return null;
//            }
//        }
//        return t;
//    }
//
//    public List<String> predictCompletions(String prefix, int numCompletions) {
//        String prefixToCheckLowerCase = prefix.toLowerCase();
//        int completionsCount = 0;
//        List<String> completions = new LinkedList<String>();
//        TrieNode traversal = root;
//        for (int i = 0; i < prefixToCheckLowerCase.length(); i++) {
//            if (traversal.getNext().contains(prefixToCheckLowerCase.charAt(i))) {
//                traversal = traversal.getChild(prefixToCheckLowerCase.charAt(i));
//            }
//            //Means  stem not found, returns an empty list
//            else
//                return completions;
//        }
//        //If current word is an end word, increment the counter and add it to completions list
//        if (traversal.endWord()) {
//            completionsCount=1;
//            completions.add(traversal.getWord());
//        }
//
//        List<TrieNode> nodesToBeSearched = new LinkedList<TrieNode>();
//        List<Character> ChildCharaterList = new LinkedList<Character>(traversal.getNext());
//        //Filling the list with children of the current node, first level of the breadth first search
//        for (int i=0; i < ChildCharaterList.size(); i++) {
//            nodesToBeSearched.add(traversal.getChild(ChildCharaterList.get(i)));
//        }
//        //while loop for the linked list elements and see if any completions exists , inside it we will also check each node children and add them to the list!!!
//        while (nodesToBeSearched != null  && nodesToBeSearched.size() > 0 && completionsCount < numCompletions) {
//            TrieNode trieNode = nodesToBeSearched.remove(0);
//            if (trieNode.endWord()) {
//                completionsCount++;
//                completions.add(trieNode.getWord());
//            }
//
//            List<Character> subTrieNodeChildren = new LinkedList<Character>(trieNode.getNext());
//            //Adding all next level tries to the linked list , kinda recursive!!!
//            for (int i = 0; i < subTrieNodeChildren.size(); i++) {
//                nodesToBeSearched.add(trieNode.getChild(subTrieNodeChildren.get(i)));
//            }
//        }
//        return completions;
//    }
//
//    @Override
//    public boolean endWord(String s) {
//        TrieNode t = searchNode(s.toLowerCase());
//
//        if(t != null && t.endWord()) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}
