import java.util.Scanner;

public class ThirdfloorN {
    public static void displayN(){
        Scanner k=new Scanner(System.in);
        int chosie;
        System.out.println("you here him go past you you don't know what what to do.");
        System.out.println("1) go to the next room and 2)try to run down stairs");
        chosie=k.nextInt();
        if (chosie == 1){
            System.out.println("You go to the room and hide under the bed and you here him open the closet door, then he goes down the stairs");
            propelN();
        }
        else if(chosie==2){
            System .out.println("He is way to fast for you to get down the stairs and then he grabs you. ");
            Escape.displaydeath();
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
        else if(userguess != random){
            System.out.println("You died");
        Escape.displaydeath2();}
    }

    public static void propelN() {
        Scanner k = new Scanner(System.in);
        int choice;
        System.out.println("you have the the choice to skip the second floor and go to the 1st will you go but yo also don't know where he is at" +
                "  1) go to second floor 2) go to the 1st and find away to escape ");
        choice = k.nextInt();
        if (choice == 1) {
            System.out.println(" you go to the second to play it safe but then he traps you");
            Escape.displaydeath2();
        } else if (choice == 2) {
            System.out.println(" you go there first and you find his key you get in the car and drive off");
            System.out.println("you Escaped");
            Escape.displayStart();
        }

        else {
            System.out.println("You die");
            Escape.displaydeath2();
        }
        //String[] guyDie = {"-", "X", "|", "*", "\u00A0"};



    }



        }








