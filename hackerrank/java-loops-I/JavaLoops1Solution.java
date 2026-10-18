import java.io.*;

/**
 * HackerRank - java Loops I
 * https://www.hackerrank.com/challenges/java-loops-i/problem
 *
 * prints the first 10 multiplies of a given integer
 * Each multiple are printed on a new line in the form N x i = result.
 */
public class JavaLoops1Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }

        bufferedReader.close();
    }
}
