package Palindrome;

import java.util.Scanner;

/**
 * Created by David on 1/24/2015.
 */
public class Palindrome {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String forwardString = scanner.nextLine();

        if (palCheck(forwardString)) {
            System.out.println("Your string: " + forwardString + " is a palindrome.");
        }else{
            System.out.println("Your string: " + forwardString + " is not a palindrome.");
        }
    }

    public static boolean palCheck (String s) {

            String reverseString = "";
            for (int x = s.length()-1; x >= 0; x--){
                reverseString = reverseString + s.charAt(x);
                if (s.equals(reverseString)) {
                    return true;
                }
            }
        return false;
    }
}
