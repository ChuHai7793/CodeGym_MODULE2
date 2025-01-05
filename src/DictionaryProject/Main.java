package DictionaryProject;

import DictionaryProject.Entities.AdjDefinitionFactory;
import DictionaryProject.Entities.Definition;
import DictionaryProject.Entities.DefinitionFactory;
import DictionaryProject.Entities.Word;
import DictionaryProject.Request;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
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
