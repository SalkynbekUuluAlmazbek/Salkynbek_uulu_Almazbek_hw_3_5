public class TaskThree {
    public static void main(String[] args) {
        String[] words = {"переменная", "функция", "метод", "аргумент",
                "параметр", "привязка", "длина", "высота", "размер"};

        System.out.println("Гласные буквы:");
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                if (isVowel(letter)) {
                    System.out.print(letter + " ");
                }
            }
        }

        System.out.println("\nСогласные буквы:");
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                if (!isVowel(letter) && Character.isLetter(letter)) {
                    System.out.print(letter + " ");
                }
            }
        }
    }

    public static boolean isVowel(char letter) {
        letter = Character.toLowerCase(letter);
        return letter == 'а' || letter == 'е' || letter == 'ё'
                || letter == 'и' || letter == 'о' || letter == 'у'
                || letter == 'ы' || letter == 'э' || letter == 'ю' || letter == 'я';
    }
}

