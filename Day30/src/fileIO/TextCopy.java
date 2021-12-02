package fileIO;

import java.io.*;

public class TextCopy {

    public static void main(String[] args) {

        File src = new File("Day30\\src\\fileIO\\TextCopy.java");
        File desc = new File("c:\\tmp\\TextCopy.txt");

        try{
            FileReader fileReader = new FileReader(src);
            FileWriter fileWriter = new FileWriter(desc);

            int c;
            while((c = fileReader.read()) != -1) {
                fileWriter.write(c);
            }

            fileReader.close();
            fileWriter.close();

            System.out.println(src.getPath() + "를 " + desc.getPath() + "로 복사 완료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
