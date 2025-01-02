package DictionaryProject.Entities;

import java.util.ArrayList;
import java.util.LinkedList;

public class Word {
    private String text;
    private LinkedList<Definition> definitions;
    private LinkedList<String> pronunciations,synonyms;

    public Word(){};

    public Word(String text, LinkedList<String> pronunciations,LinkedList<Definition> definitions, LinkedList<String> synonyms) {
        this.text = text;
        this.pronunciations = pronunciations;
        this.definitions = definitions;
        this.synonyms = synonyms;
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
}
