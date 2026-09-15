class Solution {
    // public void dfs(ArrayDeque<TrieNode> stack, StringBuilder prefix, String searchWord, int index, List<String> products){
    //     if(stack.isEmpty())
    //         return;
    //     TrieNode node = stack.removeLast();
    //     if(node.isEndOfWord){
    //         products.add(prefix.toString());
    //         if(products.size() >= 3)
    //             return;
    //     }
    //     dfs(stack, )
    //     // for(int i = 0; i < 26; i++){
    //     //     if(node.children[i] != null){
    //     //         stack.add(node.children[i]);
    //     //     }
    //     // }
    // }
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
        // List<TrieNode> list = new ArrayList<>();
        // list.add(trie.root);
        // int level = 1;
        // int count = 0;
        // while(!list.isEmpty()){
        //     TrieNode t = list.remove(0);
        //     for(int i = 0; i < 26; i++){
        //         if(t.children[i] != null){
        //             System.out.print((char)('a' + i) + ", ");
        //             list.add(t.children[i]);
        //             count ++;
        //         }
        //     }
        //     level --;
        //     if(level == 0){
        //         level = count;
        //         count = 0;
        //         System.out.println();
        //     }

        // }

        // List<List<String>> output = new ArrayList<>();
        // TrieNode node = trie.root;
        // for(char c: searchWord.toCharArray()){
        //     List<String> curr = new ArrayList<>();
        // }

        // List<List<String>> res = new ArrayList<>();
        // StringBuilder prefix = new StringBuilder();

        // for(int i = 0; i < searchWord.length(); i++){
        //     prefix.append(searchWord.charAt(i));
        //     count = 0;
        //     TrieNode t = root.root;
        //     int j = i;
        //     List<String> prod = new ArrayList<>();
        //     StringBuilder prefix2 = new StringBuilder();
        //     prefix2.append(prefix);
        //     while(count < 3){
        //         if (t.isEndOfWord){
        //             prod.add(prefix2.toString());
        //             count ++;
        //         }
        //         int index = searchWord.charAt(j) - 'a';
        //         prefix2.append(prefix2);
        //         t = t.children[index];
        //         if(t == null)
        //             break;
                
        //     }
        //     res.add(prod);
            
        // }
        // return res;
    }
}
class TrieNode{
    TrieNode[] children;
    boolean isEndOfWord;
    List<String> suggestions;

    public TrieNode(){
        children = new TrieNode[26];
        suggestions = new ArrayList();
    }
}
class Trie{
    TrieNode root;
    public Trie(){
        root = new TrieNode();
    }
    void insert(String word){
        TrieNode temp = root;
        // if(temp.suggestions.length() < 3)
        //     temp.suggestions.add(word);
        for(char c: word.toCharArray()){
            int index = c - 'a';
            if(temp.children[index] == null){
                temp.children[index] = new TrieNode();
            }
            if(temp.children[index].suggestions.size() < 3)
                temp.children[index].suggestions.add(word);
            temp = temp.children[index];
        }
        temp.isEndOfWord = true;
    }

}