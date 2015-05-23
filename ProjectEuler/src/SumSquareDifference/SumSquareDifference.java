package SumSquareDifference;

/**
 * Created by David on 5/19/2015.
 * The sum of the squares of the first ten natural numbers is,
 1^2 + 2^2 + ... + 10^2 = 385
 */
public class SumSquareDifference {
    public static void main (String[] args){
        /*int num = 2;
        System.out.println(Math.pow(2, num));*/
        int total = 0;
        int sum = 0;
        for(int x = 1; x <= 100; x++){
            total += x;
        }

        for(int y = 1; y <= 100; y++){
            sum += Math.pow(y, 2);
        }

        System.out.println(Math.pow(total, 2)); // = 3025
        System.out.println(sum); // = 385
        //System.out.println(total); = 55
        System.out.println(Math.pow(total, 2) - sum); //3025 - 385
    }
}
