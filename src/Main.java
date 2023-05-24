import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {9991, 821923, 2832, 22, 1120, 9, 3, 33, 1233};

        List<Integer> numberList = Arrays.asList(numbers);

        Collections.sort(numberList, Collections.reverseOrder());

        for (Integer number : numberList) {
            System.out.println(number);
        }
    }
}
