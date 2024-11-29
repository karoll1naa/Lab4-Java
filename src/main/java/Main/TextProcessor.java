package Main;
import java.util.Comparator;

public class TextProcessor {
    public void sortSentencesByWordCount(Text text) {
        text.getSentences().sort(Comparator.comparingInt(Sentence::getWordCount));
        System.out.println("Sentences in order of increasing number of words:");
        for (Sentence sentence : text.getSentences()) {
            System.out.println(sentence);
        }
    }
}
