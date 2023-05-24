public class Player {
    private int str = 1;
    private int spd = 1;
    private int dur = 1;

    int health = 10;

    int damage = 3;

    int speed = 5;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int newSpeed) {
        this.speed = speed;
    }

    public void setDamage(int newDamage) {
        this.damage = damage;
    }

    public void setHealth(int newHealth) {
        this.health = health;
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


