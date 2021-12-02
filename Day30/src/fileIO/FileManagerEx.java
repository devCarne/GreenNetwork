package fileIO;

import java.io.File;

public class FileManagerEx {

    FileManagerEx() {
        String filename = "c:\\windows\\system.ini";
        File f1 = new File(filename);
        System.out.println(f1.getPath() +  ", " + f1.getParent() + ", " + f1.getName());

        String result = "";

        if (f1.isFile()) {
            result = "파일";
        } else if (f1.isDirectory()) {
            result = "디렉토리";
        }
        System.out.println(f1.getPath() + "은 " + result + "입니다.");

        File f2 = new File("c:\\tmp\\java_sample");
        if(!f2.exists()) {
            f2.mkdir();
        }

        listDirectory(new File("c:\\tmp"));

        f2.renameTo(new File("c:\\tmp\\javasample"));
        listDirectory(new File("c:\\tmp"));
    }




    public static void listDirectory(File dir) {
        System.out.println("-------" + dir.getPath() + "의 서브 리스트입니다.");
        File[] subFiles = dir.listFiles();

        for (File f : subFiles) {
            long t = f.lastModified();
            System.out.println(f.getName());
            System.out.println("파일 크기 : " + f.length());
            System.out.printf("수정한 시간 : %tb %td %ta %tT\n%n", t, t, t, t);
        }
    }

    public static void main(String[] args) {
        new FileManagerEx();
    }
}

