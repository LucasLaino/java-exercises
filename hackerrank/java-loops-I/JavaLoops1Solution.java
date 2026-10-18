import java.io.*;

/**
 * HackerRank - java-loops-i
 * Given an integer, N, print it's first 10 multiplies.
 * Each multiple N x i (Where 1 <= i <=10) should be printed on a new line in the form N x i = result
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
