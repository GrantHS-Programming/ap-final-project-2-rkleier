import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

public class FinalProject {

    ArrayList<String> roomChoices = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Player p1 = new Player(raceDecider(), races);
        System.out.println("You now have the chance to choose a class. Not as drastic as a stat difference but you'll be able to do unique things.\n" +
                "Would you like to be a:\n" +
                "1) Rogue\n" +
                "2) Barbarian\n" +
                "3) Paladin\n" +
                "(Type the corresponding number to the class)");
        String choice = myScanner.next();
        classDecider(choice, p1);
        statBlock(p1);
        System.out.println("Through either narcissistic delusions of grandeur, or some noble mission of saving someone dear, you have arrived at the foot of the the famed 'Dungeon of Oblivion' from which no one has ever escaped." +
                "Despite this you have decided to ented in the hopes of claiming the probably fake ultimate prize of this dungeon: The Elixer of Life");
        newRoom(p1);
    }
    static String[] races = new String[]{"Paragon", "Angel", "Dragon-Born", "War-Forged", "Elf", "Orc", "Human"};
    static String[] raceMessages = new String[]{"You are the pinnacle of all beings. A paragon.\n+3 to all stats", "You're an Angel. Have fun with the wings and getting hit on. \n+2 to all stats",
            "You are a Dragon-Born ,slightly harder to kill and easier to kill others. \n+1 to str \n+1 to spd \n+3 to dur",
            "You are War-Forged, tankier and scarier but slow as hell. \n+1 to str \n+2 to dur", "You are an Elf, a little faster than normal and a lot more elitest. \n+1 to speed",
            "You are an Orc, a little stronger than normal but probably didn't arrive at the start of this dungeon on an academic scholarship. \n+1 to str",
            "You are a human, boring but you're harder to kill due to the indomitable human spirit. \n+1 to dur"};

    static int health = 10;
    static int damage = 3;
    static int speed = 5;

    public static Player turn(Player dude){






        return dude;
    }

    public static void newRoom(Player p1){
        int event = ((int)(Math.random()*4));
        int type = ((int)(Math.random()*3));
        if (event==0){
            String types[] = new String[]{"spike", "boulder", "flame"};
            System.out.println("You have walked into a "+ types[type] + " trap room");
            int difficulty = ((int)(95*Math.random()));
            int chance =50;
            if (type==0){
                chance += (10*p1.getSpd());
            }
            else if (type == 1){
                chance += (10*p1.getStr());
            }
            else if (type==2){
                chance += (10*p1.getDur());
            }
            System.out.println("Chance " +chance);
            System.out.println("Diff " +difficulty);
            if (difficulty<=chance){
                System.out.println("You managed to escape the "+types[type]+" trap and walk away wary of the environment around you.");
            }
            else if (difficulty>chance){
                System.out.println("You got hit by the "+types[type]+" trap and walk away worse for wear.");
                p1.setHealth(p1.getHealth()-2);
                System.out.println("Health = " + p1.getHealth());
            }
        }
        else if (event==1){
            System.out.println("You encounter an enemy behind the door and prepare to fight.");
            if (type==0){
                System.out.println("You should be fine it's just a goblin");
                int yikes = ((int)(2*Math.random()));
                if (yikes==0){
                    difficulty
                }
                else if (yikes == 1){

                }
            }
            else if (type == 1){
                chance += (10*p1.getStr());
            }
            else if (type==2){
                chance += (10*p1.getDur());
            }
        }
        else if (event==2){
            p1.setDur(p1.getDur()+1);
        }
    }

    public static void statBlock(Player p1){
        System.out.println("Speed =" + p1.getSpd());
        System.out.println("Strength =" + p1.getStr());
        System.out.println("Durability +"+ p1.getDur());
    }

    public static Player classDecider(String num, Player p1){

        if (num.equals("1")){
            p1.setSpd(p1.getSpd()+1);
            System.out.println("Speed +1 ");
        }
        if (num.equals("2")){
            p1.setStr(p1.getStr()+1);
            System.out.println("Strength +1 ");
        }
        if (num.equals("3")){
            p1.setDur(p1.getDur()+1);
            System.out.println("Durability +1 ");
        }
        return p1;
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
