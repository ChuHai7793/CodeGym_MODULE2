package DictionaryProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Service service = Service.getInstance();

        //------------------------------CREATE DATASET-------------------------------------------------------------
        new Dataset();
        //----------------------------------------------------------------------------------------------------
        while (!service.isExit()) {
            Controller controller = new Controller();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Action:");
            Request request = new Request(scanner.nextLine());
            controller.handleRequest(request);
        }
    }
}
