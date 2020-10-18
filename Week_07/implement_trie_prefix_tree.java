package com.example.leetcode.leetcode;


public class implement_trie_prefix_tree {

}

class Trie {

    class TrieNode{
        private TrieNode[] link;
        private final int length = 26;
        private boolean isEnd;

        public TrieNode(){
            link = new TrieNode[26];
        }

        public void setEnd(){
            isEnd = true;
        }

        public boolean isEnd(){
            return isEnd;
        }

        public boolean containKey(char ch){
            return link[ch-'a'] != null;
        }

        public void put(char ch, TrieNode node){
            link[ch-'a'] = node;
        }

        public TrieNode get(char ch){
            return link[ch-'a'];
        }
    }

    private TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ( !node.containKey(c)){
                node.put(c,new TrieNode());
            }
            node = node.get(c);
        }
        node.setEnd();
    }

    /** Returns if the word is in the trie. */
    private TrieNode searchPrefix(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ( node.containKey(c)){
                node = node.get(c);
            }else {
                return null;
            }
        }
        return node;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode trieNode = searchPrefix(word);
        return trieNode != null && trieNode.isEnd();
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode trieNode = searchPrefix(prefix);
        return trieNode != null;
    }
}