package IOstream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

    public static void main(String[] args) {

        FileReader fileReader = null;
        String filename = "c:\\windows\\system.ini";
        try {
            fileReader = new FileReader(filename);
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 오류");
        }
    }
}
