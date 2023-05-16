public class Player {
    int str = 1;
    int spd = 1;
    int durability = 1;

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
            durability +=3;
        }
        else if (intTracker ==1){
            str +=2;
            spd +=2;
            durability +=2;
        }
        else if (intTracker ==2){
            str +=1;
            spd +=1;
            durability +=3;
        }
        else if (intTracker ==3){
            str +=3;
            spd +=3;
            durability +=3;
        }
        else if (intTracker ==4){
            str +=3;
            spd +=3;
            durability +=3;
        }
        else if (intTracker ==5){
            str +=3;
            spd +=3;
            durability +=3;
        }
        else if (intTracker ==6){
            str +=3;
            spd +=3;
            durability +=3;
        }
    }




}


