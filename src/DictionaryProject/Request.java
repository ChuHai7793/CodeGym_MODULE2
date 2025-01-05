package DictionaryProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Request {

    private String action, keyword;
    private ArrayList<String> params = new ArrayList<>();

    public Request(){

    }


    public Request(String command) {
        String[] commandElements = command.split("\\s");


        switch (commandElements.length){
            case 1 -> {
                this.action = commandElements[0];
                this.keyword = "";
                this.params.add("");
            }
            case 2 -> {
                this.action = commandElements[0];
                this.keyword = commandElements[1];
                this.params.add("");
            }
            case 3 -> {
                this.action = commandElements[0];
                this.params.add(commandElements[1]);
                this.keyword = commandElements[2];
            }
            default -> {
                this.action = "";
                this.params.add("");
                this.keyword = "";
            }
        }
    }
    //-----------------------------------------------------------------------------------------------
    public void requestMeaning(String prefix){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prefix.toUpperCase()+" Definition: ");
        this.params.add(scanner.nextLine());
    }

    public void requestSentence(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sentence: ");
        this.params.add(scanner.nextLine());
    }

    public void requestSentenceMeaning(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sentence Meaning: ");
        this.params.add(scanner.nextLine());

    }

    public void requestAll(String wordType){
        requestMeaning(wordType.toUpperCase());
        requestSentence();
        if (!this.params.get(2).isEmpty()){ // If there is sentence then request sentence meaning
            this.requestSentenceMeaning();
        } else {
            this.params.add("");
        }
    }


    //-----------------------------------------------------------------------------------------------
    public String getAction() {
        return action;
    }

    public String getKeyword() {
        return keyword;
    }

    public ArrayList<String> getParams() {
        return params;
    }
}
