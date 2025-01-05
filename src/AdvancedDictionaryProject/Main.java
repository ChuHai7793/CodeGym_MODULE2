package AdvancedDictionaryProject;

import DictionaryProject.Controller;
import DictionaryProject.Dataset;
import DictionaryProject.Request;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //------------------------------CREATE DATASET-------------------------------------------------------------
        new Dataset();
        //----------------------------------------------------------------------------------------------------
        while (true) {
            Controller controller = new Controller();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Action:");
            Request request = new Request(scanner.nextLine());
            controller.handleRequest(request);
        }
    }
}
