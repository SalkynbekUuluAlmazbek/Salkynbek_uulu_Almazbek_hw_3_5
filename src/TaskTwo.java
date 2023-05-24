public class TaskTwo {
    public static void main(String[] args) {
        int[] numbers = {12001, 29384, 12384, 909345, 34289, 001, 002, 003};

        int sumOfEvenNumbers = 0;
        int productOfOddNumbers = 1;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sumOfEvenNumbers += number;
            } else {
                productOfOddNumbers *= number;
            }
        }

        System.out.println("Сумма четных чисел: " + sumOfEvenNumbers);
        System.out.println("Произведение нечетных чисел: " + productOfOddNumbers);
    }
}

