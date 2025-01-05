package AdvancedDictionaryProject;

import AdvancedDictionaryProject.Entities.*;

public class Controller {

    private Service service = Service.getInstance();

    public Controller() {

    }

    public void handleRequest(Request request) {

        switch (request.getAction()) {
            case "lookup" -> handleLookup(request.getKeyword());
            case "define" -> handleDefine(request);
            case "drop" -> handleDrop(request.getKeyword());
            case "export" -> handleExport();
            default -> System.out.println("UNKNOWN ACTION or WRONG SYNTAX!");
        }
    }

    /*----------------------------------------- LOOKUP ---------------------------------------------*/
    public void handleLookup(String keyword) {

        Word word = service.lookupWord(keyword);
        if (word!= null){
            System.out.print("@ " + word.getText() + "  ");

            for (String pronunciation : word.getPronunciations()) {
                System.out.print("/"+pronunciation+"/  ");
            }
            System.out.println();

            for (Definition definition : word.getDefinitions()) {
                System.out.println("* " + definition.getWordType());
                System.out.println("- " + definition.getMeaning());
                System.out.println("= " + definition.getSentence());
                System.out.println("= " + definition.getSentenceMeaning());
            }

            System.out.println("* Synonym");
            for (String synonym : word.getSynonyms()) {
                System.out.println("- " + synonym);
            }
        } else {
            System.out.println(keyword+" doesn't exist in dictionary");
        }
    }



    /*----------------------------------------- DEFINE ---------------------------------------------*/
    public String getWordTypeFromRequest(Request request){
        switch (request.getParams().getFirst()){
            case "--adjective","-a" -> {
                return "adjective";
            }
            case "--noun", "-n" -> {
                return "noun";
            }
            case "--verb","-v" -> {
                return "verb";
            }
            case "--pronunciation","-p" -> {
                return "pronunciation";
            }
            case "--synonym","-s" -> {
                return "synonym";
            }
            default -> {
                return  "";
            }
        }
    }

    public Definition getDefinitionFromRequest(String wordType, Request request){
        switch (wordType){
            case "adjective" -> { return new AdjDefinitionFactory().createDefinition(
                    request.getParams().get(1),
                    request.getParams().get(2),
                    request.getParams().get(3)
            );}
            case "noun" -> { return new NounDefinitionFactory().createDefinition(
                    request.getParams().get(1),
                    request.getParams().get(2),
                    request.getParams().get(3)
            );}
            case "verb" -> { return new VerbDefinitionFactory().createDefinition(
                    request.getParams().get(1),
                    request.getParams().get(2),
                    request.getParams().get(3)
            );}
            default -> {return null;}
        }
    }

    public void handleDefine(Request request) {
        String wordType = getWordTypeFromRequest(request);

        if (service.lookupWord(request.getKeyword()) == null){
            if (wordType.isEmpty()){
                System.out.println("Word type doesn't exist OR Wrong syntax");
                return;
            }
            System.out.println("@"+request.getKeyword()+ " is not existed in database, created new one!");
        }

        switch (wordType){
            case "pronunciation" -> {
                request.requestMeaning(wordType);
                service.addPronunciation(request.getKeyword(), request.getParams().get(1));
            }
            case "synonym" -> {
                request.requestMeaning(wordType);
                service.addSynonym(request.getKeyword(), request.getParams().get(1));
            }

            default -> {
                request.requestAll(wordType);
                Definition definition = getDefinitionFromRequest(wordType,request);
                service.addDefinition(request.getKeyword(),definition);
            }
        }
    }


    /*----------------------------------------- DROP ---------------------------------------------*/
    public void handleDrop(String keyword) {

        service.dropWord(keyword);
        System.out.println("@"+keyword +" dropped!");
    }


    /*----------------------------------------- EXPORT ---------------------------------------------*/

    public void handleExport() {
        service.export();

    }


}
