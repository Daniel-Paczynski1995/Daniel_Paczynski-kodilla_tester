package com.kodilla.collections.adv.exercises.dictionary;

public class EnglishWord {
private PartOfSpeech partOfSpeech;
private String word;

    public String getWord() {
        return word;
    }

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    public EnglishWord(PartOfSpeech noun, String word) {
        this.word = word;
    }

    public EnglishWord(PartOfSpeech partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }
}
