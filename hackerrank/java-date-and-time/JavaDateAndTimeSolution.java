import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Locale;

class Result {
    /**
     * Returns the day of week of a date, in capital letters.
     * @param month the month, from 1 (January) to 12 (December)
     * @param day the day of the month
     * @param year the year
     * @return the day of week in English, such as "MONDAY"
     */
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);

        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH).toUpperCase();
    }
}

/**
 * HackerRank - Java Date and Time
 * https://www.hackerrank.com/challenges/java-date-and-time/problem
 *
 * Reads a date in MM DD YYYY format and prints its day of the week in
 * capital letters, using java.util.Calendar. Unlike the hackerRank template,
 * which writes the result to the file set in {@code OUTPUT_PATH}, this version
 * prints it to standard output so it can run locally.
 */
public class JavaDateAndTimeSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        System.out.println(Result.findDay(month, day, year));

        bufferedReader.close();
    }
}
