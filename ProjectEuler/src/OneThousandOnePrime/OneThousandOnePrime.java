package OneThousandOnePrime;

/**
 * Created by David on 5/22/2015.
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 */
public class OneThousandOnePrime {
    public static void main(String[] args){
        int count = 1;
        long num = 10000000;
        boolean isPrime = true;

        for(int x = 2; x <= num; x++){
            for(int y = 0; y <= num; y++){
                if(x != y && x % y == 2){
                    x = x/y;
                    System.out.println(x);
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
                if(count == 100){
                    System.out.println(x + " ");
                }
                isPrime = true;
            }
        }
        System.out.println();
    }
}
