import java.util.Scanner;

public class ThirdfloorN {
    public static void displayN(){
        Scanner k=new Scanner(System.in);
        int chosie;
        System.out.println("you here him go past you you don't know what what to do.  1) go to the next room and hide under the bed.\n" +
                " 2)try and run down stairs before he here's  ");
        chosie=k.nextInt();
        if (chosie == 1){
            System.out.println("you go under the bed and you here him open the closet up and then he goes down the stairs");
        }
        else if(chosie==2){
            System .out.println("He is way ton fast for you to get down the stairs and then he grabs you. ");
            displayS();
        }
    }
    public static void displayS(){
        int random = (int) (Math.random()) * 10 + 4;
        int userguess;
        Scanner k = new Scanner(System.in);
        System.out.println("Chose a number from 1 to 10. If you guess it you escape");
        userguess = k.nextInt();
        if (userguess == random) {
            System.out.println("You Escaped");}
        else
            System.out.println("You died, try again");
    }
    }
    

