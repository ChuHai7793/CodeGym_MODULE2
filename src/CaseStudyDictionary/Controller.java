package CaseStudyDictionary;

import CaseStudyDictionary.Factory.Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Controller {

    private Service service;

    public Controller() {
        service = new Service();
    }

    public void decodeRequest(Request request, HashMap<String, HashMap<String, Entity>> dataset) {
        if (Objects.equals(request.getAction(), "lookup")) {

            ArrayList<String> lookupResult = service.lookup(request.getKeyword(), dataset);
            for (String i: lookupResult){
                System.out.println(i);
            }

        } else if (Objects.equals(request.getAction(), "define")) {
//            if (!request.getParams().isEmpty())
            String defType = switch (request.getParams().getFirst()) {
                case "--adjective", "-a" -> "Adjective";
                case "--pronoun", "-p" -> "Pronoun";
                default -> null;
            };

            if (defType != null) {
                if (service.isExist(request.getKeyword(), defType, dataset)) {
                    System.out.println("ALREADY EXISTED");

                } else {
                    System.out.println("NOT EXISTED YET. CREATE NEW ONE");
                    request.requestDefinition(defType);
                    request.requestSentence();
                    request.requestSentenceMeaning();
                    System.out.println("SAVED");
                    // jointDefinition ="definition,sentence,sentence meaning"
                    String jointDefinition =  String.join(",", request.getParams().subList(1, request.getParams().size()));
                    service.addDefinition(request.getKeyword(),jointDefinition, defType, dataset);
                }
            }


        } else if (Objects.equals(request.getAction(), "drop")) {

        } else if (Objects.equals(request.getAction(), "export")) {

        }
    }

}
