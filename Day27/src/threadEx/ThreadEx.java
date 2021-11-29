package threadEx;

public class ThreadEx extends Thread {

    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        run2();
    }

    public static void run2() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i + ": main() ");
        }
    }
}


class MyThread extends Thread {
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i + " ");
        }
    }
}
