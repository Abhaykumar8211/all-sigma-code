import java.util.*;

public class day42_Tries {

    static class Node {
        Node[] children = new Node[26];
        boolean eow;
        ArrayList<String> data;

        Node() {
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
            eow = false;
            data = new ArrayList<>();
        }
    }

    public static Node root = new Node();

    public static void insert(String sortedWord, String originalWord) {
        int level = 0;
        int len = sortedWord.length();
        int idx = 0;
        
        Node curr = root;
        for(; level<len; level++) {
            idx = sortedWord.charAt(level) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            
            curr = curr.children[idx];
        }
        curr.eow = true;
        curr.data.add(originalWord);

    }

    //dfs group
    public static void dfs(Node root, ArrayList<ArrayList<String>> ans){
        if(root == null) {
            return;
        }

        if(root.eow == true){
            ans.add(root.data);
        }

        for(int i=0; i<26; i++) {
            if(root.children[i] != null){
                dfs(root.children[i], ans);
            }
        }
    }


    public static void main(String[] args){
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};

        ArrayList<ArrayList<String>> ans = new ArrayList<>();

        for(int i=0; i<str.length; i++) {
            String words = str[i];
            char[] chars = words.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            insert(sortedWord, words);
        }
        dfs(root, ans);

        System.out.println(ans);
    }
}