package pl.waw.sgh;

public class Bowling {


    public static int calculateBowlsSum(int number) {

        if (number == +1){
            return 1;
        }

        return calculateBowlsSum(number -1) + number;
    }
}
