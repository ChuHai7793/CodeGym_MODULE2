package ss16.Baitap1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class CopyTextFile {
    public static void main(String[] args) throws IOException {
        try {
            CopyTextFileEx.copyTextFile("src/ss16/Baitap1/src.txt", "src/ss16/Baitap1/dest.txt");

        } catch (FileNotFoundException e) {
            System.out.printf("File not found: %s\n", e.getMessage());
        }catch (FileAlreadyExistsException e) {
            System.out.printf("File already exists: %s\n", e.getMessage());
        }
        catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
