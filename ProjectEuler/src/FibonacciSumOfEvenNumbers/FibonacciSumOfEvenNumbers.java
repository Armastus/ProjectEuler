package FibonacciSumOfEvenNumbers;

/**
 * Created by David on 1/18/2015.
 */
public class FibonacciSumOfEvenNumbers {
    public static void main(String args[]) {
        int sum = 0;
        int fourMil = 4000000;
        int x = 0;

        while(fibSeq(x) <= fourMil){
            if (fibSeq(x) % 2 == 0) {
                sum += fibSeq(x);
                System.out.println(sum);
            }
            x++;
        }
    }

    public static int fibSeq(int n){
        int fib;

        if (n == 0){
            return 0;
        }else if (n <= 2) {
            return 1;
        }else{
            fib = fibSeq(n - 1) + fibSeq(n - 2);
            return fib;
        }
    }
}
