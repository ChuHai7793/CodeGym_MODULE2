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

        if (commandElements.length == 2){
            this.action = commandElements[0];
            this.keyword = commandElements[1];
            this.params.add("");
        } else if(commandElements.length==3){
            this.action = commandElements[0];
            this.params.add(commandElements[1]);
            this.keyword = commandElements[2];
        }

    }
    //-----------------------------------------------------------------------------------------------
    public void requestDefinition(String prefix){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prefix+" Definition: ");
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
