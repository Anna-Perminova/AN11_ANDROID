import java.util.*;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше предложение: ");
        String text = scanner.nextLine();
        Map<String, Integer> countTheWord = new TreeMap<>();
        for (String word : text.split(" ")) {
            int oldCount = countTheWord.getOrDefault(word, 0);
            int newCount = oldCount + 1;
            countTheWord.put(word, newCount);
        }
        System.out.println(countTheWord);

        class Word {
            Integer count = 0;
            String word;

            Word(Integer count, String word) {
                this.count = count;
                this.word = word;
            }
        }
    }
}

