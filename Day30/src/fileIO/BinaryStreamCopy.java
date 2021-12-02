package fileIO;

import java.io.*;

public class BinaryStreamCopy {

    public static void main(String[] args) {

        File src = new File("Day30\\src\\fileIO\\크리스마스_다이어리꾸미기_눈사람_그리기9.jpg");
        File desc = new File("c:\\tmp\\크리스마스_다이어리꾸미기_눈사람_그리기9.jpg");

        try {
            FileInputStream fileInputStream = new FileInputStream(src);
            FileOutputStream fileOutputStream = new FileOutputStream(desc);

            int c;
            while ((c = fileInputStream.read()) != -1) {
                fileOutputStream.write((byte) c);
            }

            fileInputStream.close();
            fileOutputStream.close();

            System.out.println(src.getPath() + "를 " + desc.getPath() + "로 복사 완료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
