/**
 * Prints the numbers from 1 to 30, replacing multiples of 3, 5 and 7 with
 * "Fizz", "Buzz" and "Bang", respectively.
 *
 * When a number is a multiple of more than one of them, the words are
 * concatenated in that order (15 prints "FizzBuzz", 21 prints "FizzBang).
 * Numbers that are not multiples of 3, 5 or 7 are printed as they are.
 */
public class ModifiedFizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            String result = "";

            if (i % 3 == 0) { result += "Fizz"; }
            if (i % 5 == 0) { result += "Buzz"; }
            if (i % 7 == 0) { result += "Bang"; }

            if (result.isEmpty()) { System.out.println(i); }
            else { System.out.println(result); }
        }
    }
}