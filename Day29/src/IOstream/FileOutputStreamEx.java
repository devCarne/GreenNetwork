package IOstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

    public static void main(String[] args) {

        byte[] b = {7, 51, 3, 4, -1, 24};

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("c:\\test.txt");
            for (byte value : b) {
                fileOutputStream.write(value);
            }
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("입력 오류");
        }
        System.out.println("c:\\test.out을 저장하였습니다.");
    }
}
