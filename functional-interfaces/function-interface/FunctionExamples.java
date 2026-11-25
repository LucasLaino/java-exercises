import java.util.List;
import java.util.function.Function;

/**
 * Demonstrates the main methods of {@link java.util.function.Function}:
 * {@code apply}, {@code andThen}, {@code compose} and {@code identity},
 * plus its use with {@code Stream.map}.
 */
public class FunctionExamples {

    /**
     * Runs each example and prints the result. The expected value
     * is written in a comment next to each call.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        Function<String, Integer> stringLength = s -> s.length();
        Function<Integer, Integer> doubledValue = n -> n * 2;
        Function<String, String> sameValue = Function.identity();

        System.out.println(sameValue.apply("Java")); // Java
        System.out.println(stringLength.apply("Java")); // 4
        System.out.println(doubledValue.apply(2)); // 4

        System.out.println(stringLength.andThen(doubledValue).apply("Spring")); // 12. Runs stringLength first
        System.out.println(doubledValue.compose(stringLength).apply("Interface")); // 18. Runs stringLength first

        List<Integer> stringList = List.of("Java", "Spring", "Quarkus").stream()
                .map(stringLength.andThen(doubledValue))
                .toList();

        System.out.println(stringList); // [8, 12, 14]
    }
}
