package DictionaryProject;

import DictionaryProject.Entities.*;

import java.util.HashMap;
import java.util.Map;

public class Service {

    private static Service instance;
    private Map<String, Word> dictionary;

    DefinitionFactory adjFactory = new AdjDefinitionFactory();
    Definition adj1 = adjFactory.createDefinition("sad","sad","sad");

    private Service() {
        this.dictionary = new HashMap<>();
    }

    /*----------- SINGLETON ---------------*/
    public static Service getInstance() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }

    /*---------------------- FUNCTION SERVICE -------------------------------*/

    public Word lookupWord(String keyword) {
        return this.dictionary.get(keyword.toLowerCase());
    }

    public void dropWord(String keyword){
        this.dictionary.remove(keyword);
    }


    public void addDefinition(String keyword, Definition definition) {
        Word word = lookupWord(keyword);
        if (word == null) {
            word = new Word();
            this.dictionary.put(keyword,word);
        }
        word.getDefinitions().add(definition);
    }

    public void addSynonym(String keyword,String synonym){
        Word word = lookupWord(keyword);
        word.getSynonyms().add(synonym);
    }

    public void addPronunciation(String keyword,String pronunciation){
        Word word = lookupWord(keyword);
        word.getPronunciations().add(pronunciation);
    }

    public Map<String, Word> getDictionary() {
        return dictionary;
    }
}
