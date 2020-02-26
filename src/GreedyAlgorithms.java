import java.util.Arrays;
import java.util.Collections;

//найти наибольшее число из представленого массива
public class GreedyAlgorithms {
    public static void main(String[] args) {
        int[] digits = {1, 5, 2, 7, 9, 9};
        System.out.println(maxNumberFromDigits(digits));
    }
    public static String maxNumberFromDigits(int[] digits) {
        Arrays.sort(digits);
        String result = "";
        for (int i = digits.length - 1; i >= 0; i--) {
            result += digits[i];
        }
        return result;
    }
    public static String maxNumberFromDigitsViaJava8(int[] digits) {
    return String.join("", Arrays.stream(digits).boxed()
            .sorted(Collections.reverseOrder())
            .map(String::valueOf)
            .toArray(String[]::new));
    }
}
