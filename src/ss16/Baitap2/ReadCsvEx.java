package ss16.Baitap2;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadCsvEx {


    public static void readCsv(String filePath) throws IOException {

        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException(filePath);
        }

        printCountries(file);
    }

    private static void printCountries(File file) throws IOException {
        List<String> countriesList = new LinkedList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = br.readLine())!=null){
            String country  = line.split(",")[2];
            countriesList.add(country);
        }
        System.out.print(countriesList);
    }

}
