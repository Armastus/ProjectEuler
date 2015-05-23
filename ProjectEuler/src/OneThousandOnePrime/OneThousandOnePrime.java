package OneThousandOnePrime;

/**
 * Created by David on 5/22/2015.
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 */
public class OneThousandOnePrime {
    public static void main(String[] args){

        for(int x = 2; x <= 100; x++){
            if(13 % x == 0) {
                //x = x / 100;
                System.out.println(x);
            }
        }
    }
}
