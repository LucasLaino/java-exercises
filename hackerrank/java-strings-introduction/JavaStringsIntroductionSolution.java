import java.util.Scanner;

/**
 * HackerRank - Java Strings Introduction
 * https://www.hackerrank.com/challenges/java-strings-introduction/problem
 *
 * Reads two lines, each with a non-empty lowercase String, and prints three lines:
 * the sum of their lengths; {@code Yes} if the first String is are lexicographically
 * greater than second String otherwise print {@code No}; and both
 * strings with the first letter capitalized, separated by space.
 */
public class JavaStringsIntroductionSolution {
    private static String capitalize(String text) {
        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstString = sc.nextLine();
        String secondString = sc.nextLine();
        sc.close();

        System.out.println(firstString.length() + secondString.length());

        if (firstString.compareTo( secondString) > 0) { System.out.println("Yes"); }
        else { System.out.println("No"); }

        System.out.println(capitalize(firstString) + " " + capitalize(secondString));
    }
}
