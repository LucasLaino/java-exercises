import java.util.Scanner;

/**
 * HackerRank - Java End-of-file
 * https://www.hackerrank.com/challenges/java-end-of-file/problem
 *
 * Reads lines from standard input until EOF and prints each one prefixed
 * by its line number and single space.
 */
public class EndOfFileSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; sc.hasNext(); i++) {
            String s = sc.nextLine();

            System.out.println(i + " " + s);
        }
        sc.close();
    }
}
