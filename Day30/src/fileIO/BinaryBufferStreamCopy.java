package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryBufferStreamCopy {

    public static void main(String[] args) {

        File src = new File("Day30\\src\\fileIO\\크리스마스_다이어리꾸미기_눈사람_그리기9.jpg");
        File desc = new File("c:\\tmp\\크리스마스_다이어리꾸미기_눈사람_그리기9.jpg");

        byte[] buf = new byte[1024 * 10];

        try {
            FileInputStream fileInputStream = new FileInputStream(src);
            FileOutputStream fileOutputStream = new FileOutputStream(desc);

            while (true) {
                int n = fileInputStream.read(buf);
                fileOutputStream.write(buf, 0, n);
                if (n < buf.length) {
                    break;
                }
            }

            fileInputStream.close();
            fileOutputStream.close();

            System.out.println(src.getPath() + "를 " + desc.getPath() + "로 복사 완료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
