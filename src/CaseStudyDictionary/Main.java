package CaseStudyDictionary;

import CaseStudyDictionary.Factory.AdjectiveEntityFactory;
import CaseStudyDictionary.Factory.Entity;
import CaseStudyDictionary.Factory.EntityFactory;
import CaseStudyDictionary.Factory.PronounEntityFactory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*----------------- CREATE DATASET --------------------------*/
        HashMap<String,HashMap<String, Entity>> dataset = new HashMap<String,HashMap<String, Entity>>();
        HashMap<String,Entity> adjectiveDataset = new  HashMap<String,Entity>();
        HashMap<String,Entity> pronounDataset = new  HashMap<String,Entity>();

        dataset.put("Adjective",adjectiveDataset);
        dataset.put("Pronoun",pronounDataset);

        EntityFactory adjectiveFactory = new AdjectiveEntityFactory();
        Entity adjEntity1 = adjectiveFactory.createEntity("long","as,fg,xzc");
        Entity adjEntity2 = adjectiveFactory.createEntity("short","axzs,fsag,xzsac");
        adjectiveDataset.put("long",adjEntity1);
        adjectiveDataset.put("short",adjEntity2);

        EntityFactory pronounFactory = new PronounEntityFactory();

        /*----------------- MAIN --------------------------*/

        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Action:");
            Request request = new Request(scanner.nextLine());
            controller.decodeRequest(request, dataset);


            System.out.println("-----------------------------");

            for (String type : dataset.keySet()) {
                System.out.println(type);
                for (String keyword : dataset.get(type).keySet()) {
                    System.out.println(keyword);
                    System.out.println(dataset.get(type).get(keyword));
                }
            }
            System.out.println("-----------------------------");
        }



    }
}
