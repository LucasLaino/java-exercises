import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        /**
         * HackerRank - Weird or Not Weird
         * https://www.hackerrank.com/challenges/java-if-else/problem
         *
         * Given an integer n, perform de following conditional actions:
         * - If n is odd, print "weird"
         * - If n is even and in the inclusive range of 2 to 5, print "Not Weird"
         * - If n is even and in the inclusive range of 6 to 20, print "Weird"
         * - If n is even and greater than 20, print "Not Weird"
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        if (n % 2 != 0) { System.out.println("Weird"); }
        else if (n >= 2 && n <= 5) { System.out.println("Not Weird"); }
        else if (n >= 6 && n <= 20) { System.out.println("Weird"); }
        else if (n > 20) { System.out.println("Not Weird"); }

        bufferedReader.close();
    }
}
