package com.example.leetcode.leetcode;

import javafx.util.Pair;

import java.util.*;

public class word_ladder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList.contains(endWord) == false) {
            return 0;
        }

        Map<String, List<String>> allComboDict = new HashMap<>();

        wordList.forEach(
                word -> {
                    for (int i = 0; i < beginWord.length(); i++) {
                        String newWord = word.substring(0, i) + '*' + word.substring(i + 1, beginWord.length());
                        List<String> transformations = allComboDict.getOrDefault(newWord, new ArrayList<>());
                        transformations.add(word);
                        allComboDict.put(newWord, transformations);
                    }
                });

        Queue<Pair<String,Integer>> queue = new LinkedList<>();
        queue.add(new Pair(beginWord,1));

        HashMap<String, Boolean> visited = new HashMap<>();
        visited.put(beginWord, true);

        while (!queue.isEmpty()) {
            Pair<String, Integer> pair = queue.poll();
            String str = pair.getKey();
            Integer level = pair.getValue();
            for (int i = 0; i < str.length(); i++) {
                String newWord = str.substring(0, i) + '*' + str.substring(i + 1, beginWord.length());
                for (String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<>())) {
                    if (adjacentWord.equals(endWord)) {
                        return level + 1;
                    }
                    if (wordList.contains(adjacentWord)) {
                        if (!visited.containsKey(adjacentWord)){
                            visited.put(adjacentWord, true);
                            queue.add(new Pair(adjacentWord,level + 1));
                        }
                    }
                }
            }
        }

        return 0;
    }


    public static void main(String[] args) {
        word_ladder word_ladder = new word_ladder();
        String beginWord = "hot";
        String endWord = "dog";
        List<String> strings = Arrays.asList("hot", "dog");
        int i = word_ladder.ladderLength(beginWord, endWord, strings);
        System.out.println(i);
    }


}
