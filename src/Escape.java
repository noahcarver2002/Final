import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

public class Escape {

    public static void displayEscape(){
    int A1;
    int bat;
//    boolean Count = true;
    Scanner k= new Scanner(System.in);
    System.out.println("You are kidnapped. you are looked in a room that is 4 s2tories high.\n" +
            "The Guy that kidnapped you is in the house. 1) jump of the window. 2) go out the door");
    A1=k.nextInt();
    if (A1 == 1)
        Jump(A1);
    else if(A1 == 2){
        int a2;
        System.out.println("You hear him getting close. 1) go back to the room. 2) Go to the Bathroom.");
        a2=k.nextInt();
            if(a2 == 1) {
                int chose;
                String bed;
                String closet;
                System.out.println("Hide 1)bed  2)closet ");
                chose=k.nextInt();
                System.out.println("The kidnapper goes into the room. He is mad and walks away.");
                System.out.println("You come out of hiding. He Never left. TRY again");
            }
            else if(a2 == 2){
                int a3;
                System.out.println("You are behind the bathroom door. You see the guy go to the room.");
                System.out.println("1) Go for the Stairs. 2) Stay.");
                a3=k.nextInt();
//                while(Count)
                if (a3 == 1){
                    System.out.println("He Saw you getting out the bathroom. Try again");
                }
                    if (a3 == 2)
                        stay(a3,bat);
            }
    }
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
    public static void stay(int a3, int bat){
    int a1;
    Scanner k = new Scanner(System.in);
    System.out.println("You Chose to stay. The Kidnapper notice you left. \n" +
            " He is MAD. He gets out the room and goes down stairs");
    System.out.println("1) Go DAWN a flor. 2) Look around ");
    a1=k.nextInt();
    if (a1 == 1) {
       DawnAFloor();
        }
        else if (a1 == 2) {
        int getfirst;
        System.out.println("You Chose to Look around. It's safe to walk around. There is a bat.");
        System.out.println("1) Try to get bat. 2) Go Dawn a flor.");
        getfirst=k.nextInt();
        if( getfirst == 1) {
            chosebat(bat);
            DawnAFloor();
        }
        else
            DawnAFloor();

    }
    }
    public static void DawnAFloor() {
        System.out.println("You are now in floor 3. You see the kidnapper go into a room \n" +
                " at the end of the hall. The stair are next to his room.");
    }
    public static void chosebat(int bat){
    int count = 0;
    while(count <= 3) {
        int random = (int) (Math.random()) * 30 + 27;
        int userguess;
        Scanner k = new Scanner(System.in);

        System.out.println("chose the right number from 1-30 get bat. "+count+"/3 ");
        userguess = k.nextInt();
        if (userguess == random){
            System.out.println("new Item obtain, Bat. ");
            bat=bat-1;
            count=count+4;
        }
        else {
            System.out.println("Try again");
        count++;}
    }
    }
    }
    