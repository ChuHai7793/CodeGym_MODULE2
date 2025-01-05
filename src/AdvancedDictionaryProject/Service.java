package AdvancedDictionaryProject;

import AdvancedDictionaryProject.Entities.*;

import java.io.*;
import java.util.*;

public class Service {

    private static Service instance;
    private final Map<String, Word> dictionary;


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

    /*------------------------------------ LOAD DATASET TO DICTIONARY HASHMAP -------------------------------*/
    public Word readWord(File file) {
        if (!file.exists()) {
            return null;
        }

        String flag = "";
        Word word = new Word();
        ArrayList<String> definitionList = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
//                System.out.println(line);

                char firstChar = line.charAt(0);

                String[] lineList = line.split(" ");
                String wordType = lineList[1].trim();

                switch (firstChar) {
                    case '@' -> {
                        decodeTextAndPronunciation(lineList, word);
                    }
                    case '*' -> {
                        decodeDefinition(word,flag,definitionList);
                        // UPDATE flag and definitionList
                        definitionList = new ArrayList<>();
                        flag = wordType;
                    }
                    default -> {
                        if (flag.equals("Synonym")) {
                            decodeSynonym(word, lineList[1].trim());
                        } else {
                            definitionList.add(line.substring(2));
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return word;
    }

    public void decodeTextAndPronunciation(String[] lineList, Word word) {
        word.setText(lineList[1].trim());

        if (lineList.length > 2) {
            LinkedList<String> pronunciations = new LinkedList<>();
            for (int i = 2; i < lineList.length; i++) {
                word.addPronunciation(lineList[i].trim().replaceAll("^/|/$", ""));
            }
        }
    }

    public void decodeSynonym(Word word, String synonym) {
            word.addSynonym(synonym);
    }

    public void decodeDefinition(Word word, String wordType, ArrayList<String> definitionList) {
        Definition definition = null;
        switch (wordType) {
            case "adjective" -> {
                definition = new AdjDefinitionFactory().createDefinition(definitionList.getFirst(), null, null);
            }
            case "noun" -> {
                definition = new NounDefinitionFactory().createDefinition(definitionList.getFirst(), null, null);
            }
            case "verb" -> {
                definition = new VerbDefinitionFactory().createDefinition(definitionList.getFirst(), null, null);
            }
        }
        if (definition!= null){
            if (definitionList.size() > 1) {
                definition.setSentence(definitionList.get(1));
            }
            if (definitionList.size() == 3) {
                definition.setSentenceMeaning(definitionList.get(2));
            }
            word.addDefinition(definition);
        }
    }

    /*---------------------------------------- FUNCTION SERVICE ---------------------------------------------*/

    public Word lookupWord(String keyword) {
        return this.dictionary.get(keyword.toLowerCase());
    }

    public void dropWord(String keyword) {
        this.dictionary.remove(keyword);

        File file = new File("src/AdvancedDictionaryProject/data/" + keyword + ".def");
        deleteFile(file);
    }

    public void addDefinition(String keyword, Definition definition) {
        Word word = lookupWord(keyword);
        if (word == null) { // If word hasn't existed
            word = new Word();
            word.setText(keyword);
            this.dictionary.put(keyword, word);
        }
        word.getDefinitions().add(definition);

        saveWord(word);
    }

    public void addSynonym(String keyword, String synonym) {
        Word word = lookupWord(keyword);

        if (word == null) { // If word hasn't existed
            word = new Word();
            word.setText(keyword);
            this.dictionary.put(keyword, word);
        }

        word.getSynonyms().add(synonym);
        saveWord(word);
    }

    public void addPronunciation(String keyword, String pronunciation) {
        Word word = lookupWord(keyword);
        if (word == null) { // If word hasn't existed
            word = new Word();
            word.setText(keyword);
            this.dictionary.put(keyword, word);
        }
        word.getPronunciations().add(pronunciation);

        saveWord(word);
    }


    /*----------------------------------- IO ---------------------------------------------*/

    public void deleteFile(File file) {
        if (file.delete()) {
            System.out.println("File deleted successfully: " + file.getPath());
        } else {
            System.out.println("Failed to delete the file: " + file.getPath());
        }
    }

    public void createNewFile(File file) {

        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("Create new file: " + file.getName());
                } else {
                    System.out.println("Write to file: " + file.getName());
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void writeWordToFile(BufferedWriter writer, Word word) throws IOException {
        writer.write("@ " + word.getText() + "  ");

        for (String pronunciation : word.getPronunciations()) {
            writer.write("/" + pronunciation + "/  ");
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

    public void saveWord(Word word) {
        // Create or write to existing file
        File file = new File("src/AdvancedDictionaryProject/data/" + word.getText() + ".def");
        createNewFile(file);

        // Write to word file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writeWordToFile(writer, word);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void export() {

        // Create directory
        File dir = new File("src/AdvancedDictionaryProject/dicts");
        try {
            if (dir.mkdir()) {
                System.out.println("Create new directory: " + dir.getName());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Create textFile
        String path = "src/AdvancedDictionaryProject/dicts/eng_vie.txt";
        File file = new File(path);
        createNewFile(file);

        // Write to eng_vie.txt
        Word word;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            LinkedList<String> ordered_keyword = new LinkedList<>(dictionary.keySet());
            Collections.sort(ordered_keyword);

            for (String keyword : ordered_keyword) {
                word = dictionary.get(keyword);
                writeWordToFile(writer, word);

            }

        } catch (IOException e) {
            System.out.println("An error happens " + e.getMessage());
        }
    }

    public Map<String, Word> getDictionary() {
        return dictionary;
    }
}
