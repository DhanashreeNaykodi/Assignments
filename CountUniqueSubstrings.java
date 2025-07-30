public class CountUniqueSubstrings {

    static class Node {
        Node[] children;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }
    static Node root = new Node();

    public static int insert(String word)
    {
        Node curr = root;
        int newNodes = 0;

        for (char ch : word.toCharArray())
        {
            int index = ch - 'a';
            if (curr.children[index] == null)
            {
                curr.children[index] = new Node(); // Create new node if it is not their
                newNodes++;
            }
            curr = curr.children[index]; // Move to the next node
        }
        return newNodes;
    }

    public static int countUniqueSubstrings(String str)
    {
        int totalNodes = 0;

        for (int i = 0; i < str.length(); i++)
        {

            for (int j = i; j < str.length(); j++)
            {
                String substring = str.substring(i, j + 1);

                totalNodes += insert(substring); // Insert and count new nodes
            }
        }
        return totalNodes;
    }

    public static void main(String[] args) {
        String str = "ababa"; // Input string
        int result = countUniqueSubstrings(str);
        System.out.println("Number of unique substrings: " + result);
    }
}