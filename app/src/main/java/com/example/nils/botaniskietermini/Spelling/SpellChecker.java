package com.example.nils.botaniskietermini.Spelling;

import java.util.ArrayList;

public class SpellChecker {
    ArrayList<String> suggestions = new ArrayList<String>();
    Dictionary dictionary;
    BKTree tree;

    public SpellChecker(String text){
        dictionary = new Dictionary(text);
        tree = BKTree.build(new ArrayList<>(dictionary.getWords()));
    }

    public ArrayList<String> checkWord(String word) {
        suggestions.addAll(tree.getSimilarWords(word));
        return suggestions;
    }
}
