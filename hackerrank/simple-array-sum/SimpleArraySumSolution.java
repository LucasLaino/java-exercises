import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * HackerRank - Simple Array Sum
 * https://www.hackerrank.com/challenges/simple-array-sum/problem
 *
 * Reads two lines: the first contains the size of the array, and the second
 * contains its elements separated by one space. Prints the sum of the elements.
 * The statement guarantees the input format, but the program validates it
 * anyway: the first line must be an integer equal to the number of elements.
 */
public class SimpleArraySumSolution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            if (ar.size() != n) {
                throw new IllegalArgumentException("Expected " + n + " elements, got " + ar.size());
            }

            System.out.println(ResultSimpleArraySum.simpleArraySum(ar));
        }
    }
}

class ResultSimpleArraySum {
    /**
     * Returns the sum of elements in the list
     * @param ar the list of integers to be summed
     * @return the sum of the elements, or 0 if the list is empty
     */
    public static int simpleArraySum(List<Integer> ar) {
        int arraySum = 0;

        for (int number : ar) {
            arraySum += number;
        }
        return arraySum;
    }
}
