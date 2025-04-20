package ExerciseSheet1;
import java.net.StandardSocketOptions;
import java.util.Scanner;

public class SnakeLanguageTranslator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = sc.nextLine();
        StringBuilder sb = new StringBuilder(word);

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            sb.append(ch);
            if ("aeiouAEIOU".contains(String.valueOf(ch))) {
                sb.append("s").append(ch);

            }
        }System.out.println("Snake Translator :" + sb);
        sc.close();
    }
}
