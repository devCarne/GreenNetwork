package IOstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {

    public static void main(String[] args) {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        FileWriter fileWriter = null;
        String filename = "c:\\test.txt";

        try {
            fileWriter = new FileWriter(filename);
            int c;

            while ((c = inputStreamReader.read()) != -1) {
                fileWriter.write(c);
            }
            inputStreamReader.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
