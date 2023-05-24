public class TaskOne {
    public static void main(String[] args) {
        int[] numbers = {10002, 293, 123, 4352, 96354, 816, 992, 984, 884, 38};

        System.out.println("Четные числа:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("Нечетные числа:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }

        }
    }
}
