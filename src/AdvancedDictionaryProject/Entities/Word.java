package AdvancedDictionaryProject.Entities;

import java.util.LinkedList;

public class Word {
    private String text;
    private LinkedList<Definition> definitions;
    private LinkedList<String> pronunciations,synonyms;

    public Word(){
        this.text = "";
        this.pronunciations = new LinkedList<>();
        this.definitions = new LinkedList<>();
        this.synonyms = new LinkedList<>();
    };

    public Word(String text, LinkedList<String> pronunciations,LinkedList<Definition> definitions, LinkedList<String> synonyms) {
        this.text = text;
        this.pronunciations = pronunciations;
        this.definitions = definitions;
        this.synonyms = synonyms;
    }

    @Override
    public String toString() {
        return "Word{" +
                "text='" + text + '\'' +
                ", definitions=" + definitions +
                ", pronunciations=" + pronunciations +
                ", synonyms=" + synonyms +
                '}';
    }

    public String getText() {
        return text;
    }

    public LinkedList<String> getPronunciations() {
        return pronunciations;
    }

    public LinkedList<Definition> getDefinitions() {
        return definitions;
    }

    public LinkedList<String> getSynonyms() {
        return synonyms;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDefinitions(LinkedList<Definition> definitions) {
        this.definitions = definitions;
    }

    public void setPronunciations(LinkedList<String> pronunciations) {
        this.pronunciations = pronunciations;
    }

    public void setSynonyms(LinkedList<String> synonyms) {
        this.synonyms = synonyms;
    }

    public void addPronunciation(String pronunciation){ this.pronunciations.add(pronunciation);}

    public void addSynonym(String synonym){ this.synonyms.add(synonym);}

    public void addDefinition(Definition definition){ this.definitions.add(definition);}
}
