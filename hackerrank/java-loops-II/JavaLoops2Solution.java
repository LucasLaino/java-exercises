import java.io.*;
import java.util.*;

/**
 * HackerRank - Java Loops II
 * https://www.hackerrank.com/challenges/java-loops/problem
 *
 * Reads q queries, each with three integers a, b and n, and prints n terms
 * per query on a single line, separated by spaces. The first term is a +b,
 * and each following term adds the next power of 2 multiplied by b:
 * a + 2^0*b, a + 2^0*b + 2^1*b, and so on.
 */
public class JavaLoops2Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int currentValue = a + b;
            System.out.print(currentValue + " ");

            for (int j = 1; j < n; j++) {
                currentValue = 2 * currentValue + (b - a);
                System.out.print(currentValue + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
