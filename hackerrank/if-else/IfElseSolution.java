import java.io.*;

/**
 * HackerRank - If-Else
 * https://www.hackerrank.com/challenges/java-if-else/problem
 *
 * Reads an integer n and prints "Weird" if n is odd, or if n is even between 6 and 20 (inclusive)
 * Otherwise, prints "Not Weird".
 */
public class IfElseSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        if (n % 2 != 0) { System.out.println("Weird"); }
        else if (n >= 2 && n <= 5) { System.out.println("Not Weird"); }
        else if (n >= 6 && n <= 20) { System.out.println("Weird"); }
        else if (n > 20) { System.out.println("Not Weird"); }

        bufferedReader.close();
    }
}
