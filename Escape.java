import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

public class Escape {
public static void main(String [] args){
    int A1;

    Scanner k= new Scanner(System.in);
    System.out.println("You are kidnapped. you are looked in a room that is 4 s2tories high.\n" +
            "The Guy that kidnapped you is in the house. 1) jump of the window. 2) go through the door");
    A1=k.nextInt();
    if (A1 == 1)
        Jump(A1);
    else if(A1 == 2){
        int a2;
        System.out.println("You hear him getting close. 1) Stay in room. 2) Go to the Bathroom.");
        a2=k.nextInt();
            if(a2 == 1)
                System.out.println("He is getting closer. you hide under the bed. he come in. He found You. Try again");
            else if(a2 == 2){
                int a3;
                System.out.println("You are behind the bathroom door. You see the guy go to the room.");
                System.out.println("1) Go to the Stairs. 2) Stay.");
                a3=k.nextInt();

}
public static void Jump(int A1) {
    int random = (int) (Math.random()) * 100 + 12;
    int userguess;
    Scanner k = new Scanner(System.in);
    System.out.println("Chose a number from 1 to 100. If you guess it you escape");
    userguess = k.nextInt();
    if (userguess == random) {
        System.out.println("You Escaped");}
        else
            System.out.println("You died, try again");
    }
    public static void stay(int a3){

    }
}

