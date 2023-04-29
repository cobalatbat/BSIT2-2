import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if (i == 10) {
//                System.out.println("Stopped");
                continue;
            }
            System.out.println(i);
        }
    }
}