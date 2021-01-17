import java.lang.Thread;
import java.util.Scanner;

public class ThreadExample {

    private static boolean running = true;
    private static String str = "Input a String";

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (running) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(str);
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        Scanner scn = new Scanner(System.in);
        while (true) {
            str = scn.nextLine();
            if (str.equals("exit")) {
                System.out.println("Ending Thread...");
                running = false;
                break;
            }
        }
    }
}