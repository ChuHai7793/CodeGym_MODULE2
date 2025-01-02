package DictionaryProject;

import DictionaryProject.Entities.*;

public class Controller {
    private final DefinitionFactory adjDefinitionFactory = new AdjDefinitionFactory();
    private final DefinitionFactory nounDefinitionFactory = new NounDefinitionFactory();
    private Service service = Service.getInstance();

    public Controller() {

    }

    public void handleRequest(Request request) {

        switch (request.getAction()) {
            case "lookup" -> handleLookup(request.getKeyword());
            case "define" -> handleDefine();
            case "drop" -> handleDrop();
            case "export" -> handleExport();
            default -> System.out.println("UNKNOWN ACTION");
        }
    }

    public void handleLookup(String keyword) {

        Word word = service.lookupWord(keyword);
        System.out.print("@ " + word.getText() + "  ");

        for (String pronunciation : word.getPronunciations()) {
            System.out.print(pronunciation+ "  ");
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


    }

    public void handleDefine() {
    }

    public void handleDrop() {
    }

    public void handleExport() {
    }


}
