import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class DateClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 59090);
        Scanner in = new Scanner(s.getInputStream());
        System.out.println("The server says" + in.nextLine());
    }
}