import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FinalProject {

    public static void main(String[] args) {





    }
    String[] races = new String[]{"Paragon", "Angel", "Dragon-Born", "War-Forged", "Elf", "Orc", "Human"};
    String[] raceMessages = new String[]{"You are the pinnacle of all beings. A paragon.\n +3 to all stats", "You're an Angel. Have fun with the wings and getting hit on. \n +2 to all stats", }
    int str;
    int spd;
    int durability;
    public String raceDecider(){
        String race;
        int raceNum = (int)(101 * Math.random());
        if (raceNum == 1){//1% paragon
            race = races[0];
            return race;
        }
        else if (raceNum < 5) {//3% angel
            System.out.println();
            race = races[1];
            return race;
        }
        else if (raceNum < 10) {//5%
            race = races[2];
            return race;
        }
        else if (raceNum < 25) {//15%
            race = races[3];
            return race;
        }
        else if (raceNum < 50) {//25%
            race = races[4];
            return race;
        }
        else if (raceNum < 75) {//25%
            race = races[5];
            return race;
        }
        else if (raceNum <= 100) {//26%
            race = races[6];
            return race;
        }
        System.out.println(raceNum);
    }


}
