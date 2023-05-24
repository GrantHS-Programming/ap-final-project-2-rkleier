import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FinalProject {

    public static void main(String[] args) {
        Player p1 = new Player(raceDecider(), races);



    }
    static String[] races = new String[]{"Paragon", "Angel", "Dragon-Born", "War-Forged", "Elf", "Orc", "Human"};
    static String[] raceMessages = new String[]{"You are the pinnacle of all beings. A paragon.\n+3 to all stats", "You're an Angel. Have fun with the wings and getting hit on. \n+2 to all stats",
            "You are a Dragon-Born ,slightly harder to kill and easier to kill others. \n+1 to str \n+1 to spd \n+3 to dur",
            "You are War-Forged, tankier and scarier but slow as hell. \n+1 to str \n+2 to dur", "You are an Elf, a little faster than normal and a lot more elitest. \n+1 to speed",
            "You are an Orc, a little stronger than normal but probably didn't arrive at the start of this dungeon on an academic scholarship. \n+1 to str",
            "You are a human, boring but you're harder to kill due to the indomitable human spirit. \n+1 to dur"};

    static int health = 10;
    static int damage = 3;
    static int spd = 5;
    public static Player turnStart(Player dude){







        return dude;
    }

    public static String raceDecider(){
        String race;
        int raceNum = (int)(101 * Math.random());
        System.out.println(raceNum);
        if (raceNum == 1){//1% paragon
            System.out.println(raceMessages[0]);
            race = races[0];
            return race;
        }
        else if (raceNum < 5) {//3% angel
            System.out.println(raceMessages[1]);
            race = races[1];
            return race;
        }
        else if (raceNum < 10) {//5%
            System.out.println(raceMessages[2]);
            race = races[2];
            return race;
        }
        else if (raceNum < 25) {//15%
            System.out.println(raceMessages[3]);
            race = races[3];
            return race;
        }
        else if (raceNum < 50) {//25%
            System.out.println(raceMessages[4]);
            race = races[4];
            return race;
        }
        else if (raceNum < 75) {//25%
            System.out.println(raceMessages[5]);
            race = races[5];
            return race;
        }
        else {//26%
            System.out.println(raceMessages[6]);
            race = races[6];
            return race;
        }

    }


}
