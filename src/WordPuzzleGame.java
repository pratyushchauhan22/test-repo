
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordPuzzleGame {

    public static String shuffleWord(String word) {
        List<Character> chars = new ArrayList<>();
        for (char c : word.toCharArray()) {
            chars.add(c);
        }
        Collections.shuffle(chars);
        StringBuilder shuffledWord = new StringBuilder();
        for (char c : chars) {
            shuffledWord.append(c);
        }
        return shuffledWord.toString();
    }

    public static int printPuzzleQuestion(String word, int score) {
        String problemWord = shuffleWord(word);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nArrange the letters to form a valid word:");
        System.out.println(problemWord);
        String userWord = scanner.nextLine().toUpperCase();
        System.out.println();

        if (userWord.equals(word)) {
            System.out.println("Correct");
            score++;
        } else {
            System.out.println("Wrong");
            score--;
        }
        return score;
    }

    public static void main(String[] args) {
        int score = 0;
        List<String> words = new ArrayList<>();
        words.add("MOUSE");
        words.add("APPLE");
        words.add("NATION");
        Collections.shuffle(words);

        for (String word : words) {
            score = printPuzzleQuestion(word, score);
        }

        System.out.println("Your Score is " + score);
        System.out.println();
    }
}
