package OneThousandOnePrime;

/**
 * Created by David on 5/22/2015.
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 */
public class OneThousandOnePrime {
    public static void main(String[] args){
        //int num[] = {};

/*        for(int x = 0; x <= num.length; x++){
            if()
            System.out.println(x);*/
        int num = 13;
        for(int x = 2; x <= num; x++){
            for(int y = 2; y <= num; y++){
                if(y % x == 0)
                    System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
