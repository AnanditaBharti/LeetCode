class Solution {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        Arrays.sort(products);

        Trie trie = new Trie();
        for(String p: products){
            trie.insert(p);
        }
        List<List<String>> finalSuggestions = new ArrayList<>();
        TrieNode temp = trie.root;
        for(char c: searchWord.toCharArray()){
            if(temp == null){
                finalSuggestions.add(new ArrayList<>());
                continue;
            }
            int index = c - 'a';
            temp = temp.children[index];
            if(temp == null){
                finalSuggestions.add(new ArrayList<>());
                continue;
            }
            finalSuggestions.add(temp.suggestions);
        }
        return finalSuggestions;
    }
}
class TrieNode{
    TrieNode[] children;
    List<String> suggestions;

    public TrieNode(){
        children = new TrieNode[26];
        suggestions = new ArrayList<>(3);
    }
}
class Trie{
    TrieNode root;
    public Trie(){
        root = new TrieNode();
    }
    void insert(String word){
        TrieNode temp = root;
        for(char c: word.toCharArray()){
            int index = c - 'a';
            if(temp.children[index] == null){
                temp.children[index] = new TrieNode();
            }
            if(temp.children[index].suggestions.size() < 3)
                temp.children[index].suggestions.add(word);
            temp = temp.children[index];
        }
    }
}