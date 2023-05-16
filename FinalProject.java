import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FinalProject {

    public static void main(String[] args) {





    }
    String[] races = new String[]{"Paragon", "Angel", "Dragon-Born", "War-Forged", "Elf", "Orc", "Human"};
    String[] raceMessages = new String[]{"You are the pinnacle of all beings. A paragon.\n +3 to all stats", "You're an Angel. Have fun with the wings and getting hit on. \n +2 to all stats",
            "You are a Dragon-Born ,slightly harder to kill and easier to kill others. \n +1 to str \n +1 to spd \n +3 to dur", "You are War-Forged, tankier and scarier but slow as hell. \n +2 to str \n -1 to spd \n +3 to dur"};

    int health = 10;
    int damage = 3;
    int spd = 5;
    public String raceDecider(){
        String race;
        int raceNum = (int)(101 * Math.random());
        System.out.println(raceNum);
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
        else {//26%
            race = races[6];
            return race;
        }

    }


}
