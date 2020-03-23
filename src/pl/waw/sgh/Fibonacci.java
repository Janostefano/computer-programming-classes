package pl.waw.sgh;

public class Fibonacci {

    public static int calculateNFibonacciNumber (int number){
        if (number == 1){
            return 0;
        }
        else if (number ==2){
            return 1;
        }

        return calculateNFibonacciNumber(number -1) + calculateNFibonacciNumber(number -2);


    }

    public static int calculateFibonacciSum(int items){

        int sum = 0;

        for (int i = 0; i < items; i++){
            sum += calculateNFibonacciNumber(i + 1);
        }

        return sum;
    }
}
