package MultiplesOf3and5;

/*Created by David on 1/15/2015.*/

public class MultiplesOf3and5 {

    public static void main (String[] args) {
        int sum = 0;

        for (int x = 0; x < 1000; x++) {

            if (x % 3 == 0 || x % 5 == 0) {
                sum += x;
            }
        }
        System.out.println(sum);
    }
}
