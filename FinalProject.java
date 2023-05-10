import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FinalProject {

    public static void main(String[] args) {
        game();
    }
    public static void game(){
        int str;
        int spd;
        int durability;




        int raceNum = (int)(101 * Math.random());
        if (raceNum == 1){//1%
            System.out.println("You are the pinnacle of all beings. A paragon.");
        }
        else if (raceNum < 5) {//3%
            System.out.println("");
        }
        else if (raceNum < 10) {//5%

        }
        else if (raceNum < 25) {//15%

        }
        else if (raceNum < 50) {//3%

        }
        else if (raceNum < 75) {//3%

        }
        else if (raceNum < 100) {//3%

        }
        System.out.println(raceNum);
    }


}
