/**
 * HackerRank - FizzBuzz
 * https://www.hackerrank.com/challenges/fizzbuzz/problem
 *
 * Prints the numbers from 1 to 100, one per line, replacing multiples of 3
 * with "Fizz", multiples of 5 with "Buzz", and multiples of both with "FizzBuzz".
 * If number is not a multiple of 3 or 5, print the number.
 */
public class FizzBuzzSolution {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) { System.out.println("FizzBuzz"); }
            else if (i % 3 == 0) { System.out.println("Fizz"); }
            else if (i % 5 == 0) { System.out.println("Buzz"); }
            else { System.out.println(i); }
        }
    }
}
