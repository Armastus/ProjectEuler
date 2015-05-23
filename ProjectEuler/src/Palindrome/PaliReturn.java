package Palindrome;

import java.util.Scanner;

/**
 * Created by David on 1/26/2015.
 */
public class PaliReturn {
    //yuoasdjfdslkdjalf
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string: ");

        String forward = scanner.nextLine();

        System.out.println(returnPali(forward));

    }

    public static String returnPali (String s) {

        String reverse = "";

        for (int x = s.length()-1; x >= 0; x--) {
            reverse = reverse + s.charAt(x);

            if (s.equals(reverse)) {
                System.out.print("This is a palindrome: ");
                return reverse;
            }
        }
        System.out.print("Your string is not a palindrome.");
        return null;
    }
}
