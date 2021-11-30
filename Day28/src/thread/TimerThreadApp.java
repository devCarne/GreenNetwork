package thread;

public class TimerThreadApp {

    public static void main(String[] args) {
        TimerThread th = new TimerThread();
        TimerThread th2 = new TimerThread();
        th.start();
        th2.start();

    }
}
