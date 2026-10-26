import java.util.Scanner;

/**
 * HackerRank - java int to String
 * https://www.hackerrank.com/challenges/java-int-to-string/problem
 *
 * Reads an integer n and converts it into a String s. Prints "Good job" if
 * converting s back gives n, or "Wrong answer" otherwise. The challenge
 * guarantees that n is between -100 and 10 (inclusive).
 */
public class JavaIntToStringSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = Integer.toString(n);
        sc.close();

        if (n == Integer.parseInt(s) ) { System.out.println("Good job"); }
        else { System.out.println("Wrong answer"); }
    }
}