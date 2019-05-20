import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class thirdfloor {
    public static void thirdfloor(){
        Scanner k = new Scanner(System.in);
        int room3;
        System.out.println("1) go to a room. 2) go to a closet. ");
        room3=k.nextInt();
        if (room3 == 1)
            ThirdfloorM.displayM();

        else if(room3 == 2)
            TirdfloorN.displayN();


    }

}
