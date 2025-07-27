
class Trie{
    Trie[] links = new Trie[26];
    boolean flag = false;
}

public class LongestWordWithAllPrefixes {
    static Trie root = new Trie();

    static void insert(String word){
        Trie node = root;
        for(char ch : word.toCharArray()){
            int idx = ch - 'a';
            if(node.links[idx] == null){
                node.links[idx] = new Trie();
            }
            node = node.links[idx];
        }
        node.flag = true;
    }

    static boolean allPrefixesExist(String word){
        Trie node = root;
        for(char ch : word.toCharArray()){
            int idx = ch - 'a';
            node = node.links[idx];
            if(node == null || !node.flag){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for(String w : words){
            insert(w);
        }
        String longest = "";
        for(String w : words){
            if(allPrefixesExist(w)){
                if(w.length() > longest.length() || w.length() == longest.length() && w.compareTo(longest) < 0){
                    longest = w;
                }
            }
        }
        System.out.println(longest);
    }
}
