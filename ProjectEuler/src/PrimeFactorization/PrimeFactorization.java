package PrimeFactorization;

/**
 * Created by David on 1/19/2015.
 */
public class PrimeFactorization {
    public static void main(String[] args) {
        /*
        //The prime factors of 13195 are 5, 7, 13 and 29.

        increment x
        if given number/2 % x == 0 or number/5 % x == 0
        system out print x
        */
        //Using an L at the end will allow you to use what it called a "long literal".
        long number = 600851475143L;

        for (int x = 2; x <= number; x++) {
            if (number % x == 0) {
                    number = number / x;
                System.out.println(x);
            }
        }
    }
}