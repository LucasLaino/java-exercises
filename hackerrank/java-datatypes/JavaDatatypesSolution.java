import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * HackerRank - Java Datatypes
 * https://www.hackerrank.com/challenges/java-datatypes/problem
 *
 * Reads T integers of arbitrary size and prints which primitive types
 * (byte, short, int, long) can store each one. Values that do not fit in a
 * long are detected through the InputMismatchException thrown by nextLong().
 */
public class JavaDatatypesSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long n = sc.nextLong();
                System.out.println(n + " can be fitted in: ");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) { System.out.println("* byte"); }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) { System.out.println("* short"); }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) { System.out.println("* int"); }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) { System.out.println("* long"); }
            }
            catch (InputMismatchException ime) { System.out.println(sc.next() + " can't be fitted anywhere."); }
        }
        sc.close();
    }
}