package SmallestMultiple;
/**
 * Created by David on 4/11/2015.
 */
public class SmallestMultiple {
    /*2520 is the smallest number that can be divided by each of the numbers from
    1 to 10 without any remainder.*/
public static void main(String[] args){
    for(int x = 1; x <= 1000000000; x++) {
        //try the prime factorization way.
        int counter = 0;
        for (int y = 1; y <= 20; y++) {
            if (x % y == 0) {
                counter++;
                if (counter == 20) {
                    System.out.println(x);
                    }
                }
            }
        }
    }
}