package ss16.Baitap2;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadCSV {

    public static void main(String[] args)  {

        try {
            ReadCsvEx.readCsv("src/ss16/Baitap2/test.csv");
        } catch (FileNotFoundException e) {
            System.out.printf("File not found: %s\n", e.getMessage());
        } catch (IOException e){
            System.out.printf("Error reading file: %s\n", e.getMessage());
        }
    }
}
