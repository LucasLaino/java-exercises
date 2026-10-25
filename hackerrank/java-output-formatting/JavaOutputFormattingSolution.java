import java.util.Scanner;

/**
 * HackerRank — Java Output Formatting
 * https://www.hackerrank.com/challenges/java-output-formatting
 *
 * Reads three lines, each with a String and an integer, and prints them
 * as two aligned columns using printf: the text left-justified in a fixed
 * width, and the integer padded with leading zeros to three digits.
 */
public class JavaOutputFormattingSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0; i<3 ;i++) {
            String s = sc.next();
            int n = sc.nextInt();

            System.out.printf("%-15s%03d%n", s, n);
        }

        System.out.println("================================");
        sc.close();
    }
}

