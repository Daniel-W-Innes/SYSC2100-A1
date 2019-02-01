/**
 * @author Daniel Innes 101067175
 */

public class Assignment1 {

    /**
     * Spock's problem
     *
     * @param n The number of planets
     * @param k The number of planets spock has time to visit
     * @return The number of groups of k planets chosen from n
     */

    public static int c(int n, int k) {
        if (k == n || k == 1 || k == 0) {
            return 1; //Best cases that result in one
        } else if (k > n) {
            return 0; //Best cases that result in two
        } else {
            return c(n - 1, k - 1) + c(n - 1, k); //Recursive call
        }
    }

    /**
     * Organizing a Parade of n length
     *
     * @param n The length of the parade
     * @return The number of ways to organize a parade
     */

    public static int P(int n) {
        if (n == 1) {
            return 2; //Best cases that result in two
        } else if (n == 2) {
            return 3; //Best cases that result in three
        } else {
            return P(n - 1) + P(n - 2); //Recursive call
        }
    }

    /**
     * Repeat a character n times
     *
     * @param ch The character to repeat
     * @param n The amount of times to repeat the character
     */

    public static void writeLine(char ch, int n) {
        System.out.print(ch); //Print the character
        if (n > 0) {
            writeLine(ch, n - 1); //Recursive call
        }
    }

    /**
     * Write a block of specific character that is n by m
     *
     * @param ch The character to repeat
     * @param n The horizontal length of the block
     * @param m The vertical length of the block
     */

    public static void writeBlock(char ch, int n, int m) {
        writeLine(ch, n); //Print a line of characters
        System.out.println(); //Move to next line
        if (m > 0) {
            writeBlock(ch, n, m - 1); //Recursive call
        }
    }

    /**
     * Reverse a given number
     * e.g. 12345 -> 54321
     *
     * @param n The number to reverse
     */

    public static void reverseDigits(int n) {
        System.out.print(n % 10); //print the last character
        if (n > 0) {
            reverseDigits((n - n % 10) / 10); //Recursive call
        }
    }

    /**
     * Search for string in an ordered array between two points
     *
     * @param anArray The array to look through
     * @param first The starting point of the search
     * @param last The ending point of the search
     * @param value The string to search for
     * @return The index of the string in the array
     */

    public static int myBinarySearch(String[] anArray, int first, int last, String value) {
        int mid = (last + first) / 2; //Find the midpoint
        if (value.compareTo(anArray[mid]) < 0) { //If the string is before the midpoint
            return myBinarySearch(anArray, first, mid, value); //Recursive call in the first half
        } else if (value.compareTo(anArray[mid]) > 0) { //If the string is after the midpoint
            return myBinarySearch(anArray, mid, last, value); //Recursive call in the second half
        } else { //If the string is equal to the midpoint
            return mid;
        }
    }
}
