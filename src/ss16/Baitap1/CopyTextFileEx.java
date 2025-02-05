package ss16.Baitap1;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class CopyTextFileEx {

    public static void copyTextFile(String srcFilePath, String destFilePath) throws IOException {

            isExist(srcFilePath, destFilePath);

            copySrcToDest(srcFilePath, destFilePath);

    }

    private static void copySrcToDest(String srcFilePath, String destFilePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(srcFilePath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destFilePath));
        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line +"\n");

        }
        br.close();
        bw.close();
    }

    private static void isExist(String srcFilePath, String destFilePath) throws FileNotFoundException, FileAlreadyExistsException {
        File srcFile = new File(srcFilePath);
        File destFile = new File(destFilePath);
        if(!srcFile.exists()) {
            throw new FileNotFoundException(srcFilePath);
        }
        if (destFile.exists()){
            throw new FileAlreadyExistsException(destFilePath);
        }
    }
}
