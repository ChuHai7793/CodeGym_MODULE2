package AdvancedDictionaryProject;


import DictionaryProject.Entities.AdjDefinitionFactory;
import DictionaryProject.Entities.Definition;
import DictionaryProject.Entities.DefinitionFactory;
import DictionaryProject.Entities.Word;
import DictionaryProject.Service;

import java.util.LinkedList;

public class Dataset {

    public Dataset(){
        Service service = Service.getInstance();
        // CREATE word1
        Word word1 = new Word();

        LinkedList<String> pronunciations = new LinkedList<>();
        pronunciations.add("positive");

        LinkedList<Definition> definitions = new LinkedList<>();
        DefinitionFactory definitionFactory = new AdjDefinitionFactory();
        Definition definition = definitionFactory.createDefinition("meaningExample",
                "sentenceExample","sentenceMeaning");
        definitions.add(definition);

        LinkedList<String> synonyms = new LinkedList<>();
        synonyms.add("synonymExample");

        word1.setText("positive");
        word1.setPronunciations(pronunciations);
        word1.setDefinitions(definitions);
        word1.setSynonyms(synonyms);

        // CREATE word1
        Word word2= new Word();

        LinkedList<String> pronunciations2 = new LinkedList<>();
        pronunciations2.add("negative");

        LinkedList<Definition> definitions2 = new LinkedList<>();
        Definition definition2 = definitionFactory.createDefinition("meaningExample",
                "sentenceExample","sentenceMeaning");
        definitions2.add(definition2);

        LinkedList<String> synonyms2 = new LinkedList<>();
        synonyms2.add("synonymExample");


        word2.setText("negative");
        word2.setPronunciations(pronunciations2);
        word2.setDefinitions(definitions2);
        word2.setSynonyms(synonyms2);



        // CREATE DATASET
//        Map<String,Word> dataset = new HashMap<>();
        service.getDictionary().put("positive",word1);
        service.getDictionary().put("negative",word2);
    }

}