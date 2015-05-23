package PrimeFactorization;

/**
 * Created by David on 1/31/2015.
 */
public class PrimeLargePali {
    //making a comment now let chagne stuff.

    public static void main(String[] args) {
        int var1 = 999;
        int var2 = 999;
        for (int x = var1; x >= 1; x--) {
            // System.out.println(x);
            for (int y = var2; y >= 1; y--) {
                int answer = x * y;
                if (reverseNumber(answer)) {
                    String isX = Integer.toString(x);
                    String isY = Integer.toString(y);
                    if (isX.length() == 3 && isY.length() == 3)
                    System.out.println(x + " x " + y + " = " + answer);
                }
            }
        }
    }
    //This is returning true each time the answer is a palindrome.
    public static boolean reverseNumber(int number) {
        String holder = Integer.toString(number);
        String reverse = "";
        for(int x = holder.length()-1; x >= 0; x--){
            reverse = reverse + holder.charAt(x);
        }
        return holder.equals(reverse);
    }
}


