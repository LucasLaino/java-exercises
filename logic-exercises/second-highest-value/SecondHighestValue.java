public class SecondHighestValue {
    /**
     * Finds the second highest distinct value in the array in a single pass, without sorting.
     * @param numbers the array to search; may contain duplicates and negative values
     * @return the second highest distinct value in the array
     * @throws IllegalArgumentException if the array has no second distinct vale
     *         (e.g. all elements are equal)
     */
    int secondHighest(int[] numbers) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                secondHighest = highest;
                highest = numbers[i];
            } else if (numbers[i] > secondHighest && numbers[i] != highest) {
                secondHighest = numbers[i];
            }
        }

        if (secondHighest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("The array has no distinct second value");
        }

        return secondHighest;
    }

    public static void main(String[] args) {
        SecondHighestValue solver = new SecondHighestValue();

        System.out.println(solver.secondHighest(new int[]{5, 3, 9, 9, 1}));

        try {
            solver.secondHighest(new int[]{4, 4, 4});
        } catch (IllegalArgumentException e) {
            System.out.println("Expected exception: " + e.getMessage());
        }
    }
}
