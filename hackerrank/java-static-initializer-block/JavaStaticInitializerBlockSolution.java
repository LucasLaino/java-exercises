import java.util.Scanner;

/**
 * HackerRank - Java Static Initializer Block
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 *
 * Reads the breadth and height of a parallelogram inside a static
 * initialization block and prints its area, or an error message if either
 * value is not positive.
 */
public class JavaStaticInitializerBlockSolution {
    static int breadth;
    static int height;
    static boolean isValidInput;

    static {
        Scanner sc = new Scanner(System.in);
        breadth = sc.nextInt();
        height = sc.nextInt();
        sc.close();

        if (breadth <= 0 || height <= 0) {
            isValidInput = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            isValidInput = true;
        }
    }

    public static void main(String[] args) {
        if (isValidInput) {
            System.out.println(breadth * height);
        }
    }
}