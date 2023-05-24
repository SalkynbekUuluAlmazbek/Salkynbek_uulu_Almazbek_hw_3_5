import java.util.ArrayList;
import java.util.List;

public class TaskFour {
    public static void main(String[] args) {
        String[] words = {"java", "kotlin", "python", "javascript",
                "nodejs", "go", "react", "react native", "swift"};

        List<Character> vowels = new ArrayList<>();
        List<Character> consonants = new ArrayList<>();

        for (String word : words) {
            for (char letter : word.toCharArray()) {
                if (isVowel(letter)) {
                    vowels.add(letter);
                } else if (Character.isLetter(letter)) {
                    consonants.add(letter);
                }
            }
        }

        System.out.println("Гласные буквы:");
        for (char vowel : vowels) {
            System.out.print(vowel + " ");
        }

        System.out.println("\nСогласные буквы:");
        for (char consonant : consonants) {
            System.out.print(consonant + " ");
        }

        String word1 = createWordFromLetters(vowels, consonants);
        String word2 = createWordFromLetters(vowels, consonants);

        System.out.println("\nСлово 1: " + word1);
        System.out.println("Слово 2: " + word2);
    }

    public static boolean isVowel(char letter) {
        letter = Character.toLowerCase(letter);
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }

    public static String createWordFromLetters(List<Character> vowels, List<Character> consonants) {
        StringBuilder wordBuilder = new StringBuilder();

        for (int i = 0; i < vowels.size() && i < 2; i++) {
            wordBuilder.append(vowels.get(i));
        }

        for (int i = 0; i < consonants.size() && i < 2; i++) {
            wordBuilder.append(consonants.get(i));
        }

        return wordBuilder.toString();
    }
}

