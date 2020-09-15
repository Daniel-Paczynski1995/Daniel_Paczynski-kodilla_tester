package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {

    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishword) {
        List<EnglishWord> englishWords =
                dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishword);
        dictionary.put(polishWord, englishWords);
    }

    public List<EnglishWord> findEnglishWord(String polishWord) {
        return Collections.emptyList();
    }

    public List<EnglishWord> findEnglishWord(String polishWord, PartOfSpeech partOfSpeech) {
        return Collections.emptyList();
    }

    public int size() {
        return dictionary.size();
    }
}
