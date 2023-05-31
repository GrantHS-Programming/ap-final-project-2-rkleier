public class Player {
    private int str = 1;
    private int spd = 1;
    private int dur = 1;

    int health = 10;

    int power = 3;


    public int getHealth() {
        return health;
    }

    public int getPower() {return power;}
    public int getSpd() {
        return spd;
    }
    public void setSpd(int newSpd) {
        this.spd = newSpd;
    }

    public int getStr() {
        return str;
    }

    public int getDur() {
        return dur;
    }
    public void setDur(int newDur) {
        this.dur = newDur;
    }
    public void setStr(int newStr) {
        this.str = newStr;
    }
    public void setPower(int newPower) {
        this.power = newPower;
    }

    public void setHealth(int newHealth) {
        this.health = newHealth;
    }

    public Player (String race, String[] raceList){

        int intTracker = 0;
        for (int i = 0; i < 7; i++){
            if (race.equals(raceList[i])){
                System.out.println(raceList[i]);
                intTracker=i;
            }
        }
        if (intTracker ==0){
            str +=3;
            spd +=3;
            dur +=3;
        }
        else if (intTracker ==1){
            str +=2;
            spd +=2;
            dur +=2;
        }
        else if (intTracker ==2){
            str +=1;
            spd +=1;
            dur +=3;
        }
        else if (intTracker ==3){
            str +=1;
            dur +=2;
        }
        else if (intTracker ==4){
            spd +=1;
        }
        else if (intTracker ==5){
            str +=1;
        }
        else {
            dur +=1;
        }
    }






}


