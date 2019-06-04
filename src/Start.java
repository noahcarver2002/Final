
import java.util.Scanner;

public class Start {


    public static void displayStart() {
        for (int i = 0; i < 10; i++) {
            System.out.println(
            );
        }
        boolean start = true;
        int go;
        Scanner k = new Scanner(System.in);
        System.out.println("                           |----------------------------------|");
        System.out.println("                           |          Welcome to Escape       |");
        System.out.println("                           |      Will you survive or die.    |");
        System.out.println("                           |                                  |");
        System.out.println("                           |      1)Start                     |");
        System.out.println("                           |      2)Show your run             |");
        System.out.println("                           |      3)Quit                      |");
        System.out.println("                           |__________________________________|");
        while (start) {
            go = k.nextInt();
            if (go == 1) {
                Escape.displayEscape();
                start = false;
            }
            else if (go == 2) {
                RunDetails.displayScore();
            }
            else if (go == 3)
                System.exit(0);
        }
    }
}