import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numberArray = numbers.split(",|\n");
        List<Integer> negativeNumbers = new ArrayList<>();

        for (String number : numberArray) {
            if (!number.trim().isEmpty()) {
                int num = Integer.parseInt(number.trim());
                if (num < 0) {
                    negativeNumbers.add(num);
                } else if (num <= 1000) {
                    returnValue += num;
                }
            }
        }

        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers);
        }

        return returnValue;
    }
}
