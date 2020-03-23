package pl.waw.sgh;

public class Bowling {

    public static int calculateBowlsSum(int number) {
        int sum = 0;

        for (int i = 1; i < number + 1; i++) {
                sum += i;
        }
        return sum;
    }
}
