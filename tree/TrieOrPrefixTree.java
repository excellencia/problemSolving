package tree;

public class TrieOrPrefixTree {
    private TrieNode root;

    public TrieOrPrefixTree() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.containsKey(word.charAt(i)))
                node.put(word.charAt(i), new TrieNode());
            node = node.get(word.charAt(i));
        }
        node.setEnd();
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!node.containsKey(currentChar))
                return false;
            node = node.get(currentChar);
        }
        return node.isEnd();

    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            char currentChar = prefix.charAt(i);
            if (!node.containsKey(currentChar))
                return false;
            node = node.get(currentChar);
        }
        return true;
    }
}
