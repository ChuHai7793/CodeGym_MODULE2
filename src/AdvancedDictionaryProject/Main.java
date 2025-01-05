package AdvancedDictionaryProject;

import AdvancedDictionaryProject.Entities.Definition;
import AdvancedDictionaryProject.Entities.Word;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //------------------------------CREATE DATASET-------------------------------------------------------------
        Service service = Service.getInstance();

        File directory = new File("src/AdvancedDictionaryProject/data");
        String[] contents = directory.list();
        if (contents != null){
            for (String content:contents){
                File file = new File("src/AdvancedDictionaryProject/data/"+content);
                Word word = service.readWord(file);
                String keyword = content.substring(0,content.length()-4);
                service.getDictionary().put(keyword,word);
            }
        }

        //----------------------------------------------------------------------------------------------------
        while (true) {
            Controller controller = new Controller();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Action:");
            Request request = new Request(scanner.nextLine());
            controller.handleRequest(request);
        }




////         TEST
//        Service service = Service.getInstance();
//        File file = new File("src/AdvancedDictionaryProject/data/positive.def");
//        Word word = service.readWord(file);
//
////        System.out.println(word);
//        System.out.println(word.getText());
//        for (String pronunciation: word.getPronunciations()){
//            System.out.println(pronunciation);
//        }
//        for (String synonym: word.getSynonyms()){
//            System.out.println(synonym);
//        }
//
//        for (Definition definition: word.getDefinitions()){
//            System.out.println(definition);
//        }

    }
}
