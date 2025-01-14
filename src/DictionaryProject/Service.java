package DictionaryProject;

import DictionaryProject.Entities.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Service {

    private static Service instance;
    private final Map<String, Word> dictionary;
    private boolean exit;


    private Service() {
        this.dictionary = new HashMap<>();
        this.exit = false;
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
        if (word == null) { // If word hasn't existed
            word = new Word();
            word.setText(keyword);
            this.dictionary.put(keyword,word);
        }
        
        word.getDefinitions().add(definition);
    }

    public void addSynonym(String keyword,String synonym){
        Word word = lookupWord(keyword);
        if (word == null) { // If word hasn't existed
            word = new Word();
            word.setText(keyword);
            this.dictionary.put(keyword,word);
        }
        word.getSynonyms().add(synonym);
    }

    public void addPronunciation(String keyword,String pronunciation){
        Word word = lookupWord(keyword);
        if (word == null) { // If word hasn't existed
            word = new Word();
            word.setText(keyword);
            this.dictionary.put(keyword,word);
        }
        word.getPronunciations().add(pronunciation);
    }


    public void export(){

        // Create directory
        File dir = new File ("src/DictionaryProject/dicts");
        try{
            if(dir.mkdir()){
                System.out.println("Create new directory: "+ dir.getName());
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        // Create textFile
        File file = new File("src/DictionaryProject/dicts/eng_vie.txt");
        if (!file.exists()){
            try{
                if(file.createNewFile()){
                    System.out.println("Create new file: "+ file.getName());
                }else{
                    System.out.println("Write to file: "+ file.getName());
                }
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }


        Word word;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){

            LinkedList<String> ordered_keyword = new LinkedList<> (dictionary.keySet());
            Collections.sort(ordered_keyword);

            for (String keyword:ordered_keyword){
                word = dictionary.get(keyword);

                writer.write("@ " + word.getText() + "  ");

                for (String pronunciation : word.getPronunciations()) {
                    writer.write("/"+pronunciation+"/  ");
                }
                writer.newLine();

                for (Definition definition : word.getDefinitions()) {
                    writer.write("* " + definition.getWordType());
                    writer.newLine();
                    writer.write("- " + definition.getMeaning());
                    writer.newLine();
                    writer.write("= " + definition.getSentence());
                    writer.newLine();
                    writer.write("= " + definition.getSentenceMeaning());
                    writer.newLine();
                }

                writer.write("* Synonym");
                writer.newLine();
                for (String synonym : word.getSynonyms()) {
                    writer.write("- " + synonym);
                    writer.newLine();
                }
            }

        } catch (IOException e){
            System.out.println("An error happens "+ e.getMessage());
        }
    }

    public Map<String, Word> getDictionary() {
        return dictionary;
    }

    public boolean isExit() {
        return exit;
    }

    public void setExit() {
        this.exit = true;
    }
}
