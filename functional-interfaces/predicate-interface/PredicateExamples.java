import java.util.List;
import java.util.function.Predicate;

/**
 * Demonstrates the main methods of {@link java.util.function.Predicate}:
 * {@code test}, {@code and}, {@code or}, {@code negate} and {@code Predicate.not},
 * plus its use with {@code Stream.filter}.
 */
public class PredicateExamples {

    /**
     * Runs each example and prints the result. The expected value
     * is written in a comment next to each call.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println(isEven.test(2)); // true
        System.out.println(isEven.test(-2)); // true
        System.out.println(isEven.test(-25)); // false

        System.out.println(isEven.negate().test(6)); // false

        System.out.println(isEven.and(isPositive).test(0)); // false
        System.out.println(isEven.and(isPositive).test(-4)); // false

        System.out.println(isEven.or(isPositive).test(3)); // true

        Predicate<String> isNotBlank = Predicate.not(String::isBlank);
        System.out.println(isNotBlank.test("Java")); // true
        System.out.println(isNotBlank.test("  ")); // false

        List<Integer> numbers = List.of(10, -2, -25, 3);
        List<Integer> result = numbers.stream()
                .filter(isEven.and(isPositive))
                .toList();

        System.out.println(result); // [10]
    }
}
