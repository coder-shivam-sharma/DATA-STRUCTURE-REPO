import java.io.*;
import java.util.*;

class Result {

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1); // Months are 0-based in Calendar
        cal.set(Calendar.DAY_OF_MONTH, day);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        return days[dayOfWeek - 1];
    }
}

public class FindDayProblem {
    public static void main(String[] args) throws IOException {
        // Use Scanner or BufferedReader for input
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        sc.close();

        // Call the method
        String result = Result.findDay(month, day, year);

        // Print the result
        System.out.println(result);
    }
}
